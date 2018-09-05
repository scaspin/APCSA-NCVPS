
/**
 * Shai Caspin
 * Carrboro High scholl 12/21/16
 * Program 671-Elapased time
 * 
 * Description:You have just been hired by a company to do it’s weekly payroll.  One of the functions you 
 *             must perform daily is to check the employee time cards and compute the elapsed time between 
 *             the time they “punch in” and “punch out”.  You also have to sometimes convert hours to minutes, 
 *             days to hours, minutes to hours and hours to days.  Since you’ve just finished your first 
 *             programming class you decide to write a program that will help you do your job.
 * What I learned: I learned how to implement the Switch method and how to create different functions within a class
 * Difficulties: SO MUCH CODE
 */

import java.util.*;
import java.io.*;

public class Program671a
{
    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args)
    {
        System.out.println("Please choose one of the following conversion tasks:\n"); 
        System.out.println("1.Hours -> minutes\n2.Days -> hours\n3.Minutes -> hours\n4.Hours -> days\n5.Elapsed time between two times" );
        System.out.print("\nEnter a number from the menu: ");
        int choice = input.nextInt();
        
        //Goes to different functions based on choice and then ends program
        switch (choice)
        {
            case 1: hoursToMinutes();
                    break;
            case 2: daysToHours();
                    break;
            case 3: minutesToHours();
                    break;
            case 4: hoursToDays();
                    break;
            case 5: elapstedTime();
                    break;      
            default: break; 
                
            //I chose to get input and print within each function because return a string value was complicated
          }

    }
    
    //function to convert hours to minutes
    public static void hoursToMinutes()
    {
        System.out.println("\n---------------------------");
        System.out.println("Hours To Minutes Conversion");
        System.out.println("---------------------------");
        
        System.out.print("\nEnter number of hours: ");
        double hours = input.nextDouble();
        
        double minutes = hours *60.0;
        System.out.print("The number of minutes in " + hours + " hours is " + minutes);
        
    }
    
    //function to convert days to hours
    public static void daysToHours()
    {
        System.out.println("\n------------------------");
        System.out.println("Days To Hours Conversion");
        System.out.println("------------------------");
        
        System.out.print("\nEnter number of days: ");
        double days = input.nextDouble();
        
        double hours = days *24;
        System.out.print("The number of hours in " + days + " days is " + hours);
        
    }
    
    //minutes to hours
    public static void minutesToHours()
    {
        System.out.println("\n---------------------------");
        System.out.println("Minutes To Hours Conversion");
        System.out.println("---------------------------");
        
        System.out.print("\nEnter number of minutes: ");
        double minutes = input.nextDouble();
        
        double hours = minutes/60;
        System.out.print("The number of hours in " + minutes + " minutes is " + hours);
    }
    
    //hours to days
    public static void hoursToDays()
    {
        System.out.println("\n------------------------");
        System.out.println("Hours To Days Conversion");
        System.out.println("------------------------");
        
        System.out.print("\nEnter number of hours: ");
        double hours = input.nextDouble();
        
        double days = hours/24;
        System.out.print("The number of days in " + hours + " hours is " + days);
        
    }
    
    //elapased time
    public static void elapstedTime()
    {
        System.out.println("\n------------");
        System.out.println("Elapsed Time");
        System.out.println("------------");
        
        System.out.print("Enter the beginning hour: ");
        int hourStart = input.nextInt();
        System.out.print("Enter the beginning minutes: ");
        int minuteStart = input.nextInt();
        System.out.print("am or pm? ");
        String start = input.next();
        
        System.out.print("Enter the ending hour: ");
        int hourEnd = input.nextInt();
        System.out.print("Enter the ending minutes: ");
        int minuteEnd = input.nextInt();
        System.out.print("am or pm? ");
        String end = input.next();
        
        //changes the hours entered to military time
        if (start.equals("pm"))
        {
            hourStart = 12 +hourStart;
        }
        if (end.equals("pm"))
        {
            hourEnd = 12 +hourEnd;
        }
        
        int hoursElapsed = hourEnd - hourStart;
        int minuteElapsed = minuteEnd - minuteStart;
        
        //makes sure no negative hours or numbers occur
        if (minuteElapsed<0)
        {
            hoursElapsed = hoursElapsed - 1;
            minuteElapsed = 60 + minuteElapsed;
        }
        if (hoursElapsed<0)
        {
            hoursElapsed = 24-hoursElapsed;
        }
        
        //print
        System.out.println("The elapsed time is "+ hoursElapsed+ " hours and " + minuteElapsed + " minutes.");
    }
}
/**
 * Sample Output
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 5

------------
Elapsed Time
------------
Enter the beginning hour: 8
Enter the beginning minutes: 14
am or pm? am
Enter the ending hour: 2
Enter the ending minutes: 47
am or pm? pm
The elapsed time is 6 hours and 33 minutes.
 * 
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 1

---------------------------
Hours To Minutes Conversion
---------------------------

Enter number of hours: 5
The number of minutes in 5.0 hours is 300.0
 * 
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 2

------------------------
Days To Hours Conversion
------------------------

Enter number of days: 20
The number of hours in 20.0 days is 480.0
 * 
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 3

---------------------------
Minutes To Hours Conversion
---------------------------

Enter number of minutes: 890
The number of hours in 890.0 minutes is 14.83
 * 
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 4

------------------------
Hours To Days Conversion
------------------------

Enter number of hours: 567
The number of days in 567.0 hours is 23.625
 * 
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 5

------------
Elapsed Time
------------
Enter the beginning hour: 9
Enter the beginning minutes: 36
am or pm? am
Enter the ending hour: 4
Enter the ending minutes: -5
am or pm? pm
The elapsed time is 6 hours and 19 minutes. 
 * 
 * 
 * 
Please choose one of the following conversion tasks:

1.Hours -> minutes
2.Days -> hours
3.Minutes -> hours
4.Hours -> days
5.Elapsed time between two times

Enter a number from the menu: 5

------------
Elapsed Time
------------
Enter the beginning hour: 8
Enter the beginning minutes: 2
am or pm? pm
Enter the ending hour: 8
Enter the ending minutes: 2
am or pm? am
The elapsed time is 12 hours and 0 minutes.

 * 
 * 
 * 
Enter the beginning hour: 12
Enter the beginning minutes: 35
am or pm? am
Enter the ending hour: 5
Enter the ending minutes: 9
am or pm? am
The elapsed time is 16 hours and 34 minutes.

 */