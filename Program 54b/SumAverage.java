
/*
 * Shai Caspin
 * Carrboro HS (NCVPS)
 * 09/17/16
 * Sum and average program
 * 
 * Description: this program calculates the sum and average of four integers
 * What I learned: I learned how to use casting in calculations
 * Difficulties: I had a bit of a hard time udnerstanding the instructions since I didn't know if we were
 *               supposed to use the "scan" function to get user input or not, since we haven't covered that in class yet.
 */
public class SumAverage
{
   public static void main(String[] args)
   {
       //Assign the four three digit numbers
       int a = 475;
       int b = 821;
       int c = 369;
       int d = 562;
       
       int sum = a + b + c + d; //calculating sum of four numbers
       double average = (double) sum / 4 ; //calculating average
      
       //printing results
       System.out.println("Thank you for entering four numbers! The results are:\n");
       System.out.println("The sum of the four numbers is " + sum + ".\n");
       System.out.println("The average of the four numbers is " + average + ".");
    }
}
/* Sample output:
 * Thank you for entering four numbers! The results are:
 * 
 * The sum of the four numbers is 2227.
 * 
 * The average of the four numbers is 556.75.
 */
