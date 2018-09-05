
/**
 * Shai Caspin
 * 03/03/17
 * Program 600_58t - making change again
 * 
 * This is the class program associated with tester class to determine change given during transaction.
 */

public class Change
{
    //Define variables for program
    private static double price;
    private static double cash;
    private static String[] changeName = {"Ones","Quarters","Dimes","Nickels","Pennies"};
    private static double[] changeValue = {1,0.25,0.1,0.05,0.01};
    
    /**
     * Default & Constructor methods
     */
    public static void Change()
    {
    }
    public static void Change(double p, double c)
    {
        price = p;
        cash = c;
    }
    
    /**
     * Mutator methods
     */
    public static void setPrice(double p)
    {
        price = p;
    }
    public static void setCash(double c)
    {
        cash = c;
    }
    
    /**
     * Accessor methods
     */
    public static double getPrice()
    {
        return price;
    }
    public static double getCash()
    {
        return cash;
    }
    
    /**
     * Program to calculate number of coins for change needed
     */
    public static void printChange()
    {
      System.out.println("+++++++++++++\nCorrectChange\n+++++++++++++");
      
      double leftover = cash-price;
      for (int i = 0; i<5; i++)
      {
          int numCoins = (int)(leftover/changeValue[i]);
          System.out.println(changeName[i]+"  =  "+ numCoins);
          leftover = leftover - (numCoins*changeValue[i]);
        }
        
      System.out.print("Total amount $" + (cash-price));  
    }
}
