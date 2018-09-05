
/**
 * Shai Caspin
 * 10/31/16
 * Carrboro High School (NCVPS)
 * Program 275g - coin jar extra credit 
 * 
 * Description:You have 14 coins in a jar.  You take them to the bank to be counted and they are worth $1.05 
 *             If there are only quarters, dimes, nickels and pennies in the jar what are the possible combinations 
 *             of coins that could exist.
 * What I learned: I learned how to use loops and decision statements to solve combinatorics problems.
 * Difficulties: None
 */

public class CoinJar
{
   public static void main(String[] args)
   {
       //VARIABLES
       int numCoins = 0;
       double sumMoney = 0; 
      
       
       System.out.println("The combinations for getting $1.05 using 14 coins are: "); //header
      
       /**The greatest amount of quarters we can have is 4
        * dimes is 10
        * nickels is 21
        * pennies is 105
        */
       
       //Loops execute untill all numbers of combinations of all the coins are tested
       for (int pennies = 0; pennies<=105; pennies++)
       {
           for (int nickels = 0; nickels<= 21; nickels++)
           {
               for (int dimes = 0; dimes<=10; dimes++)
               {
                   for (int quarters = 0; quarters<=4; quarters++)
                   {
                       //Add and multiply to get worth and number of coins used
                       numCoins = quarters+dimes+nickels+pennies;
                       sumMoney = 0.25*(quarters)+0.1*(dimes)+0.05*(nickels)+0.01*(pennies);
                       
                       if (numCoins==14 && sumMoney==1.05)
                       {
                           //Output
                           System.out.println(quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and " + pennies+" pennies.");
                        }
                    }
                }
            }
        }
    }
}

/**
 * Sample output
 * 
The combinations for getting $1.05 using 14 coins are: 
0 quarters, 7 dimes, 7 nickels, and 0 pennies.
1 quarters, 3 dimes, 10 nickels, and 0 pennies.
1 quarters, 7 dimes, 1 nickels, and 5 pennies.
2 quarters, 3 dimes, 4 nickels, and 5 pennies.
 *
 * 
 */