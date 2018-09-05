
/**
 * Shai Caspin
 * 11/14/16
 * Carrboro HS (NCVPS)
 * Program 213d (weather forecasting)
 * 
 * Description:It is a belief by some that the common field cricket chirps are in direct proportion to the current 
 *             temperature.  To get the temperature in Fahrenheit, add 40 to the number of times a cricket chirps in 
 *             a minute and divide by 4.
 * What I learned: I learned how to use string conditions.
 * Difficulties: None
 */

import java.util.*;
import java.io.*;

public class WeatherForecasting
{
    public static void main(String[] args)
    {
        //GET INPUT FROM USER
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter cricket chirps per minute: ");
        int chirpPerMin = input.nextInt();
        
        
        //CALCULATE ACTUAL TEMPS IN F AND C
        double fTemp = (chirpPerMin + 40) / 4.00 ;
        double cTemp = (int)((fTemp-32)*5/9*10+0.5)/10.00;
        
        String severity;
        
        //GET ASSOCIATED STRING WITH TEMP
        if (fTemp<=80)
        {
            if (fTemp<=45)
                severity = "Burr-rrrr";
            else if (fTemp<=64)
                severity = "Take a jacket";
            else 
                severity = "Ah-hhhh";   
        }
        else
        {
            if (fTemp<=108)
                severity = "Whew";
            else 
                severity = "Dead Cricket";   
        }

        //PRINT OUTPUT
        System.out.println("Degrees in Fahrenheit: " + fTemp);
        System.out.println("Degrees in Celsius: " + cTemp);
        System.out.print("The condition outside is: " + severity);
    }
}

/**
 * Sample Output
 * 
 * 
Enter cricket chirps per minute: 20
Degrees in Fahrenheit: 15.0
Degrees in Celsius: -9.3
The condition outside is: Burr-rrrr 
 * 
 * 
 * 
Enter cricket chirps per minute: 180
Degrees in Fahrenheit: 55.0
Degrees in Celsius: 12.8
The condition outside is: Take a jacket
 * 
 * 
 * 
Enter cricket chirps per minute: 240
Degrees in Fahrenheit: 70.0
Degrees in Celsius: 21.1
The condition outside is: Ah-hhhh
 * 
 * 
 * 
Enter cricket chirps per minute: 480
Degrees in Fahrenheit: 130.0
Degrees in Celsius: 54.4
 *
 *
 *
Enter cricket chirps per minute: 200
Degrees in Fahrenheit: 60.0
Degrees in Celsius: 15.6
The condition outside is: Take a jacket
 *
 *
 *
Enter cricket chirps per minute: 1
Degrees in Fahrenheit: 10.25
Degrees in Celsius: -12.0
The condition outside is: Burr-rrrr
 *
 */