/**
* Circle class.
* Shai Caspin
* 01/21/17
* Carrboro High School (NCVPS)
* 
* To see sample output using this class, refer to testClass class.
*
*/
public class Circle
{
    private static final double PI = 3.14;
    private double radius;
    
    /** 
     * Default constructor
     */
    public Circle()
    {
        radius = 1; //default radius
    }
    
    /**
     * constructor
     */
    public Circle(double r)
    { 
        radius = r;
    }
    
    /**
    * Changes the radius of the circle.
    * 
    */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    
    /**
    * Calculates the area of the circle
    */
    public double area()
    {
     double circleArea;
     circleArea = PI * radius * radius;
     return circleArea;
    }
    
    /**
    * Returns the radius of the circle.
    */
    public double getRadius()
    {
     return (radius);
    }
    
    /**
     * Calculates and returns the circumference of the circle
     **/
    public double circumference()
    {
        double circumference = 2 * PI * radius;
        return circumference;
    }
     
    /**
     * Displays area formula
     */
    public static void displayAreaFormula()
    {
       System.out.println("The formula for the area of a circle is a=Pi*r*r");
    }
    
    /**
     * Determines whether two circles are equal
     * Objects compared using the == operator are equal only if they refer to the same object. The == operator compares the referenc es of the
     * objects, not the data stored by the objects as the equals() methods does.
     */

    public boolean equals(Circle c)
    {
        Circle testObj = c;
        if (testObj.getRadius() == radius)
        {
             return(true);
         }
        else
        {
             return(false);
        }
    }
    
    /** 
     * Returns a String that represents the Circle object. 
     */
    public String toString()
    {
       String circleString ="Circle has radius " + radius;
       return circleString;
    }
}
      
        