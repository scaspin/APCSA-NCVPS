
/**
 * Shai Caspin
 * 01/21/17
 * Carrboro High School NCVPS
 * 
 * This class tests methods created under the Circle and Rectangle classes/objects.
 */
public class testClass
{
    public static void main(String[] args)
    {
        //test circle class
        Circle spot = new Circle();
        spot. setRadius(3);
        System.out.println("Circle radius: " + spot. getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
        Circle. displayAreaFormula();
        /***************************************************/
        Circle spot1 = new Circle(3);
        Circle spot2 = new Circle(4);
        
        if (spot1.equals(spot2))
        {
         System.out.println("Objects are equal.");
        }
         else
        {
         System.out.println("Objects are not equal.");
        }
         System.out.println(spot1);
         System.out.println(spot2);
        
        //test rectangle class
        Rectangle box = new Rectangle(3,4);
        box.setLength(8);
        System.out.println("\nRectangle area: "+box.area());
        System.out.println("Rectangle circumference: " + box.circumference());
        Rectangle.displayAreaFormula();
        
        /***************************************************/
        
        Rectangle box1 = new Rectangle(3,5);
        Rectangle box2 = new Rectangle (5,3);
        if (box1.equals(box2))
        {
        System.out.println("Objects are equal.");
        }
         else
        {
         System.out.println("Objects are not equal.");
        }
        System.out.println(box1);
        System.out.println(box2);
      
   }
}
/**
 * Sample Output
 * 
Circle radius: 3.0
Circle circumference: 18.84
The formula for the area of a circle is a=Pi*r*r
Objects are not equal.
Circle has radius 3.0
Circle has radius 4.0

Rectangle area: 24
Rectangle circumference: 22
The formula for the area of a rectangle is A=width*length
Objects are equal.
Rectangle has sides of length 3, and 5
Rectangle has sides of length 5, and 3
 * 
 * 
 * 
 */