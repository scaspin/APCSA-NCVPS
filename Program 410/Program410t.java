
/**
 * Shai Caspin
 * 03/03/2017
 * Carrboro High School (NCVPS)
 * Program 410t-Household Income Report
 * 
 * Description: The results of a survey of the households in your township have been made available. Each 
 *              record contains data for one household, including a four-digit integer identification number, 
 *              the annual income for the household, and the number of members of the household. Write a 
 *              program to read the survey results into three arrays, echo print the data and perform and 
 *              output the following analyses:
 *              1.  Count the number of households included in the survey and print a three-column table displaying the data read in (assume no more than 25 households)
 *              2.  Calculate the average household income, and list the identification number and income of each household that exceeds the average.
 *              3.  Determine the percentage of households having incomes below the poverty level.  The poverty level income may be computed using the formula:  p= $3750.00 + $750.00 * (m-2) where m is the number of members of each household.
 * What I learned: How to use arrays in combination with counters and loops.
 */

import java.util.*;
import java.io.*;
public class Program410t
{
    public static void main(String[] args)
    {
       //Define all arrays, counters, and totalling variables 
       int[] id = new int[25];
       int[] income = new int[25];
       int[] members = new int[25];
       int incomeTotal=0;
       int incomeAvg;
       int count=0;
       int countBelowPov=0;
        
       //Set up scanner to input data
       Scanner inFile = null; //establish scanner
       try 
       {
            // define the scanner to read the file
             inFile = new Scanner (new File("survey2.dat"));
            
       } 
       catch (FileNotFoundException e) //output if file cannot be found
       {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
    
       }
       
       //Run through the data and assign data on each house to appropriate variables
       System.out.println("ID\tIncome\tMembers");
       while (inFile.hasNext())
       {
           //Get info line by line and display variables
           id[count] = inFile.nextInt();
           income[count] = inFile.nextInt();
           members[count] = inFile.nextInt();
           
           //output for first table
           System.out.println(id[count]+"\t"+income[count]+"\t"+members[count]);
           
           //counts for table 2
           incomeTotal = incomeTotal + income[count];
           
           
           //See if below poverty level
           if ((3750+(750*(members[count]-2)))>income[count])
           {
               countBelowPov++;
            }
           
           //upgrade count
           count++;
       }
       
       System.out.println("----------------------------");
       
       //Calculate average income and print those above average eincome
       incomeAvg = incomeTotal/(count);
       System.out.println("Household with income exceeding the average $"+incomeAvg);
       for (int i = 0; i<25; i++)
       {
           if (income[i]>incomeAvg)
           {
               System.out.println(id[i]+"\t"+income[i]+"\t"+members[i]);
            }
        }
        
       System.out.println("----------------------------");
       
       //Print out precetage below poverty level for their household
       System.out.println("Percent of household below poverty level is "+(countBelowPov/((double)count)));
    }
}
    
/**
 * Sample output
 * 
ID	Income	Members
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1
----------------------------
Household with income exceeding the average $12707
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
----------------------------
Percent of household below poverty level is 0.07692
 * 
 */