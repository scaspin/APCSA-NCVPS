
/**
 * Shai Caspin
 * Carrboro HS (NCVPS)
 * 09/20/16
 * Program 54c-Circles
 * 
 * Description: This program takes a given radius and calculates the area and perimeter of a circle with said radius.
 *              Results are rounded to the thousands decimal place and displayed.
 * What I learned: I leanred how to declare constants using the final assignment.
 * Difficulties: I was trying to find a way to square the radius instead of just mulitplying it twice.
 * 
 */
 
public class Circles
{ 
  public static void main(String args[])
  {
      double radius = 3.712 ; //declaring and assigning input. Input changes depending on need
      final double PI = 3.14159 ; //declaring constant Pi for calculations
      
      //Calculations for are and circumference of circle
      double area = PI * radius * radius ;
      double circumference = 2 * PI * radius ;
      
      //Rounding of values
      double areaRounded = (int)(area * 1000 + 0.5)/1000.00;
      double circumferenceRounded = (int)(circumference * 1000 + 0.5)/1000.00;
      
      //Displaying results
      System.out.println("The radius of the circle is " + radius + ".") ;
      System.out.println("The area of the circle is " + areaRounded + ".") ;
      System.out.println("The circumference of the circle is " + circumferenceRounded + ".") ;
   
    }
}

/** Sample output for different radii
 *
 *The radius of the circle is 3.712.
 *The area of the circle is 43.288.
 *The circumference of the circle is 23.323.
 *
 *The radius of the circle is 4.0.
 *The area of the circle is 50.265.
 *The circumference of the circle is 25.133.
 *
 *The radius of the circle is 21.0.
 *The area of the circle is 1385.441.
 *The circumference of the circle is 131.947.
 *
 *The radius of the circle is 15.6.
 *The area of the circle is 764.537.
 *The circumference of the circle is 98.018.
 */
