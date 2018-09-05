
/**
 * Shai Caspin
 * 02/20/17
 * Carrboro HS (NCVPS)
 * Program 433a-20 random numbers
 * 
 * Description: This program selects 20 different random numbers in the range 1-30 and print them out in table form. 
 *              Once a number has been "selected"  it can no longer be used. This program should check the array of 
 *              current values before storing the value and printing it out to make sure it has not already been selected.
 * What I learned: How to create a unique array of random numbers
 * Difficulties: So many loops!
 */

import java.util.Random;
import java.util.Arrays;


public class Program433a
{
    public static void main(String[] args)
    {
         //Declare random generator and overall array
         Random rnd = new Random();
         int[] nums = new int[20];
         
         /**
          * Create the array of length 20 of unique random numbers
          * Inner loops allow for assurance that no numbers are repeated 
          */
         int randomNum = 0;

         for (int i = 0; i<= nums.length-1; i++)
         {
            randomNum = rnd.nextInt(30)+1;
            for (int j = 0; j<=nums.length-1; j++)
            {
                 if (randomNum == nums[j])
                 {
                     randomNum = rnd.nextInt(30)+1;
                     //This extra inner loop make sure that the new number was not alreasy read in the external loop
                     for (int k = 0; k<=j; k++)
                     {
                         if (randomNum == nums[k])
                         {
                             randomNum = rnd.nextInt(30)+1;
                         }
                        }
                 }
            }
            
            //Establishes the actual random number's place in the array
            nums[i] = randomNum;
           
         }
         
         /**
          * Sorting the list of values
          */
         Arrays.sort(nums);
         
         /**
          * Print out the numbers in a 5x4 box with headers
          */
         int count = 0;
         System.out.println("20 RANDOM NUMBERS");
         for (int l = 1; l<=4; l++)
         {
             System.out.println();
             for (int m = 1; m<=5; m++)
             {
                 System.out.print(nums[count]+"\t");
                 count++;
                }
            }
    }
}
/**
 * Sample output
 * 
20 RANDOM NUMBERS

2	3	4	5	6	
10	11	12	15	18	
19	20	21	23	24	
26	27	28	29	30	
 *
 *
 *
20 RANDOM NUMBERS

1	2	3	5	6	
7	8	9	16	17	
19	21	22	23	24	
25	26	27	28	29	
 *
 *
 *
20 RANDOM NUMBERS

1	2	3	4	6	
8	10	12	13	14	
15	18	20	22	23	
24	25	28	29	30	
 *
 */