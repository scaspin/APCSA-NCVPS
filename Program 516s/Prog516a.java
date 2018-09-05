
/**
 * Write a description of class Prog516a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Prog516a
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you wish to dial: ");
        String numOriginal = input.nextLine();
        
        String numOriginalLowerCase= numOriginal.toLowerCase();
        String numNew = numOriginal.replaceAll("[abcdefghijklmnopqrstuvwxyz]","[22233344455566677778889999]");
        
        System.out.println("The number to dial is "+numNew);
        
    }
}
