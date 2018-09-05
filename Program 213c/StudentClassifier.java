
/**
 * Shai Caspin
 * 11/14/16
 * Carrboro High School (NCVPS)
 * Program 213c- if then student classifier
 * 
 * Description:This program determines whether a college student is a freshman, sophomore, junior, or senior based on 
 *             the number of units that the student has completed.
 * What I learned: I learned how to use boolean statements in loop conditions.
 * Difficulties:It took me a while to figure out how to do the condition again, but I got it!
 */

import java.util.*;
import java.io.*;


public class StudentClassifier
{
   public static void main(String[] args)
   {
       //GET USER INPUT OF STUDENT NUMBER AND NUM OF CREDITS
       Scanner input = new Scanner(System.in);
       
       //DECLARE VARIABLES FOR LOOP
       int studentNum ;
       double creditNum;
       int classCode;
       String answer ; 
       
       //Do While loop so grade is calculated multiple times for multiple students as long as the user keeps resonding y
       do
       {
           //GET VARIABLES FOR SPECIFIC RUN
           System.out.print("\nEnter student number: ");
           studentNum = input.nextInt();
           System.out.print("Enter number of credits: ");
           creditNum = input.nextDouble();
           
           //TEST WHICH CLASS THE STUDENT IS IN
           if (creditNum<70)
           {
               if (creditNum<30)
                  classCode = 1;
               else
                  classCode = 2;
            }
            else
            {
                if (creditNum<90)
                  classCode = 3;
               else
                  classCode = 4;
            }
           
            //DISPLAY THE GRADE OF THE STUDENT
           System.out.print("Grade level code is " +classCode); 
           
           //ASK USER WHETHER THEY WANT TO CALCULATE ANOTHER
           System.out.print("\nDo again? (enter y/n) ");
           answer = input.next();
          
       } while ("y".equals(answer));
    }
}

/**
 * Sample output
 * 
 * 
Enter student number: 2352
Enter number of credits: 30
Grade level code is 2
Do again? (enter y/n) y

Enter student number: 3639
Enter number of credits: 29.9
Grade level code is 1
Do again? (enter y/n) y

Enter student number: 4007
Enter number of credits: 70
Grade level code is 3
Do again? (enter y/n) y

Enter student number: 49915
Enter number of credits: 103.7
Grade level code is 4
Do again? (enter y/n) n
 * 
 * 
 * 
Enter student number: 1245829
Enter number of credits: 40
Grade level code is 2
Do again? (enter y/n) y

Enter student number: 0
Enter number of credits: 567
Grade level code is 4
Do again? (enter y/n) y

Enter student number: 10
Enter number of credits: 0
Grade level code is 1
Do again? (enter y/n) n
 * 
 * 
 * 
Enter student number: 56789
Enter number of credits: 29.999
Grade level code is 1
Do again? (enter y/n) y

Enter student number: 23
Enter number of credits: 39.9999999
Grade level code is 2
Do again? (enter y/n) y

Enter student number: 2345
Enter number of credits: 99
Grade level code is 4
Do again? (enter y/n) n
 * 
 */