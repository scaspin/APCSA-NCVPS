
/**
 * Shai Caspin
 * Carrboro HS (NCVPS)
 * 09/20/16
 * AP Computer Science A
 * 
 * Description: This program calculates the amount of land on a donut shaped island.
 * What I learned: I leanred how to use constants in calculations
 * Difficulties: I had a bit of a hard time keeping up with the variable names since they are all very long,
 *               but overall I didn't have too many difficulties.
 * 
 */
public class DonutIsland
{
    public static void main(String args[])
    {
        final double PI = 3.14159 ; //Assign constant Pi
        double outerDiameter = 4.16 ; //miles
        double outerRadius = outerDiameter / 2 ; //Radius is used in calculations, miles
        double lakeRadius = 0.95 ; //miles
        
        //Calculations for area
        double outerIslandArea = PI * outerRadius * outerRadius ; // miles squared
        double lakeArea = PI * lakeRadius * lakeRadius ; //miles squared
        
        double cultivatableLandArea = outerIslandArea - lakeArea ; //Subtract lake area from entire area of island
        double cultivatableLandAreaRounded = (int)(cultivatableLandArea * 100 + 0.5)/100.00; //rounded to the second decimal place
        
        
        //Displaying result
        System.out.println("Donut Island with a diameter of " + outerDiameter + 
        " miles\ncontaining a circular lake of radius of " + lakeRadius +
        "\nhas " + cultivatableLandAreaRounded + " square miles of cultivatable land.");
        
    }
}
/** 
 * Sample output
   Donut Island with a diameter of 4.16 miles
   containing a circular lake of radius of 0.95
   has 10.76 square miles of cultivatable land.
 */