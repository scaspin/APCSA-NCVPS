
/**
 *Shai Caspin
 *Carrboro High School (NCVPS)
 *09/26/16
 *Program 76a - Number Manipulation
 *
 *Description: This program takes a digit people don't like and prints it a lot after some math.
 *What I learned: I learned how to use the "long" decleration of variable.
 *Difficulties: I tried to use ASCII to print out the dashes but that didn't work out too well.
 */

import java.io.* ;
import java.util.* ;

public class NumberManipulation
{
    public static void main(String[] args)
    {
        Scanner magicNumberInput = new Scanner(System.in); //allow scanner
        
        System.out.print("Enter a numeral digit you hate: ") ; //get initial digit user hates
        int magicNumber = magicNumberInput.nextInt();
        
        //multiplication by 9 and display
        System.out.println("\n                                " + magicNumber); 
        int magicNumberTimes9 = magicNumber * 9;
        System.out.println("                               x9 ");
        System.out.println("                   --------------");
        System.out.println("                               " + magicNumberTimes9);
        
        //Multiplication by 12345679 and output
        System.out.println("                        x12345679");
        int magicNumberLong = magicNumberTimes9 * 12345679 ;
        System.out.println("                   --------------");
        System.out.println("                        " + magicNumberLong);
       
        //Final value after multiplying by 1000
        System.out.println("Suprise                     x1000");
        System.out.println("                   --------------");
        long numberFinal = (long)magicNumberLong * 1000 ; //convert to long because not enough bits
        System.out.println("\"No suprise\"?        " + numberFinal);
    }
}

/**
 * Sample output
Enter a numeral digit you hate: 5

                                5
                               x9 
                   --------------
                               45
                        x12345679
                   --------------
                        555555555
Suprise                     x1000
                   --------------
"No suprise"?        555555555000


Enter a numeral digit you hate: 9

                                9
                               x9 
                   --------------
                               81
                        x12345679
                   --------------
                        999999999
Suprise                     x1000
                   --------------
"No suprise"?        999999999000


 */