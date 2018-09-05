/**
 * Shai Caspin
 * 10/30/16
 * Carrboro High School (NCVPS)
 * Program 215c - don't fence me in
 * 
 * Description: You want to build a fence for your livestock and use your neighbors fence for one side.  
 *              You only have 100 yards of fencing material. You want to build the fence to produce the 
 *              largest rectangular area possible.  This program determines the largest area 
 *              you could attain with the 100 yards of fencing material while using your neighbor's fence 
 *              for the fourth side.
 * What I learned: I learned how to use an If Else conditional statement within a loop.
 * Difficulties: I was going to use calculus to figure out the max area, but realized that way I
 *               wouldn't need the conditional formatting, so I used this trick instead which sees when the
 *               rate of change would change from positive to negative, which is calculus without the formal
 *               derivative taking, since we always increment the sidelength by 1 yard.
 */

public class FenceOptimization
{
    public static void main(String[] args)
    {
        //DECLARE AND INITIALIZE VARIABLES
        int sideLength = 1; 
        int pastArea=0, area, difference; 
        
        do {
            area = sideLength * (100-(2*sideLength)); //calculate area
            difference = area-pastArea; 
           
            if (difference < 0) //only works fornfirst time when difference is less than 0
            {
                sideLength--;
                System.out.print("A rectangle the size " + sideLength+ " X "+(100-2*sideLength)+
                                 " yards produces the maximum area of " +pastArea+ " square yards.");
            }
            else
            {
                pastArea = area; //redefine the past area to be this area
            }
            
            sideLength++; //increment time by a yard (can be by smaller intervals, but not necessary in this case)
        }
        while (difference > 0); 
        
    }
}
/**
 * Output
 * A rectangle the size 25 X 50 yards produces the maximum area of 1250 square yards.
 */