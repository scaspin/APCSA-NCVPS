
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 11/10/16
 * PRogram 202t- Calendar Crazy Extra Credit Program
 * 
 * Decription: This program produces what a mock calendar page would look like for one month with a given number of days and an input from the user
 *              regarding which day of the week the month starts on.
 * What I learned: I learned how to use counters in decision making statements.
 * Difficulties: The formatting was very tedious but I eventually got it.
 * 
 * 
 * THE FORMATTING IN THE SAMPLE OUTPUT IS WONKY, BUT WHEN THE PROGRAM IS RUN, THE FOMATTING ALLIGNS THE COLLUMNS PERFECTLY WITH THE HEADERS FOR THE DAYS.
 * 
 */

import java.util.*;
import java.io.*;

public class CalendarCrazy
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //GET USER INPUT
        System.out.print("First day of the month (1=sunday,2=monday,etc...): ");
        int firstDay= input.nextInt();
        
        System.out.print("Number of days in the month: ");
        int totalDay= input.nextInt();
        
        //HEADER OF DIFFERENT DAYS OF THE WEEK
        System.out.println("    Sunday           Monday         Tuesday        Wednesday       Thursday         Friday         Saturday");
        
        
        //INITIALIZE COUNTER FOR NUM OF NUMBERS IN ONE LINE
        int space=0;
        
        //THE NUMBER OF BLANK DAYS BEFORE THE FIRST ONE
        for (int i=1; i<=firstDay-1; i++)  //USE FIRST DAY-1 BECUASE OTHERWISE IT WOULD BE THE DAY AFTER THE FIRST DAY
        { 
            System.out.print("\t\t"); // EQUIVALENT TO 8 SPACES
            space++;
        } 
        
        
        //PRINT THE ACTUAL NUMBERS OF THE DAYS FROM 1 UNTIL THE LAST ONE
        for (int day=1; day<=totalDay; day++)  
        { 
            
            // PRINT NUMBER AND COUNT NUM OF NUMBERS IN A LINE
            System.out.print(EasyFormat.format(day,8,0)+"\t");
            space++;
            
            //AFTER THERE ARE 7 NUMBERS (OR SPACE) IN A ROW, START A NEW ROW
            if (space%7 == 0) 
            { 
                System.out.println(); 
            }  
        }  
    } 
}
/**
 * Sample output (the formatting is off when copy and pasted into BlueJ, but the actual output is wellformatted!
 * 
First day of the month (1=sunday,2=monday,etc...): 3
Number of days in the month: 31
    Sunday           Monday         Tuesday        Wednesday       Thursday         Friday         Saturday
                               1           2           3           4           5    
       6           7           8           9          10          11          12    
      13          14          15          16          17          18          19    
      20          21          22          23          24          25          26    
      27          28          29          30          31    
 *
 *
 *
First day of the month (1=sunday,2=monday,etc...): 6
Number of days in the month: 30
     Sunday           Monday         Tuesday        Wednesday       Thursday         Friday         Saturday
                                                                   1           2    
       3           4           5           6           7           8           9    
      10          11          12          13          14          15          16    
      17          18          19          20          21          22          23    
      24          25          26          27          28          29          30    

 *
 *
 *
First day of the month (1=sunday,2=monday,etc...): 6
Number of days in the month: 32
    Sunday           Monday         Tuesday        Wednesday       Thursday         Friday         Saturday
                                                                   1           2    
       3           4           5           6           7           8           9    
      10          11          12          13          14          15          16    
      17          18          19          20          21          22          23    
      24          25          26          27          28          29          30    
      31          32    
 *
 *
 */
