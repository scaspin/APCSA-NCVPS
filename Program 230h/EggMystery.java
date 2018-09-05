
/**
 * Shai Caspin
 * 10/31/16
 * Carrboro High School (NCVPS)
 * Program 230h - Egg mystery
 * 
 * Description: This program was written to solve the following problem: I have a basket of fresh eggs! 
 *              When I remove 2 eggs at a time I end up with 1 egg remaining in the basket.
 *              When I remove 3 eggs at a time I end up with 2 eggs remaining in the basket.
 *              When I remove 4 eggs at a time I end up with 3 eggs remaining in the basket.
 *              When I remove 5 eggs at a time I end up with 4 eggs remaining in the basket.
 *              When I remove 6 eggs at a time I end up with 5 eggs remaining in the basket.
 *              When 7 eggs are removed at a time, no eggs remain!!!  
 *              What is the least number of eggs I could have had in the basket?
 * What I learned: I learned how to use multiple conditions in one if statement using the && signs and 
 *                 worked on my skills writing loops with boolean expressions.
 * Difficulties: I tried to use iterated loops to get the right numbers of eggs in each condition, as to set 
 *               a loop for the number used to divide the number of eggs, but that ended up being complicated,
 *               so I decided to do this instead since it's much simpler to write and execute.
 */
public class EggMystery
{
    public static void main(String[] args)
    {
        
        int numEggs = 0; //We know number has to be multiple of 7, starting at other numbers would distort this
        boolean leastFound = false; //condition for loop to execute
        
        while (leastFound == false) //until the least number is found
        { 
            if (numEggs%2==1 && numEggs%3==2 && numEggs%4==3 && numEggs%5==4 && numEggs%6==5)
            //All conditions must be met for number to be viable
            {
               System.out.println("The smallest number of eggs the basket can contain is " + numEggs + ".");
               leastFound = true; //changes expression so loop won't execute
            }
           
            numEggs+=7; //increased by 7 every time because we know number must be multiple of 7
        }
    }
}
/**
 * Sample output
 *
The smallest number of eggs the basket can contain is 119.
 *
 */ 

