
/**
 * This class defines an object book
 * 
 * @author Shai Caspin
 * @version 1
 */
public class Book{
   private String title;
   private String author;
   
   //default constructor for objects
   public Book()
   {
       title = null;
       author = null;
    }
   
   //Norm al constructior
   public Book(String t, String a) 
   {
       title = t;
       author = a;
    }
    
   //Copy constructor
   public Book(Book b)
   {
       title = b.title;
       author = b.author;
    }
   
    
   //creates string ith specs of the object to print
   public String toString()
   {
       String str = "The specs of this book are: ";
       str += "\n\t Title: " + title;
       str += "\n\t Author: " + author;
       
       return str;
    }

    /*************Accessors (getters)*****************/
   public String getTitle()
   {
        return title;
   }
   public String getAuthor()
   {
        return author;
   }
   
   /**************Mutators (setters) *******************/
   public void setTitle(String t)
   {
       title = t;
   }
   
   public void setAuthor(String a)
   {
       author = a;
   }
   
   
   
}