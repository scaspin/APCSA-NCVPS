
/**
 * Shai Caspin
 * 02/08/17
 * Rock Paper Scissors Prog 388z
 * 
 * This is the player program for the project that gets input from the player regarding decisions
 * 
 */

import java.util.Scanner;

public class Player
{
    private static String playerName;
    private static String playerThrow;
    
    private static Scanner input = new Scanner(System.in);
    
    /**
     * Constructor methods both void and name
     * 
     */
    public Player()
    {   
    }
    public void Player(String n)
    {
        playerName = n;
    }
    
    /**
     * Mutator method to establish anme after object was already creates
     */
    public void setName(String n)
    {
        playerName = n;
    }
    
    /**
     * Method to prompt user for throw and does not return anything
     */
    public static void makeThrow()
    {
        System.out.print("Enter your throw(1=Rock, 2=Paper, 3=Scissors): ");
        int throwInt = input.nextInt();
        if (throwInt ==1)
            playerThrow = "Rock";
        else if (throwInt == 2)
            playerThrow = "Paper";
        else if (throwInt==3)
            playerThrow = "Scissors";
        else
        {
            playerThrow = "N/A";
        }

    }
    
    /**
     * Return throw as a string after throw was already amde
     */
    public String getThrow()
    {
        return playerThrow;
    }
    
    /**
     * Give string answer sentence based on name and throw
     */
    public String stringThrow()
    {
       return playerName + " throws " + playerThrow;
    }
    
    
}
