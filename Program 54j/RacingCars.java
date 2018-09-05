/**
 * Shai Caspin
 * 09/21/16
 * Program 54j - racing cars
 * 
 * Description: This program calculates the difference in times of two cars racing around the diameter of the earth,
 *              one at sea level, and one 15 feet about sea level.
 * What I learned: I learned that conversions really suck in code where you have to prove everything done.
 * Difficulties: The resulting time difference seems very smalll so I thought there was something wrong with the 
 *               program, but I couldn't find anything worng. So I really don't know
 * 
 */
public class RacingCars
{
  public static void main(String[] args)
  {
    final double PI = 3.14159 ; //declaring constant for PI
    final int diameterEarth = 8000 ;//miles constant for eart diameter
    int speed = 70 ;//miles per hour
    double speedAdjusted = (double)speed * 5280 / 3600 ; //converts feet per second
    
    int diameterRedCar = diameterEarth * 5280 ;// feet, path for  red car
    int diameterBlueCar = diameterRedCar + 30 ; // feet, radius of path for blue car
    
    //Calculate distance of path around Earth for both cars by using diameter = 2*PI*Radius
    double distanceTraveledRed = (double) diameterRedCar * PI ; //feet
    double distanceTraveledBlue = (double) diameterBlueCar * PI ; //feet
   
    double distanceDifference = distanceTraveledBlue - distanceTraveledRed ;
    double timeDifference = distanceDifference / speedAdjusted ;//time= distance/ velocity
    
    System.out.println("The blue car crosses the finish line " +  timeDifference + " seconds after the red car.") ;
}
}
/**
 * Sample output
 * 
 * The blue car crosses the finish line 0.9179970779782766 seconds after the red car.
 *
 */