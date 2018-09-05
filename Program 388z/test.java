
/**
 * Shai Caspin
 * Last edited 02/08/17
 * Rock Paper Scissors Game Program 388z
 * 
 * DEscription: This game plays rock paper scissors against the computer (random generator) any number of times based on user preference.
 *
 ***Note I used 4 classes instead of 3 since I wanted an additional class for the overall game with any given number of rounds,
 ***in addition to the simpler "game" object for any individual game played
 */

public class test
{
    public static void main()
    {
        Battle bigGame = new Battle();
        bigGame.Battle();
    }
}
/**
 * Sample output
 * 
Enter the players name: Shai
How many rounds?4
Enter your throw(1=Rock, 2=Paper, 3=Scissors): 1
Shai throws Rock
Computer throws Scissors
You won this game! But you have yet to win the battle.

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 2
Shai throws Paper
Computer throws Paper
It's a tie, throw again

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 3
Shai throws Scissors
Computer throws Paper
You won this game! But you have yet to win the battle.

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 4
Shai throws N/A
Computer throws Rock
Game not working

You won! Great job :)
 * 
 * 
 * 
Enter the players name: Shai
How many rounds?9
Enter your throw(1=Rock, 2=Paper, 3=Scissors): 1
Shai throws Rock
Computer throws Rock
It's a tie, throw again

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 2
Shai throws Paper
Computer throws Paper
It's a tie, throw again

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 3
Shai throws Scissors
Computer throws Scissors
It's a tie, throw again

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 1
Shai throws Rock
Computer throws Rock
It's a tie, throw again

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 2
Shai throws Paper
Computer throws Scissors
The computer won this game

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 3
Shai throws Scissors
Computer throws Scissors
It's a tie, throw again

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 1
Shai throws Rock
Computer throws Scissors
You won this game! But you have yet to win the battle.

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 2
Shai throws Paper
Computer throws Rock
You won this game! But you have yet to win the battle.

Enter your throw(1=Rock, 2=Paper, 3=Scissors): 3
Shai throws Scissors
Computer throws Scissors
It's a tie, throw again


You won! Great job :)
 */