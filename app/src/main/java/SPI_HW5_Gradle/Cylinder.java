/*
Name: Bethany Hampton
File Name: Cylinder.java 
Creation Date: 10/31/2021
Notes: The calculation methods here have float returns as indicated in instructions.
*/

package seng3120_geometry_calculator_gradle_java;

public class Cylinder {

    //Cylinder calculation methods
    //method to find cylinder surface area
    public float surfaceArea(int rad, int hgt)
    {
        //setting surface area as a double to calculation
        //formula: A=2πrh+2πr2
        double surfaceArea = 2 * Math.PI * rad * hgt + 2 * Math.PI * Math.pow(rad, 2);
        //not void- returning surfaceArea
        return (float)surfaceArea;
    }

    //method to find cylinder volume
    public float volume(int rad, int hgt)
    {
        //setting volume as a double to calculation
        //formula: V=πr2h
        double volume = Math.PI * rad * rad * hgt;
        //not void- returning volume as float
        return (float)volume;
    }

    //method to find cylinder lateral surface area
    public float latSurfaceArea(int rad, int hgt)
    {
        //setting latSurfaceArea as a double to calculation
        //formula: A=2πrh
        double latSurfaceArea = 2 * Math.PI * rad * hgt;
        //not void- returning lateral surface area as float
        return (float)latSurfaceArea;
    } 

    //method to find cylinder base surface area
    public float baseSurfaceArea(int rad)
    {
        //setting baseSurfaceArea as a double to calculation
        //formula: A=πr2
        double baseSurfaceArea = Math.PI * rad * 2;
        //not void- returning base surface area as float
        return (float)baseSurfaceArea;
    }
}