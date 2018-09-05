
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 09/27/16
 * Program 93a- calculating the electric bill
 * 
 * Description- This program takes an input of kilowatt hours used and calculates the total electric bill after taxes. It
 *              also calculates how much the bill would be if the payment was late.
 * What I learned: I learned how to set up correct formatting of output.
 * Difficulties: All the rounding took way too long.
 */

//allows user input
import java.io.* ;
import java.util.* ;

public class PowerCalculations
{
    public static void main(String[] args)
    {
        Scanner electricData = new Scanner(System.in); //declare scanner class
        
        System.out.print("Enter kiloWatt-Hours used: "); //get user input for KWH used
        int kWH = electricData.nextInt();
        
        final double dollarsPerKWH =  0.0475 ; //allows program to work with different values, easier to change
        double baseCharge = (int)(kWH * dollarsPerKWH * 100 +0.5)/100.00 ;
        
        double surcharge = (int)(baseCharge * 0.1 * 100 + 0.5)/100.00 ; //calculates and rounds added surcharge by multiplying by 10%
        double cityTax = (int)(baseCharge * 0.03 * 100 + 0.5)/100.00 ; //calculates and rounds added city tax
               
        // calculates and rounds final paymen
        double finalPayment = (int)((baseCharge+surcharge+cityTax) * 100 + 0.5) / 100.00; 
        
        //calculates late fee
        double latePayment = (int)(((finalPayment*0.04)+finalPayment) * 100 + 0.5) / 100.00; 
        
        //Setting up bill format and displaying calculations
        System.out.println("-------------------------------------------------");
        System.out.println("            E L E C T R I C   B I L L            ");
        System.out.println("-------------------------------------------------");
        System.out.println(kWH +" Kilowatt hours used at $" + dollarsPerKWH + " dollars/kWH.");
        System.out.println("-------------------------------------------------");
        System.out.println("Base charge                            $" + baseCharge);
        System.out.println("Surcharge                              $" + surcharge);
        System.out.println("City tax                               $" + cityTax);
        System.out.println("-------------------------------------------------");
        System.out.println("Total payment                          $" + finalPayment);
        System.out.println("-------------------------------------------------");
        System.out.println("Payment due after deadline is          $" + latePayment);
        System.out.println("-------------------------------------------------");
   
    }
}
/**
 * Sample output
Enter kiloWatt-Hours used: 993
-------------------------------------------------
            E L E C T R I C   B I L L            
-------------------------------------------------
993 Kilowatt hours used at $0.0475 dollars/kWH.
-------------------------------------------------
Base charge                            $47.17
Surcharge                              $4.72
City tax                               $1.42
-------------------------------------------------
Total payment                          $53.31
-------------------------------------------------
Payment due after deadline is          $55.44
-------------------------------------------------
 *
 *
 *
Enter kiloWatt-Hours used: 123459
-------------------------------------------------
            E L E C T R I C   B I L L            
-------------------------------------------------
123459 Kilowatt hours used at $0.0475 dollars/kWH.
-------------------------------------------------
Base charge                            $5864.3
Surcharge                              $586.43
City tax                               $175.93
-------------------------------------------------
Total payment                          $6626.66
-------------------------------------------------
Payment due after deadline is          $6891.73
-------------------------------------------------
 */