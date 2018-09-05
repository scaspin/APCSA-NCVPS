
/**
 * Shai Caspin
 * Carrboro High School
 * 11/10/16
 * Program 212a
 * 
 * Description:A freight train travelling 50 mph leaves at 9 o'clock. A passenger train going the same direction on parallel tracks starts at 11 
 *             o'clock going 80 mph.  When will the passenger train overtake the freight train? This program finds that out and allows for different
 *             inputs of the speed of the passenger train and calculates at what time it will overtake the freight train.
 * What I learned: I learned how to use deicision statements and loops where the loops depended on calculations.
 * Difficulties: I initially did not use loops at all, and merely calculated the time needed using algebra, but eventually realized that was not the prompt.
 */

import java.util.*;
import java.io.*;

public class PassingTrains
{
   public static void main(String[] args)
   {
       //Declare scanner class
       Scanner input = new Scanner(System.in);
       
       //GET USER INPUT REGARDING SPEED OF THE PASSENGER TRAIN
       System.out.print("Enter the speed of the passenger train: ");
       final double PASS_TRAIN_SPEED = input.nextInt();
       
       //DECLARE FINAL SPEED OF FREIGHT TRAIN
       final double FREIGHT_TRAIN_SPEED = 50;
       
       //IDECLARE VARIABLES FOR LOOP CONTROL
       int time =0 ;
       double distanceFreightTrain;
       double distancePassTrain;
       
       
       if (PASS_TRAIN_SPEED<=FREIGHT_TRAIN_SPEED) //The pass train will never pass the freight train if it moves at a lower or same pase
       {
           System.out.println("The passenger train will never pass the freight train.");
        }
       else
       {
           do //calculate the time needed for the train to catch up
           { 
               time++ ;
               distanceFreightTrain = FREIGHT_TRAIN_SPEED * time ;
               distancePassTrain = PASS_TRAIN_SPEED * (time-2) ;
          
            } while (distanceFreightTrain>distancePassTrain); //all done while pass train is after the freight train
           
           //Add 9 to the time to account for the train starting at 9, then modulus by 12 to get actual time 
           time = (time+9)%12;
           
           if (time==0)
           {
               time = 12;
            }
       
           if (distanceFreightTrain==distancePassTrain) 
           {
                System.out.println("The passenger train passed the freight train at " + time + " o'clock" );
            }
           else
           {
                //Java always rounds down decimals, so the int yield would be the lower bound
                System.out.println("The passenger train passed the freight train between " + time + " and "+ (time+1)+" o'clock.");
            }
        }
       
       //OUTPUT 
       System.out.println("The freight train was traveling at " + FREIGHT_TRAIN_SPEED +" miles per hour.");
       System.out.println("The passenger train was traveling at " + PASS_TRAIN_SPEED +" miles per hour.");
      
    }
}
/**
 * Sample output
 * 
 * 
Enter the speed of the passenger train: 75
The passenger train passed the freight train at 3 o'clock
The freight train was traveling at 50.0 miles per hour.
The passenger train was traveling at 75.0 miles per hour.
 * 
 * 
 * 
Enter the speed of the passenger train: 80
The passenger train passed the freight train between 3 and 4 o'clock.
The freight train was traveling at 50.0 miles per hour.
The passenger train was traveling at 80.0 miles per hour.
 * 
 * 
 * 
Enter the speed of the passenger train: 85
The passenger train passed the freight train between 2 and 3 o'clock.
The freight train was traveling at 50.0 miles per hour.
The passenger train was traveling at 85.0 miles per hour.
 * 
 * 
 * 
Enter the speed of the passenger train: 30
The passenger train will never pass the freight train.
The freight train was traveling at 50.0 miles per hour.
The passenger train was traveling at 30.0 miles per hour.
 *
 * 
 * 
Enter the speed of the passenger train: 60
The passenger train passed the freight train at 9 o'clock
The freight train was traveling at 50.0 miles per hour.
The passenger train was traveling at 60.0 miles per hour.
 *
 *
 *
Enter the speed of the passengar train: 50
The passenger train will never pass the freight train.
The freight train was traveling at 50.0 miles per hour.
The passenger train was traveling at 50.0 miles per hour.

 */

