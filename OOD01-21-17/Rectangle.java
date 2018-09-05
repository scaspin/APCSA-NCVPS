
/**
 * Rectangle Class
 * Shai Caspin
 * 01/21/17
 * Carrboro High School (NCVPS)
 *
 * To see sample output using this class, refer to testClass class.
 */
public class Rectangle
{
    private int width;
    private int length;
    
    //default constructor
    public Rectangle()
    {
        width = 1;
        length = 1;
    }
    
    //two variables input
    public Rectangle(int w, int l)
    {
        width = w;
        length = l;
    }
    
    public void setWidth(int w)
    {
        width = w;
    }
    public void setLength(int l)
    {
        length = l;
    }
    
    public int getWidth()
    {
        return width;
    }
    public int getLength()
    {
        return length;
    }
    
    //area of rectangle
    public int area()
    {
        int area = width * length;
        return area;
    }
    
    //circumference of rectangle
    public int circumference()
    {
        int circumference = (width*2)+(length*2);
        return circumference;
    }
    
    //display area formula
    public static void displayAreaFormula()
    {
       System. out. println("The formula for the area of a rectangle is A=width*length");
    }
    
    //find whether rectangles are equal
    public boolean equals(Rectangle c)
    {
        Rectangle testObj = c;
        if ((testObj.getWidth() == width && testObj.getLength() == length) || (testObj.getWidth() == length && testObj.getLength() == width))
        {
             return(true);
         }
        else
        {
             return(false);
        }
    }
    
    //returns String that represents the rectangle
    public String toString()
    {
       String recString ="Rectangle has sides of length " + width+", and " + length;
       return recString;
    }
}
