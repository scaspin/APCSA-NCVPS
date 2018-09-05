
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/30/16
 * Program 209b - throwing three dice
 * 
 * Description: There is a belief among dice players that in throwing three dice a ten is easier to get than a nine.  
 *              This program was written to either prove or discprove their belief by finding all the possibilities
 *              of getting either one, and counting how many there were.
 * What I learned: I learned how to use conditional statements within iterated loops.
 * Difficulties: I didn't really run into any difficulties :)
 */
public class ThreeDice
{
    public static void main(String[] args)
    {
        //DECLARE AND INITIALIZE VARIABLES
        int sumDices, nineCounter=0, tenCounter=0;
        
        //Each loop changes the number thrown by one of the dice.
        for (int diceOne=1; diceOne<7; diceOne++)
        {
           for (int diceTwo=1; diceTwo<7; diceTwo++)
           {
               for (int diceThree=1; diceThree<7; diceThree++)
               {
                   sumDices = diceOne + diceTwo + diceThree ;
                   
                   //counters are incremented only when the sum is equal to either 9 or ten respectively
                   if (sumDices == 9)
                   {
                       nineCounter++;
                    }
                   else if (sumDices == 10)
                   {
                       tenCounter++;
                    }
                   
                   //Nothing is done if the sum does not equal 9 or 10 
               } 
           }
        }
        
        //Prints result of whether probabilities are the same or different.
        System.out.println("Out of 216 different possibilites: ");
        System.out.println("-There are " + nineCounter + " possible ways to get nine with three dice.");
        System.out.println("-There are " + tenCounter + " possible ways to get ten with three dice.");
    }
}

/**
 * Output
 * 
Out of 216 different possibilites: 
-There are 25 possible ways to get nine with three dice.
-There are 27 possible ways to get ten with three dice.
 *
 *
 */