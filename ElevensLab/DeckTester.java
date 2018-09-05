/**
 * This is a class that tests the Deck class.
 * 
 * Shai Caspin
 * 04/12/2017
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] suits = {"Hearts","Diamonds","Spades","Clubs"};
        int[] values= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        Deck cards1 = new Deck(ranks,suits,values);
        
        System.out.println(cards1.deal().toString());
        
        String[] suits1 = {"Hearts","Diamonds","Spades","Clubs"};
        int[] values1= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] ranks1 = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        Deck cards2 = new Deck(ranks,suits,values);
        
        System.out.println(cards2.size());
        
        String[] suits2 = {"Hearts","Diamonds","Spades","Clubs"};
        int[] values2= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] ranks2 = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        Deck cards3 = new Deck(ranks,suits,values);
        
        System.out.println(cards3.isEmpty());
        
        
        //********************************************************************************//
        
        String[] suits3 = {"Hearts","Diamonds","Spades","Clubs"};
        int[] values3= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] ranks3 = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        Deck cards4 = new Deck(ranks,suits,values);
        
        System.out.println("Unshuffled deck:\n");
        System.out.println(cards4.toString());
        
        
        cards4.shuffle();
        System.out.println("Shuffle 1:\n");
        System.out.println(cards4.toString());
        
        
        
        
        
        
    }
}
/**
 * Sample output
 * 
 * 5 of Clubs (point value=5)
52
false
Unshuffled deck:

size = 52
Undealt cards: 
4 of Spades (point value=4), 10 of Spades (point value=10), 
5 of Clubs (point value=5), 2 of Diamonds (point value=2), 
King of Clubs (point value=13), King of Diamonds (point value=13), 
3 of Hearts (point value=3), Jack of Spades (point value=11), 
9 of Spades (point value=9), Jack of Hearts (point value=11), 
10 of Clubs (point value=10), 2 of Spades (point value=2), 
5 of Spades (point value=5), 2 of Clubs (point value=2), 
7 of Clubs (point value=7), 6 of Spades (point value=6), 
4 of Diamonds (point value=4), 9 of Diamonds (point value=9), 
4 of Clubs (point value=4), Ace of Hearts (point value=1), 
8 of Hearts (point value=8), Queen of Diamonds (point value=12), 
8 of Spades (point value=8), Jack of Clubs (point value=11), 
Queen of Hearts (point value=12), 5 of Hearts (point value=5), 
6 of Hearts (point value=6), 9 of Hearts (point value=9), 
9 of Clubs (point value=9), Ace of Spades (point value=1), 
5 of Diamonds (point value=5), 4 of Hearts (point value=4), 
3 of Spades (point value=3), 7 of Diamonds (point value=7), 
7 of Hearts (point value=7), 3 of Clubs (point value=3), 
6 of Clubs (point value=6), 10 of Hearts (point value=10), 
7 of Spades (point value=7), 3 of Diamonds (point value=3), 
Ace of Diamonds (point value=1), King of Hearts (point value=13), 
10 of Diamonds (point value=10), 8 of Clubs (point value=8), 
8 of Diamonds (point value=8), King of Spades (point value=13), 
6 of Diamonds (point value=6), Queen of Spades (point value=12), 
Jack of Diamonds (point value=11), Ace of Clubs (point value=1), 
2 of Hearts (point value=2), Queen of Clubs (point value=12)

Dealt cards: 


Shuffle 1:

size = 52
Undealt cards: 
Queen of Diamonds (point value=12), 10 of Clubs (point value=10), 
3 of Clubs (point value=3), Ace of Diamonds (point value=1), 
King of Hearts (point value=13), Queen of Clubs (point value=12), 
5 of Spades (point value=5), Ace of Hearts (point value=1), 
6 of Spades (point value=6), 6 of Hearts (point value=6), 
5 of Hearts (point value=5), 4 of Hearts (point value=4), 
7 of Spades (point value=7), Jack of Clubs (point value=11), 
4 of Spades (point value=4), 8 of Spades (point value=8), 
3 of Diamonds (point value=3), 10 of Hearts (point value=10), 
10 of Spades (point value=10), 10 of Diamonds (point value=10), 
4 of Clubs (point value=4), 8 of Hearts (point value=8), 
7 of Hearts (point value=7), King of Diamonds (point value=13), 
King of Spades (point value=13), 4 of Diamonds (point value=4), 
3 of Hearts (point value=3), 7 of Clubs (point value=7), 
8 of Diamonds (point value=8), 3 of Spades (point value=3), 
2 of Spades (point value=2), 9 of Hearts (point value=9), 
2 of Hearts (point value=2), 9 of Spades (point value=9), 
5 of Clubs (point value=5), 9 of Diamonds (point value=9), 
King of Clubs (point value=13), Jack of Hearts (point value=11), 
Queen of Spades (point value=12), 6 of Clubs (point value=6), 
2 of Clubs (point value=2), 7 of Diamonds (point value=7), 
5 of Diamonds (point value=5), Ace of Spades (point value=1), 
Jack of Spades (point value=11), 9 of Clubs (point value=9), 
2 of Diamonds (point value=2), Ace of Clubs (point value=1), 
Queen of Hearts (point value=12), 8 of Clubs (point value=8), 
6 of Diamonds (point value=6), Jack of Diamonds (point value=11)

Dealt cards: 

 *
 */