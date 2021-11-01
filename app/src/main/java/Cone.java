/*
Name: Bethany Hampton
File Name: Cone.java 
Creation Date: 10/31/2021
Notes: Comments could likely be less repetitive but I wanted to make sure that I had enough detail.
*/

package seng3120_geometry_calculator_gradle_java;

public class Cone {

    //Cone calculation methods
    //method to find cone volume
    public double volume(int rad, int hgt)
    {
        //setting volume as a double to calculation
        //formula: V=πr2h/3
        double volume = Math.PI * rad * rad * (hgt / 3);
        //not void- returning volume as double
        return volume;
    }

    //method to find cone slant
    public double slant(int rad, int hgt)
    {
        //setting slant as a double to calculation
        //formula: l=squared(r2+h2)
        double slant = Math.sqrt(rad * rad + hgt * hgt);
        //not void- returning slant as double
        return slant;
    }

    //method to find cone surface area
    public double surfaceArea(int rad, int hgt)
    {
        //setting surfaceArea as a double to calculation
        //formula: A=πr(r+squared(h2+r2))
        double surfaceArea = Math.PI * rad * (rad * Math.sqrt(hgt * hgt + rad * rad));
        //not void- returning surface area as double
        return surfaceArea;
    }

    //method to find cone lateral surface area
    public double latSurfaceArea(int rad, int hgt)
    {
        //setting latSurfaceArea as a double to calculation
        //formula: AL=πr*squared(h2+r2)
        double latSurfaceArea = Math.PI * rad * (Math.sqrt(hgt * hgt + rad * rad));
        //not void- returning lateral surface area as double
        return latSurfaceArea;
    }
}
