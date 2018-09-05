/**
 * Testing patron and book objects together
 * 
 * @author Shai Caspin
 * @version 1
 */
public class testPatron
{
    public static void main(String[] args)
    {
        Book myBook = new Book("Why not??", "Lucy Lu");
        Book myBook2 = new Book("Homework", "teachers");
        
        Patron pat1 = new Patron();
        Patron pat2 = new Patron("Jane","Doe","11aa67888bo",myBook);
        Patron pat3 = new Patron("Daniel", "Craige", "007bond", myBook);
        Patron pat4 = new Patron(pat3);
        
        /***************************************/
        
        pat1.setFName("Mona");
        pat1.setLName("Lisa");
        pat1.setLibNumber("leo1245");
        pat1.setBook(myBook2);
        System.out.println("" + pat1); 
        
        
        /***************************************
        
        System.out.println("" + pat2);    
        
        ***************************************        
        System.out.println("" + pat3);   
        
        pat3.setFName("James");
        pat3.setLName("Bond");
        System.out.println("\n" + pat3); 
        
        ***************************************
        
        System.out.print(pat1.getFName()+", ");
        System.out.print(pat1.getLName()+", ");
        System.out.println(pat1.getLibraryNum());
        
        
        
        System.out.println(pat4);
        ***************************************/
        
    }
}
/**
 * Sample Output
 * 
 * The specs of this patron are: 
	 First Name: Mona
	 Last Name: Lisa
	 Library Number: leo1245
The specs of this book are: 
	 Title: Homework
	 Author: teachers
 * 
 * 
 * //
 */