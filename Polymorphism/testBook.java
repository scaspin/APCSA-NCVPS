
/**
 * Write a description of class testBook here.
 * 
 * @author Shai Caspin
 * @version 1
 */
public class testBook
{
    public static void main(String[] args)
    {
        Book myBook1 = new Book("Alice in Wonderland", "Lewis Carroll");
        Book myBook2 = new Book();
        Book myBook3 = new Book("Charlie in the Chocolate Factory", "Roald Dahl");
        Book myBook4 = new Book(myBook3);
        
        
        System.out.println("" + myBook1);    
        
        myBook2.setTitle("Cat's Cradle");
        myBook2.setAuthor("Kurt Vonnegut");
        System.out.println("" + myBook2); 
        
        System.out.println("" + myBook3);   
        
        myBook3.setAuthor("Not Roald Dahl");
        System.out.println("\n" + myBook3); 
        
        /***************************************/
        
        System.out.print(myBook1.getAuthor()+", ");
        System.out.println(myBook1.getTitle());
        
        /***************************************/
        
        System.out.println(myBook4);
        
    }
}
