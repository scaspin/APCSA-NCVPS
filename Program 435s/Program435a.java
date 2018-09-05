
/**
 * Shai Caspin
 * 02/27/17
 * Carrboro High School (NCVPS)
 * Program 435a-fee highway
 * 
 * Description:A turnpike bases it charges on the type of vehicles and the entrance point for that 
 *             vehicle. Both the vehicle and the gates are coded with consecutive numbers in the 
 *             following manner.To determine the charge the factor for the car type is multiplied by 
 *             the toll for the gate the vehicle entered the turnpike. Thus, if a truck (type 5) 
 *             entered the turnpike at gate 4 the charge would be $7.80 ($3.25 X 2.4). This program 
 *             reads in several pairs of data (vehicle type, Gate number) and outputs the Name of the 
 *             vehicle type, the toll, the factor, and total bill for turnpike use. 
 * What I learned: How to use multiple arrays for same index and reference            
 */

import java.util.*;
import java.io.*;

public class Program435a
{
    //Establish arrays for reference for gate and vehicle type (and factor)
    private static double[] factor = {1.0,1.3,1.6,2.0,2.4,2.7};
    private static String[] carType = {"Compact Car","Small Car","Mid Size Car", "Full Size Car","Truck   ","16 Wheeler"};
    private static double[] toll = {1.35,2.00,2.50,3.25,4.10,4.80,5.50, 6.00};
    
    
    //Establish instance variables per read of car
    private static String printOutput;
    private static int vType;
    private static int gateNum;
    
    //Get input from file and use additional method to print the info based on data
    public static void main(String[] args)
    {
       Scanner inFile = null; //establish scanner
       try 
        {
            // define the scanner to read the file
            inFile = new Scanner (new File("Prog435a (1).dat"));
            
        } 
       catch (FileNotFoundException e) //output if file cannot be found
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
    
        }
       
       System.out.println("Car Type\tBase Toll\tFactor\t\tCost"); 
       System.out.print("----------------------------------------------------");  
       while(inFile.hasNext())
       {
           vType = inFile.nextInt();
           gateNum = inFile.nextInt();
           
           System.out.print(printOut(vType, gateNum));
        }
    }
    
    //Establish output formatting based on vehicle type and gate
    public static String printOut(int car, int gate)
    {
       printOutput = "\n"+ carType[car-1]+"\t"+ EasyFormat.format("$"+toll[gate-1],7) + EasyFormat.format(factor[car-1],13) + EasyFormat.format((factor[car-1]*toll[gate-1]),16,2) ;
       return printOutput; 
    }
}

/**
 * Sample output
 * 
Car Type	Base Toll	    Factor		   Cost
------------------------------------------------
Compact Car	  $1.35          1.0            1.35
Small Car	   $2.5          1.3            3.25
Mid Size Car   $4.1          1.6            6.56
Full Size Car  $5.5          2.0           11.00
Truck   	   $2.0          2.4            4.80
16 Wheeler	  $3.25          2.7            8.78
Compact Car	   $4.8          1.0            4.80
Small Car	   $6.0          1.3            7.80
Mid Size Car  $1.35          1.6            2.16
Full Size Car  $2.5          2.0            5.00
Truck   	   $4.1          2.4            9.84
16 Wheeler	   $5.5          2.7           14.85
Compact Car	   $6.0          1.0            6.00
Small Car	  $1.35          1.3            1.76
Mid Size Car   $2.0          1.6            3.20
Full Size Car  $2.5          2.0            5.00
Truck   	  $3.25          2.4            7.80
16 Wheeler	   $4.1          2.7           11.07
 * 
 */