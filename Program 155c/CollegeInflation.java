
/**
 * Shai Caspin
 * 10/19/16
 * Carrboro High School (NCVPS)
 * 
 * Description: Kayla is a freshman in college.  She is concerned about having enough money to finish her four-year education. 
 *              She knows that this year tuition is $4000 and room and board is $9500.  She has a part time job that pays 
 *              $14,000 a year.Tuition is expected to rise by 15% and room and board by 10%.  She anticipates a cost of 
 *              living raise at her job of 4% per year. This program helps Kayla determine the surplus or deficit that 
 *              she can anticipate if her projections are accurate
 * What I learned: I learned how to use compounding within a loop to find total/
 * Difficulties: TOO MANY VARIABLES. 
 */

public class CollegeInflation
{
   public static void main(String[] args)
   {
       //DEclare all initial values
       double tuition = 4000;
       double room = 9500;
       double income = 14000;
       
       //calculations for income
       double totalCost = tuition + room;
       double balance = income - totalCost;
       
       //initialize counters for totals
       double tuitionTotal=0 ;
       double roomTotal=0;
       double incomeTotal=0;
       double totalCostTotal =0;
       double balanceTotal=0;
              
       System.out.println("Year     Tuition      Rm&Bd     Total Cost      Salary      Excess/Shortage"); //headers
                           
       for(int year=1; year<=4; year++) //four years
       {
          //output is first so initial amounts are displayed within the loop
          System.out.println((year)+ EasyFormat.format(tuition, 15,2)+ EasyFormat.format(room,13,2)+
                            EasyFormat.format(totalCost,12,2)+EasyFormat.format(income,14,2)+
                            EasyFormat.format(balance,15,2));
          
          //calculate chnage in rpecentage added
          tuition = tuition * 1.15 ;
          room = room * 1.10;
          income = income * 1.04;
          
          totalCost = tuition + room;
          balance = income - totalCost;
          
          //counter for totals
          tuitionTotal+=tuition ;
          roomTotal+= room;
          incomeTotal+= income;
          balanceTotal+= balance;
          totalCostTotal += totalCost;
        }
       
       //Displaying total
       System.out.println("Balance "+ EasyFormat.format(tuitionTotal,6,2)+ EasyFormat.format(roomTotal,13,2)+
                            EasyFormat.format(totalCostTotal,12,2)+EasyFormat.format(incomeTotal,14,2)+
                            EasyFormat.format(balanceTotal,15,2));
      
    }
}
/**
 * SAMPLE OUTPUT 
 * 
Year     Tuition      Rm&Bd     Total Cost      Salary      Excess/Shortage
1        4000.00      9500.00    13500.00      14000.00         500.00
2        4600.00     10450.00    15050.00      14560.00        -490.00
3        5290.00     11495.00    16785.00      15142.40       -1642.60
4        6083.50     12644.50    18728.00      15748.10       -2979.90
Balance 22969.52     48498.45    71467.98      61828.52       -9639.46
 * 
 * 
 */