
/**
 *
 * 
 * This is the program that establishes the overall characteristics of the battle, 
 * which consists of multiple rock paper scissors games. Sample output included in tester class
 * 
 */
import java.util.Scanner;

public class Battle
{
    //Creates object battle which has characteristics such as name a(of player) and number of rounds. 
     public void Battle()
     {
         //USER INPUT TO ESTABLISH PLAYER OBJECT
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the players name: ");
         String name = input.nextLine();
         Player player = new Player();
         player.Player(name);
         
         
         System.out.print("How many rounds?");
         int rounds = input.nextInt();
         
         
         Game battle = new Game();
         //Runs a certain number of individual games and output result based on winners.
         for (int i=1; i<=rounds; i++)
         {
             player.makeThrow();
             System.out.println(player.stringThrow());
             
             battle.makeCompThrow();
             System.out.println(battle.getCompthrow());
             System.out.println(battle.announceWinner(player.getThrow()));
            }
         
         //Displays overall winner as counter by the game class   
         System.out.print(battle.bigWinner());   
        }
}
