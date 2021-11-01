/*
Name: Bethany Hampton
File Name: Sphere.java 
Creation Date: 10/31/2021
Notes: Comments could likely be less repetitive but I wanted to make sure that I had enough detail.
*/

package seng3120_geometry_calculator_gradle_java;

public class Sphere {

    //Sphere calculation methods
    //method to find sphere surface area
    public double surfaceArea(int rad)
    {
        //setting surfaceArea as a double to calculation
        //formula: A=4πr2
        double surfaceArea = Math.PI * 4 * Math.pow(rad, 2);
        //not void- returning surfaceArea as double
        return surfaceArea;
    }

    //method to find sphere volume
    public double volume(int rad)
    {
        //setting volume as a double to calculation
        //formula: V=4/3πr3
        double volume = (4/3)* Math.PI * rad * rad * rad;
        //not void- returning volume as double
        return volume;
    }
}
