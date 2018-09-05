
/**
 * Shai Caspin
 * 10/30/16
 * Carrboro High School (NCVPS)
 * Program 215b - faster than a speeding bullet
 * 
 * Description: This program calculates the maximum height (and the time at the moment) reached when a bullet is 
 *              shot directly upwards. The program uses both loops and conditional formatting based on the
 *              assumptions the bullet is shot at 960 ft/sec, gravity is -16feet/sec^2, and the bullet is shot from
 *              a height of zero feet.
 * What I learned: I learned how to use an If Else conditional statement.
 * Difficulties: I was going to use calculus/physics to figure out the max height, but realized that way I
 *               wouldn't need the conditional formatting, so I used this trick instead which sees when the
 *               velocity reaches zero.
 */

public class VerticalBullet
{
    public static void main(String[] args)
    {
        //VARIABLES
        int time = 1; //at 0, the height is zero, so it doesn't really matter
        int height, pastHeight=0, difference; //declare variables
        
        do {
            height = (960*time)-(16*time*time); //Calculation of height based on known velocity of 960 feet/sec
            difference = height - pastHeight; 
            
            /**The difference is positive on the way up since height is gained withe very second
             * Once the difference is negative, the height starts decreasing.
             * By spotting when this happens, we can find the maximum height and time.
             */
           
            if (difference < 0) //only first time when difference is less than 0
            {
                System.out.print("The maximun height reached by the bullet is " + pastHeight+ " feet after " 
                                  +(time-1)+ " seconds.");
            }
            else
            {
                pastHeight = height; //redefine the past height
            }
            
            time++; //increment time by a second (can be by smaller intervals, but not necessary)
        } while (difference > 0);
        
        System.out.print("The maximun height reached by the bullet is " + pastHeight+ " feet after " 
                                  +(time-1)+ " seconds.");
   }
}
/**
 * Output
 * 
 * The maximun height reached by the bullet is 14400 feet after 30 seconds.
 * 
 */