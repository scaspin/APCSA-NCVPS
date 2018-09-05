
/**
 * Shai Caspin
 * 11/23/16
 * Carrboro High School (NCVPS)
 * Program 213a- WEird Wages
 * 
 * Description: You just started working as a programmer. You've agreed to the following compensation package.
 *      •	You are paid $30 an hour.
 *      •	You earn an extra $25.50 an hour for any part of a day where you work more than 8 hours.  
 *      •	You earn an extra $15 an hour for hours beyond 40 in any one week.  
 *      •	You also earn a 125% bonus on any amount you earn for working on Saturday, and a 50% bonus for working Sunday.
 *      Your input file will be the number of hours you worked each day in the week beginning with Monday.  
 *      This program will continue processing the file to calculate your gross pay for each week worked until the end of file is reached.  
 *      Each line of input will consist of one weeks hours (7 integers per line, each less than or equal to 24).  
 *      Output the gross pay with a dollar sign rounded to the nearest penny for each week worked.
 * What I learned: I learned how to attack complex problems and use porgramming to solve them.
 * Difficulties: THIS PROGRAM WAS HARD to write becuase of all the different parts, so I had to break the problem down to many parts.
 *      
 */

import java.io.*;  
import java.util.*;

public class WeirdWages
{
    public static void main(String[] args)
    {
       //CATCH WHETHER OR NOT FILE ACTUALLY EXISTS
       Scanner inFile = null; //establish file scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog213a.txt"));
           
            } 
       catch (FileNotFoundException e) //output if file cannot be found
            {
            System.out.println ("File not found!");
            // Stop program if no file is found
            System.exit (0);
        }
       
       //PROGRAM RUNS INDIVIDUALLY PER WEEK AS LONG AS THERE ARE MORE NUMBERS IN THE FILE
       int week=0;
       
       while (inFile.hasNext()==true)
       {    
          //DECLARE ALL VARIABLES 
          int day=1;
          int numHours=0;
          int sumHours =0;
          double addOvertimePerDay=0;
          double overtimeTotal=0;
          double addOvertimeTotal=0;
          double bonusSaturday=0;
          double bonusSunday=0;
          
          //EVERYTIME LOOPS STOPS EXECUTING, A WEEK PASSES
          week++; 
          System.out.print("\nHours Worked:  "); //headline
          while (day <= 7)
          {
           addOvertimePerDay=0;
           
           //input hours of new day
           numHours=inFile.nextInt();
           System.out.print(numHours+"  "); //print them
           sumHours = sumHours + numHours ; //count all hours worked that weel
           
           //Adds the extra money oer hours worked over 8 in a single day
           if (numHours>8)
           {
               //calculates addition within one day
               addOvertimePerDay = (25.50*(numHours-8));
            }
           //accumulates total overtime earned epr day in one week 
           overtimeTotal+=addOvertimePerDay;
           
           //special bonuses for saturday (day 6) and sunday (day 7)
           if (day==6)
           {
               bonusSaturday = ((numHours*30.0)+ addOvertimePerDay) * 1.25;
            }
           else if (day==7)
           {
               bonusSunday = ((numHours*30.0)+ addOvertimePerDay) * 0.5;
            }
           
           //counter for day
           day++;
          }   
          
          //Calculates total bonus earned from working over 40 hours in a week
          if (sumHours>40)
          {
              addOvertimeTotal= (sumHours-40)*15.0;
            }
          
          //Calculate total gross pay based on total hours worked and all bonuses   
          double grossPay = (int)(((sumHours*30.0) +  overtimeTotal + bonusSaturday + bonusSunday + addOvertimeTotal)*100.00+0.5)/100.00;
          
          //Print amount
          System.out.println("\nWeek #"+ week + ": $" + grossPay);
       }
       
       //Output when entire file is read
       System.out.print("\nNo more hours worked to analyze.");
    }
}
/**
 * Sample Output
 * 
Hours Worked:  9  8  10  8  9  9  5  
Week #1: $2581.88

Hours Worked:  7  8  8  8  0  8  9  
Week #2: $2033.25

Hours Worked:  6  10  5  0  0  0  0  
Week #3: $681.0

No more hours worked to analyze.
 * 
 * 
 * 
Hours Worked:  9  8  10  8  9  9  5  
Week #1: $2581.88

Hours Worked:  7  8  8  8  0  8  9  
Week #2: $2033.25

Hours Worked:  6  10  5  0  0  0  0  
Week #3: $681.0

Hours Worked:  8  9  11  2  5  17  5  
Week #4: $3295.88

Hours Worked:  8  9  2  2  3  4  5  
Week #5: $1240.5

No more hours worked to analyze.
 * 
 * 
 * 
Hours Worked:  9  8  10  8  9  9  5  
Week #1: $2581.88

Hours Worked:  7  8  8  8  0  8  9  
Week #2: $2033.25

Hours Worked:  6  10  5  0  0  0  0  
Week #3: $681.0

Hours Worked:  8  9  11  2  5  17  5  
Week #4: $3295.88

Hours Worked:  8  9  2  2  3  4  5  
Week #5: $1240.5

Hours Worked:  10  10  10  10  10  10  0  
Week #6: $2844.75

No more hours worked to analyze.
 * 
 * 
 * 
Hours Worked:  9  8  10  8  9  9  5  
Week #1: $2581.88

Hours Worked:  7  8  8  8  0  8  9  
Week #2: $2033.25

Hours Worked:  6  10  5  0  0  0  0  
Week #3: $681.0

Hours Worked:  2  3  4  5  1  6  7  
Week #4: $1170.0

No more hours worked to analyze.
 * 
 */