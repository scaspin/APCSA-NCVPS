
/**
 * Shai Caspin
 * 03/03/17
 * Carrboro High School (NCVPS)
 * Program 432a-galactic weight
 * 
 * Description:As space travels venture to the various planets and the moon in our galaxy their weight 
 *             will vary.  Write a program that will convert the users weight on earth to their weight 
 *             on a selected planet or the earth's moon.  They should be prompted to enter their weight 
 *             and select a planet by number from a list of planets.  Range checking should be included 
 *             in your solution. This program should continue to run until the user selects the quit option.
 * What I learned: How to sue the same index for different arrays.
 *  
 */

import java.io.*;
import java.util.*;

public class Program432a
{
    //Setting up reference arrays
    private static double[] ratio = {0.27,0.85,0.16,0.38,2.64,1.17,1.12,0.25};
    private static String[] planet = {"Mercury","Venus","Moon","Mars","Jupiter","Saturn","Neptune","Pluto"};
   
    //Variables to define weight calculations by
    private static int planetChoice = 1;
    private static int weight;
    
    public static void main(String[] args){
        
        //Setter that does not really matter since program quits if this number is entered
        while (planetChoice!=9)
        {
            //Set scanner
            Scanner input = new Scanner(System.in);
            
            //GEt user input for planet
            System.out.println("\nConvert your weight on earth to:\n1. Mercury\n2.Venus\n3.Moon\n4.Mars\n5.Jupiter\n6.Saturn\n7.Neptune\n8.Pluto\n9.Quit\n");
            System.out.print("Select a destination by number (or 9 to quit): ");
            planetChoice = input.nextInt();
            if (planetChoice==9)
            {
                //Quit program if user chooses #9
                System.exit(0);
            }
            else if (planetChoice>9)
            {
                //If number is invalid and not 9, program prompts user for another number
                System.out.println("Error-enter a new destination");
                System.out.print("Select a destination by number (or 9 to quit): ");
                planetChoice = input.nextInt();
            }
            
            //GEt user input for weight
            System.out.print("\nEnter your weight: ");
            weight = input.nextInt();
            
            //Print out new weight using other methos
            System.out.println(weight(planetChoice, weight));
        }
        
    }
    
    public static String weight(int c, int w)
    {
        //calculate new weight through index
       double newWeight = ratio[c-1]*(double)w;            
       String newW = "Your weight on "+planet[c-1]+" is " + newWeight;
        
       return newW;
       }
    }
/**
 * Sample output
 * 
Convert your weight on earth to:
1. Mercury
2.Venus
3.Moon
4.Mars
5.Jupiter
6.Saturn
7.Neptune
8.Pluto
9.Quit

Select a destination by number (or 9 to quit): 7

Enter your weight: 160
Your weight on Neptune is 179.2

Convert your weight on earth to:
1. Mercury
2.Venus
3.Moon
4.Mars
5.Jupiter
6.Saturn
7.Neptune
8.Pluto
9.Quit

Select a destination by number (or 9 to quit): 11
Error-enter a new destination
Select a destination by number (or 9 to quit): 8

Enter your weight: 12
Your weight on Pluto is 3.0

Convert your weight on earth to:
1. Mercury
2.Venus
3.Moon
4.Mars
5.Jupiter
6.Saturn
7.Neptune
8.Pluto
9.Quit

Select a destination by number (or 9 to quit): 4

Enter your weight: 90
Your weight on Mars is 34.2

Convert your weight on earth to:
1. Mercury
2.Venus
3.Moon
4.Mars
5.Jupiter
6.Saturn
7.Neptune
8.Pluto
9.Quit

Select a destination by number (or 9 to quit): 9

 * 
 */


