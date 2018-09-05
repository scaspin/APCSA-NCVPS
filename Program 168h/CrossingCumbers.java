
/**
 * Shai Caspin
 * 10/22/16
 * Carrboro HS (NCVPS)
 * Program 168h (challenging crossing cumbers)
 * 
 * Description: This program produces a giant x made of x's, printing 21 rows witht eh middle of the x 
 *              being on the 11th line.
 * What I learned: I learned the importance of having to write down and plan out the program ahead of time.
 * Difficulties: After writing this program, I tried to combine all three parts of the program into 1 using
 *               conditional statements for the 11th row and absolute values of rows, but that got too complicated
 *               so I reverted my design to this one, which works!
 */

public class CrossingCumbers
{
   public static void main(String[] args)
   {
     //TOP HALF OF THE X
     for (int row=1; row<=10 ; row++) //10 rows with two stars
     {
         System.out.println();
         for (int i = 1; i<(row); i++) //spaces before first x
         {
             System.out.print(" ");
          }
          
         System.out.print("x"); //first x
         
         for (int i = 1; i<((11-row)*2); i++) //space between two Xs
         {
             System.out.print(" ");
          }
          
         System.out.print("x");//second x
       }
    
  
     //MIDDLE STAR ON 11TH LIKE (This loop isn't necessary since we know the distance)
     System.out.println(); //new line
     for (int i = 1; i<=10; i++) //spaces before middle x
         {
             System.out.print(" ");
          }
     System.out.print("x"); //middle x
     
     //BOTTOM HALF OF THE X
     for (int row=10; row>0 ; row--) //starts inverse of top half of the x
     {
         System.out.println();
         for (int i = 1; i<row; i++)
         {
             System.out.print(" ");
          }
          
         System.out.print("x");//first x
         
         for (int i = 1; i<((11-row)*2); i++) //space between exes
         {
             System.out.print(" ");
          }
          
         System.out.print("x");//second x
       }
 }
}
/**
 * Sample output
 * 
x                   x
 x                 x
  x               x
   x             x
    x           x
     x         x
      x       x
       x     x
        x   x
         x x
          x
         x x
        x   x
       x     x
      x       x
     x         x
    x           x
   x             x
  x               x
 x                 x
x                   x
 */