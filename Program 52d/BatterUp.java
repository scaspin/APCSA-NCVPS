
/**
 * Shai Caspin
 * Carrboro High School
 * 09/21/16
 * Program 52d - Batter Up
 * 
 * Description: This program gets user input regarding name, times at bat, number of hits, and number of walks of a player
 *              and calculates the batting average and on base percentage of said player and displays it in an output.
 * What I leanred: I learned to define input cells right after the output for instructions so the input can be writter on the same line.
 * Difficulties: I had a bit of a hard time with the baseball terminology, but I think I understand it now.
 */

//importing classes for user input
import java.io.* ;
import java.util.* ;

public class BatterUp
{
    public static void main(String args[])
    {
        Scanner battingInput = new Scanner(System.in) ; //Declaring class allowing for use input
        
        System.out.print("Enter the player's name: ") ; //Player name
        String playerName = battingInput.nextLine() ;
        
        System.out.print("Enter number of times at bat: ") ; //Times at bat
        int playerAtBat = battingInput.nextInt() ;
       
        System.out.print("Enter number of hits: ") ; //Hits
        int playerHits = battingInput.nextInt() ;
        
        System.out.print("Enter numer of walks: ") ; //Walks
        int playerWalks = battingInput.nextInt() ;
        
        int playerOfficialAtBat = playerAtBat - playerWalks ; //Find offical at bats by subtracting walks from times at bat
        
        int averageBatting = (int)((double) playerHits / playerOfficialAtBat * 1000) ; //Batting Average calculations (number of hits per 1000)
        double onBasePercentage = (double) (playerHits + playerWalks) / playerAtBat * 100; //On base precentage
       
        //Output final display
        System.out.println("\nThe player " + playerName + " \nhas a batting average of " + averageBatting + 
                            "\nand an on base percentage of " + onBasePercentage + " percent.");
                            
   
    }
}
/**
 * Sample output
Enter the player's name: Shai Caspin
Enter number of times at bat: 400
Enter number of hits: 29
Enter numer of walks: 5

The player Shai Caspin 
has a batting average of 73
and an on base percentage of 8.005 precent.



Enter the player's name: Mr. Zaengle
Enter number of times at bat: 900
Enter number of hits: 400
Enter numer of walks: 200

The player Mr. Zaengle 
has a batting average of 571
and an on base percentage of 66.66666666666666 percent.

 */