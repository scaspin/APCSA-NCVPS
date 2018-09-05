
/**
 * Shai Caspin
 * 02/08/17
 * Rock Paper Scissors Prog 388z
 * 
 * This is the game program that generates the computer's response to player input and announces winners 
 * of both the individual games and the overall winenr of the battle.
 * 
 */

import java.util.Random;

public class Game
{
    private String compThrow;
    private String playerThrow;
    private String tempWinner;
    private int playerWins;
    private int computerWins;
    
    private Random rnd = new Random();
    
    /**
     * Default constructor to establish game
     * 
     */
    public void Game()
    {
    }
    
    /**
     * Get the computer to throw their choice of rock, paper, or scissors, based on a random generator
     * Return the string value of their throw
     */
    public String makeCompThrow()
    {
        int compInt = rnd.nextInt(3)+1;
        if (compInt == 1)
        {
            compThrow = "Rock";
        }
        else if (compInt == 2)
            compThrow = "Paper";
        else {
            compThrow = "Scissors";
        }
        return compThrow;
    }
    
    /**
     * Returns a string with the actual throw of the computer as a sentence rather than individual throw
     */
    public String getCompthrow()
    {
        return "Computer throws " + compThrow;
    }
    
    /**
     * Returns the winner and a message of each individual game based on string results
     */
    public String announceWinner(String pt)
    {
        
        if (compThrow.equals(pt))
            return "It's a tie, throw again\n";
        else if ( (compThrow.equals("Rock") && pt.equals("Scissors")) || (compThrow.equals("Paper") && pt.equals("Rock")) || (compThrow.equals("Scissors") && pt.equals("Paper")) )
        {
            computerWins++;
            return "The computer won this game\n";
        }
        else if ((compThrow.equals("Rock") && pt.equals("Paper"))  || (compThrow.equals("Paper") && pt.equals("Scissors")) || (compThrow.equals("Scissors") && pt.equals("Rock")) )
        {
            playerWins++;
            return "You won this game! But you have yet to win the battle.\n";
        }
        else
            return "Game not working";
    }
    
    /**
     * Connotates string for winners of the overall game
     * 
     */
    public String bigWinner()
    {
        if (computerWins==playerWins)
            return "The results of the overall game is a tie!"; 
        else if (computerWins>playerWins)
            return "The computer won this game! Better luck next time";
        else
        {
           return "\nYou won! Great job :)";
        }
    }
    
}
