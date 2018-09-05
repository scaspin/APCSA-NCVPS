
/**
 * Shai Caspin
 * 02/08/17
 * OOD 2 - carnival code
 * 
 * This is the tester code for a carnival with players and different game booths.
 */

public class Carnival
{
    public static void main(String[] args)
    {
        GameBooth balloonDartToss = new GameBooth (2, "tiger plush", "sticker");
        GameBooth ringToss = new GameBooth (2, "bear keychain", "pencil");
        GameBooth breakAPlate = new GameBooth(1.5, "pig plush", "plastic dinosaur");
        Player shonda = new Player(5); //$5 spending money..1
        Player luis = new Player(3); //$3 spending money
        System.out.print("Shonda goes to Balloon Dart Toss. ");
        System.out.println(shonda.play(balloonDartToss));
        System.out.print("Luis goes to Ring Toss. ");
        System.out.println(luis.play(ringToss));
        System.out.print("Shonda goes to Ring Toss. ");
        System.out.println(shonda.play(ringToss));
        System.out.print("Luis goes to Break A Plate. ");
        System.out.println(luis.play (breakAPlate));
        System.out.println("Shonda won: " + shonda.showPrizes() );
        System.out.println("Luis won: " + luis.showPrizes());
        System.out.println(shonda.info());
        System.out.println("The number of awards given in the ringToss booth is " + ringToss.prizesAwarded());
    }
}

/**
 * Sample output
 *
Shonda goes to Balloon Dart Toss. prize won: sticker
Luis goes to Ring Toss. prize won: pencil
Shonda goes to Ring Toss. prize won: pencil
Luis goes to Break A Plate. Sorry, not enough money to play.
Shonda won: pencil sticker null
Luis won: pencil null
 *
 *
 *
Shonda goes to Balloon Dart Toss. prize won: sticker
Luis goes to Ring Toss. prize won: pencil
Shonda goes to Ring Toss. prize won: pencil
Luis goes to Break A Plate. Sorry, not enough money to play.
Shonda won: pencil sticker null
Luis won: pencil null
The player has $1.0 left to spend, and has won pencil sticker null
The number of awards given in the ringToss booth is: 
The number of first place prizes awarded is 0 and number of consolation prizes is 2

 */
