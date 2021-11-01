/*
Name: Bethany Hampton
File Name: coneTest.java 
Creation Date: 10/31/2021
Notes: Comments could likely be less repetitive but I wanted to make sure that I had enough detail.
*/
package seng3120_geometry_calculator_gradle_java;

//imports 
import org.junit.Test;
import static org.junit.Assert.*;

public class coneTest 
{
    //making new cone object
    //placed in global to avoid code repetition
    Cone classUnderTest = new Cone();

    @Test //setting coneSlant to run as test
    public void coneSlant() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone slant calculation, manually inputting parameters
        //result = calling method slant
        assertEquals(Math.sqrt(1 * 1 + 2 * 2), classUnderTest.slant(1,2), 0.0);
    }

    @Test //setting coneSurfaceArea to run as test
    public void coneSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone surface area calculation, manually inputting parameters
        //result = calling method surfaceArea
        assertEquals(Math.PI * 1 * (1 * Math.sqrt(2 * 2 + 1 * 1)), classUnderTest.surfaceArea(1,2), 0.0);
    }

    @Test //setting coneVolume to run as test
    public void coneVolume() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone volume calculation, manually inputting parameters
        //result = calling method volume
        assertEquals(Math.PI * 1 * 1 *(2/3), classUnderTest.volume(1,2), 0.0);
    }

    @Test //setting coneLatSurfaceArea to run as test
    public void conelatSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone lateral surface area calculation, manually inputting parameters
        //result = calling method latSurfaceArea
        assertEquals(Math.PI * 1 * (Math.sqrt(2 * 2 + 1 * 1)), classUnderTest.latSurfaceArea(1,2), 0.0);
    }
}