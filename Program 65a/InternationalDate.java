
/**
 * Shai Caspin
 * Carrboro High School
 * 09/27/16
 * Program 65a - international date
 * 
 * Description: This program takes american dats MM DD YY and converts it to International date CCYY-MM-DD
 * What I leanred: This is the first program where I used an If statment.
 * Difficulties: I had to research a bit to make sure eveything was perfect.
 */

//allow input
import java.io.* ;
import java.util.* ;

public class InternationalDate
{ public static void main(String[] args)
    {
        Scanner dateInput = new Scanner(System.in);
        
        //get user input
        System.out.print("Enter the date (MM DD YY): ");
        int month = dateInput.nextInt();
        int day = dateInput.nextInt();
        int year = dateInput.nextInt();
        
        //determine whether date is in 1900s or 2000s
        int century ;
        
        if (year<16) {
            century = 20 ;
        } else century = 19;
        
        char dash = 45;
        
        //display final result
        System.out.println("The date written in international format is: " + century+year+dash+month+dash+day);
    }
    }
 
    /**
     * Sample output
     * Enter the date (MM DD YY): 12 11 89
     * The date written in international format is: 1989-12-11
     * 
     * Enter the date (MM DD YY): 10 21 11
     * The date written in international format is: 2011-10-21
     */
            
        
       
       
