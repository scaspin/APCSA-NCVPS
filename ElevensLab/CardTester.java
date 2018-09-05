/**
 * This is a class that tests the Card class.
 * Shai Caspin
 * 04/12/2017
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        
        Card card1 = new Card("Queen","hearts",12);
        System.out.println(card1.rank());
        System.out.println(card1.suit());
        System.out.println(card1.pointValue());
        
        Card card2 = new Card("Two","Clubs", 2);
        System.out.println("\n"+card1.matches(card2));
        
        Card card3 = new Card("Ace", "Clover",1);
        System.out.println(card3.   toString());
    }
}
/**
 * Sample output
 * 
 * Queen
 * hearts
 * 12
 *
 * false
 * 
 * Ace of Clover (point value=1)
 * 
 */