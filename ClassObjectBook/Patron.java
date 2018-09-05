
/**
 * Patron class (people are objects)
 * 
 * @author Shai Caspin
 * @version 1
 */
public class Patron
{
    private String fName;
    private String lName;
    private String libraryNumber;
    private Book patBook;
    
    //default constructor
    public Patron()
    {
        fName = null;
        lName = null;
        libraryNumber = null;
        patBook = null;
    }
    
    //normal constructor
    public Patron(String f, String l, String ln, Book b)
    {
        fName = f;
        lName = l;
        libraryNumber = ln;
        patBook = b;
    }
    
    //Copy constructor
    public Patron(Patron p)
    {
       fName = p.fName;
       lName =p.lName;
       libraryNumber = p.libraryNumber;
       patBook = p.patBook;
    }
    
    //Accesors
    public String getFName()
    { 
        return fName;
    }
    public String getLName()
    { 
        return lName;
    }
    public String getLibraryNum()
    { 
        return libraryNumber;
    }
    public Book getBook()
    {
        return patBook;
    }
    
    //mutators
    public void setFName(String f)
    {
       fName = f;
    }
    public void setLName(String l)
    {
       lName = l;
    }
    public void setLibNumber(String ln)
    {
       libraryNumber = ln;
    }
    public void setBook(Book b)
    {
        patBook = b;
    }
   
    //prints specs and returns string
    public String toString()
    {
       String str = "The specs of this patron are: ";
       str += "\n\t First Name: "+fName;
       str += "\n\t Last Name: "+lName;
       str += "\n\t Library Number: "+libraryNumber;
       str += "\n" + patBook;
       
       return str;
    }
}
