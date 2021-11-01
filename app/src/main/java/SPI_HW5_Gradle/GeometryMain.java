/*
Name: Bethany Hampton
File Name: GeometryMain.java 
Creation Date: 10/31/2021
Notes: Comments could likely be less repetitive but I wanted to make sure that I had enough detail.
*/

package seng3120_geometry_calculator_gradle_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
public class GeometryMain {

    private static Cylinder cylinder;
    private static Sphere sphere;
    private static Cone cone;

    //MAIN MENU DISPLAY
    public static void mainMenu() {
        System.out.println("\n" + "1. Cylinder");
        System.out.println("2. Sphere");
        System.out.println("3. Cone");
        System.out.println("0. Exit\n");
    
        //Get user input
        //good use of try/catch to catch errors in user input.
        try {

            //prompting user for input, reading input, and setting to variable
            int userInput = Integer.parseInt(inputOutput("Please select the geometric shape you wish to calculate: "));
            
            //3 for the current code
            if (userInput >= 0 && userInput <=3) 
            {
                //looping through user selection to determine correct methods/calculations
                if (userInput == 1) cylinder();
                if (userInput == 2) sphere();
                if (userInput == 3) cone();

            if (userInput == 0) System.exit(0); //0 = quit
            //else statement for if user input is out of range
            } else {
                System.out.println("Please enter a number from 0 - 3");
                //call menu again
                mainMenu();
            }
            //catch if user entered invalid type
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number from 0 - 3");
            //call menu again
            mainMenu();
        }
    }

    //CYLINDER
    private static void cylinder()
    {
        //printing title for cylinder
        System.out.println("----------------------------------------------------------");
        System.out.println("JAVA PROGRAM TO FIND VOLUME & SURFACE AREA OF A CYLINDER");
        System.out.println("----------------------------------------------------------");

        //prompting user for input, reading input, and setting to variable
        int userRadius = Integer.parseInt(inputOutput("\nPlease enter the radius: " + "\n"));
        int userHeight = Integer.parseInt(inputOutput("\nPlease enter the height: " + "\n"));

        //setting variables to correspondingc cone methods
        //supplying volume, slant, surfaceArea, and latSurfaceArea methods with user inputs (radius and height)
        double volume = cylinder.volume(userRadius, userHeight);
        double latSurfaceArea = cylinder.latSurfaceArea(userRadius, userHeight);
        double baseSurfaceArea = cylinder.baseSurfaceArea(userRadius);

        //displaying results
        System.out.println("\nThe Volume of a Cylinder = " + volume);
        System.out.println("The Lateral Surface Area of a Cylinder = " + latSurfaceArea);
        System.out.println("Top or Bottom (Base) Surface Area of a Cylinder = " + baseSurfaceArea);

        //calling the main menu to displayed after completion
        mainMenu();
    }

    //SPHERE
    private static void sphere()
    {
        //printing title for sphere
        System.out.println("----------------------------------------------------------");
        System.out.println("JAVA PROGRAM TO FIND THE VOLUME AND SURFACE AREA OF A SPHERE");
        System.out.println("----------------------------------------------------------");

        //prompting user for input, reading input, and setting to variable
        int userRadius = Integer.parseInt(inputOutput("\nPlease enter the radius: " + "\n"));

        //setting variables to correspondingc cone methods
        //supplying volume, slant, surfaceArea, and latSurfaceArea methods with user inputs (radius and height)
        double volume = sphere.volume(userRadius);
        double surfaceArea = sphere.surfaceArea(userRadius);

        //displaying results
        System.out.println("\nThe Surface Area of a Sphere = " + surfaceArea);
        System.out.println("The Volume of a Sphere = " + volume);

        //calling the main menu to displayed after completion
        mainMenu();
    }

    //CONE
    private static void cone()
    {
        //printing title for cone
        System.out.println("----------------------------------------------------------");
        System.out.println("JAVA PROGRAM TO FIND THE VOLUME AND SURFACE AREA OF A CONE");
        System.out.println("----------------------------------------------------------");

        //prompting user for input, reading input, and setting to variable
        int userRadius = Integer.parseInt(inputOutput("\nPlease enter the radius: " + "\n"));
        int userHeight = Integer.parseInt(inputOutput("\nPlease enter the height: " + "\n"));

        //setting variables to correspondingc cone methods
        //supplying volume, slant, surfaceArea, and latSurfaceArea methods with user inputs (radius and height)
        double volume = cone.volume(userRadius, userHeight);
        double slant = cone.slant(userRadius, userHeight);
        double surfaceArea = cone.surfaceArea(userRadius, userHeight);
        double latSurfaceArea = cone.latSurfaceArea(userRadius, userHeight);

        //displaying results
        System.out.println("\nThe Volume of a Cone = " + volume);
        System.out.println("The Slant of a Cone = " + slant);
        System.out.println("The Surface Area of a Cone = " + surfaceArea);
        System.out.println("The Lateral Surface Area of a Cone = " + latSurfaceArea);

        //calling the main menu to displayed after completion
        mainMenu();
    }

    //helper method to handle the CLI input.
    //Java doesn't have a graceful built-in way to handle this
    private static String inputOutput(String message) {
        System.out.println(message);
        //creating BufferedReader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String returnString = "";
        //try catch to read input
        try {
            returnString = br.readLine();
        }
        //catch for IOEexception
        catch (IOException e){
            System.out.println("Error reading in value");
            mainMenu();
        }
        return returnString;
    }
        
    public static void main(String[] args) {
        //create objects
        cylinder = new Cylinder();
        sphere = new Sphere();
        cone = new Cone();

        mainMenu();
    }
}
