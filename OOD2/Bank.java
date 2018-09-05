/**
 * Shai Caspin
 * 02/06/17
 * Module Twenty-One Lesson Five Assignment - Bank Modification from OOD Pt. 2
 * 
 * https://www.softchalkcloud.com/file/files/wIZVxbCuD1fFE7/MODIFIED_OOD2a.pdf
 */

import java.util.Scanner; 
import java.text.NumberFormat;

public class Bank
{
    public static void main(String[] args)
    {
        Account munozAccount = new Account (250, "Maria", "Munoz", "110 Glades Road","My town", "FL", "33445");
        Scanner input = new Scanner(System.in);
        double data;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println(munozAccount) ;
        System.out.print("Enter deposit amount: ");
        data = input.nextDouble() ;
        munozAccount.deposit(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();
        munozAccount.withdrawal(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        
        System.out.print("Would you like to update the personal adress? (y/n)");
        String answer = input.next();
        if (answer.equals("y"))
        {
            System.out.println("The previous personal information was: " + munozAccount);
            System.out.print("New street: ");
            String street = input.nextLine();
            System.out.print("\nNew city: ");
            String city = input.nextLine();
            System.out.print("\nNew state: ");
            String state = input.nextLine();
            System.out.print("\nNew zipcode: ");
            String zip = input.nextLine();
            
            munozAccount.changeAddress(street,city,state, zip);
            System.out.println("New account information: " + munozAccount);
        }
    }
}
/**
 * Sample output
 * 
Maria Munoz
110 Glades Road
My town, FL 33445
Current balance is $250.00
Enter deposit amount: 100
Balance is: $350.00
Enter withdrawal amount: 400
Not enough money in account.
Balance is: $350.00
 *
 *
 *
Maria Munoz
110 Glades Road
My town, FL 33445
Current balance is $250.00
Enter deposit amount: 0
Balance is: $250.00
Enter withdrawal amount: 0
Balance is: $250.00
Would you like to update the personal adress? (y/n)y
The previous personal information was: Maria Munoz
110 Glades Road
My town, FL 33445
Current balance is $250.00
New street: Wowza lane
New city: Raleigh
New state: West Carolina
New zipcode: 2345999
 */