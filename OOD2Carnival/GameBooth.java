/**
 * Shai Caspin
 * 02/08/18
 * OOD- game booth part of Carnival exercise
 */
import java.util.Random;

public class GameBooth 
{
    private double cost;
    private String firstPrize, consolationPrize;
    private int numFirstPrizes = 0, numConPrizes = 0;
    
    /**
    * constructor
    * pre: none
    * post: A GameBooth object created.
    * The cost and prizes are set.
    */
    public GameBooth(double charge, String p1, String p2)
    {
        cost = charge;
        firstPrize = p1;
        consolationPrize = p2;
    }
    
    /**
    * Game is played and prize * pre: none
    * post: Player had three tries. Player successful all three times received the
    first prize. A consolation prize has been awarded otherwise
    */
    public String start()
    {
        int toss;
        int successes = 0;
       
        Random rand = new Random();
    
        /* play game */
        for (int i = 0; i < 3;i++)
        {
            toss = rand.nextInt(2);
            if (toss == 1)
             successes += 1;
        }
        
        if (successes == 3)
        {
             numFirstPrizes++;
             return(firstPrize);
         }   
        else
        {
             numConPrizes++;
             return (consolationPrize);
             
         }
    }
    
    /**
    * Returns the cost to play the game
    * pre: none
    * post: Cost of the game has been returned
    */
    public double getCost()
    {
        return (cost);
    }
    
    /**
     * Displaying number of awards and award
     * 
     */
    public String prizesAwarded()
    {
        return ("The number of first place prizes awarded is " + numFirstPrizes +" and number of consolation prizes is"+ numConPrizes); 
    }
}