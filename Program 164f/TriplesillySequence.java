
/**
 * Shai Caspin
 * 10/25/16
 * Carrbor High School (NCVPS)
 * Program 164f - Triple Silly Sequence
 * 
 * Description: This program produces squares of numbers from 1 to 10 twice in increasing order 
 *              and once in decreasing order. Each line is executed usoing different types of loops
 *              and the squares are not calculated using multiplication or the square math function,
 *              only using arithmetic operators.
 * What I learned: I reviewed the abilities and charactersists of all loop types.
 * Difficulties: TOO MANY VARIABLES, I resorted to using nondescriptive variable names after a couple of 
 *               mintues becuase of how complicated they ended up being.
 *               I thought the for loop was the easiest to implement, and the Do While loop was easier to
 *               implement after I had already written the while loop.
 */


public class TriplesillySequence
{
   public static void main(String[] args)
   {
       /**
        * Square is redefined in every loop to reset the variable to zero for each new number calculated
        * Different variables are used in each loop 
        * All loops output numbers with a certain # of spaces after to make sure lines are the same
        * EasyFormat could not be used becuase spaces would not look even
        */
       
       //FOR LOOP
       System.out.println("For Loop");
       
       //iterated loops incremented by one to add the number its own number of times
       for (int base = 1; base<=10; base++)
       { 
         int square=0 ;
         for (int j=1; j<=i; j++)
         {
             square = square+i;
         }
         System.out.print(square + "   ");
        }
       
        
       //WHILE LOOP
       System.out.println("\n\nWhile Loop");
       //iterated loops incremented by one to add the number its own number of times
       int k = 10; //starts from 10 and goes towards one
       while (k>0)
       {
           int square = 0;
           int l = k;
           while (l>0)
           {
            square = square+k;
            l--;
           }
           System.out.print(square + "   ");
           k--;
        }
        
       //DO WHILE LOOP
       System.out.println("\n\nDo While Loop");
       int m = 1;
       //iterated loops incremented by one to add the number its own number of times
       do
       {
           int square = 0;
           int n = 0;
           do
           {
               square = square+m;
               n++;
            } while (n<m);
           System.out.print(square + "   ");
           m++;
        } while (m<11);
    }
}
/**
 * Sample output
 * 
For Loop
1   4   9   16   25   36   49   64   81   100   

While Loop
100   81   64   49   36   25   16   9   4   1   

Do While Loop
1   4   9   16   25   36   49   64   81   100   
 *
 *
 */