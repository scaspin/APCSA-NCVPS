
/**
 * Shai Caspin
 * 03/03/2017
 * Carrboro High School (NCVPS)
 * 
 * Description: This is the tester class for the chnage class.
 * Difficulties: I don't know how to use lookup tables.
 * 
 */

import java.util.*;
import java.io.*;

public class testChange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Change transac1 = new Change();
        
        System.out.print("Enter purchase price: ");
        transac1.setPrice(input.nextDouble());
        System.out.print("Enter amount given: ");
        transac1.setCash(input.nextDouble());
        
        transac1.printChange();
    }
}
/**
 * Sample output
 * 
Enter purchase price: 20.01
Enter amount given: 30.98
+++++++++++++
CorrectChange
+++++++++++++
Ones  =  10
Quarters  =  3
Dimes  =  2
Nickels  =  0
Pennies  =  1
Total amount $10.96
 * 
 * 
Enter purchase price: 10.01
Enter amount given: 20
+++++++++++++
CorrectChange
+++++++++++++
Ones  =  9
Quarters  =  3
Dimes  =  2
Nickels  =  0
Pennies  =  4
Total amount $9.99
 * 
 * 
Enter purchase price: 49.99
Enter amount given: 100
+++++++++++++
CorrectChange
+++++++++++++
Ones  =  50
Quarters  =  0
Dimes  =  0
Nickels  =  0
Pennies  =  1
Total amount $50.01
 * 
 */