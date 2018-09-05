
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 09/27/16
 * Program 82c- Road Trip extra credit assignment
 * 
 * Descirption: This program calculates the cost of gas for a road trip based on mpg of the car, mileage of the trip
 *              and the estimated cost of a gallon of gas.
 * What I learned: I leanred how to input doubles.
 * Difficulties: Not many, just debugging.
 */


//allowing input
import java.io.* ;
import java.util.* ;

public class RoadTrip
{
    public static void main(String[] args)
    {
        Scanner tripInfo = new Scanner(System.in); //scanner class
        
        //getting input
        System.out.print("Enter the number of miles to your destination: ");
        double miles = tripInfo.nextDouble();
        System.out.print("Enter estimated cost of gas per gallon: $");
        double dollarsPerGallon = tripInfo.nextDouble();
        System.out.print("Enter miles per gallon of vehicle: ");
        double milesPerGallon = tripInfo.nextDouble();
        
        double cost = (int)(( miles / milesPerGallon * dollarsPerGallon)*100 +0.5)/ 100.00 ;
        
        System.out.println("\nThe cost of traveling "+miles+" miles, in a car that averages "+milesPerGallon+
                            " miles per gallon, \nwith an average cost of $" +dollarsPerGallon+
                            " per gallon of gas would be $" + cost+".");
                           
        
   
    }
}

/**
 * Sample output
Enter the number of miles to your destination: 2974.12
Enter estimated cost of gas per gallon: $1.719
Enter miles per gallon of vehicle: 30

The cost of traveling 2974.12 miles, in a car that averages 30.0 miles per gallon, 
with an average cost of $1.719 per gallon of gas would be $170.42.
 *
Enter the number of miles to your destination: 987656
Enter estimated cost of gas per gallon: $2.10
Enter miles per gallon of vehicle: 25

The cost of traveling 987656.0 miles, in a car that averages 25.0 miles per gallon, 
with an average cost of $2.1 per gallon of gas would be $82963.1.
 */
