
/**
 * Shai Caspin
 * Carrboro HS
 * 01/04/17
 * Program 310t
 * 
 * Description:Graphs help to display data. Create a table similar to the one shown below. The numbers generated are 
 *             to be created as random numbers between $10,000 and $50,000.  The numbers and graph indicate the sales 
 *             from a wholesaler during the month of October.  Note that they are not open seven days a week. (Sunday 
 *             is the day they are closed, and Sundays fall on October 1, 8, 15, 22, and 29 during the year in 
 *             question. The graph is generated in that each star represents $1,000 in sales.
 * What I learned: I learned how to use multiple methods
 * Difficulties: A LOT OF CODE
 */
import java.util.Random;

public class Program310t
{
    //random number generator
    static Random rand = new Random(); 
    
    //main method that only runs once, prints headings, and runs for 31 days
    public static void main(String[] args)
    {
        //headers
        System.out.println("Sales for October");
        System.out.println("Day\tDaily\tSales Graph");
        
        //run program for 31 days
        for (int day = 1; day<=31; day++)
        {
            printLine(rndm(day),day);
        }
    }
    
    static int dailySales = 0;
    public static int rndm(int day)
    {
        //changes different random numbers based on the day since monday and tuesday sales are higher
        if (day%7==2) //monday
        {
            dailySales = rand.nextInt(20001)+30000;
        }
        else if (day%7==3) //tueday
        {
            dailySales = rand.nextInt(30001)+20000;
        }
        else if (day%7==0) //saturday
        {
            dailySales = rand.nextInt(5001)+10000;
        }
        else if (day%7==1) //sunday
        {
            dailySales =0;
        }
        else //the rest of the days are between 10 and 50
        {
            dailySales = rand.nextInt(40001)+10000;
        }
        
        return dailySales;
    }
   
    //print the day, daily slaes, and the histogram bar
    public static void printLine(int num, int day)
    {
        int roundedDailySales = (int)(dailySales/1000+0.5);
        System.out.print("\n"+day+"\t"+dailySales+"\t");
        for (int dollar = 1; dollar<= (roundedDailySales); dollar++)
        {
            System.out.print("$");
        }
    }
}
/**
 * Sample output
 * 
 * 
Sales for October
Day	Daily	Sales Graph

2	32710	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
3	32624	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
4	48741	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
5	34754	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
6	31643	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
7	12225	$$$$$$$$$$$$

9	48287	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
10	38116	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
11	14656	$$$$$$$$$$$$$$
12	20221	$$$$$$$$$$$$$$$$$$$$
13	35898	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
14	11654	$$$$$$$$$$$

16	48080	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
17	21924	$$$$$$$$$$$$$$$$$$$$$
18	26594	$$$$$$$$$$$$$$$$$$$$$$$$$$
19	13221	$$$$$$$$$$$$$
20	17947	$$$$$$$$$$$$$$$$$
21	14391	$$$$$$$$$$$$$$

23	33425	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
24	38094	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
25	46847	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
26	24389	$$$$$$$$$$$$$$$$$$$$$$$$
27	27980	$$$$$$$$$$$$$$$$$$$$$$$$$$$
28	14119	$$$$$$$$$$$$$$

30	40222	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
31	41537	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 * 
 * 
 * 
 * 
 * 
 * 
 * 
Sales for October
Day	Daily	Sales Graph

2	45696	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
3	49106	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
4	15809	$$$$$$$$$$$$$$$
5	13156	$$$$$$$$$$$$$
6	13286	$$$$$$$$$$$$$
7	14711	$$$$$$$$$$$$$$

9	31481	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
10	31438	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
11	41296	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
12	48530	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
13	49418	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
14	11497	$$$$$$$$$$$

16	30441	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
17	44298	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
18	43612	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
19	18544	$$$$$$$$$$$$$$$$$$
20	19703	$$$$$$$$$$$$$$$$$$$
21	14386	$$$$$$$$$$$$$$

23	43809	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
24	36817	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
25	27443	$$$$$$$$$$$$$$$$$$$$$$$$$$$
26	47110	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
27	39404	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
28	11241	$$$$$$$$$$$

30	49414	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
31	42490	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 * 
 * 
 * 
 * 
 * 
 * 
Sales for October
Day	Daily	Sales Graph

2	43998	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
3	33908	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
4	33409	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
5	40453	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
6	16805	$$$$$$$$$$$$$$$$
7	11920	$$$$$$$$$$$

9	37945	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
10	34987	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
11	20437	$$$$$$$$$$$$$$$$$$$$
12	19795	$$$$$$$$$$$$$$$$$$$
13	17050	$$$$$$$$$$$$$$$$$
14	11439	$$$$$$$$$$$

16	36858	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
17	47021	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
18	20315	$$$$$$$$$$$$$$$$$$$$
19	39340	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
20	17155	$$$$$$$$$$$$$$$$$
21	12987	$$$$$$$$$$$$

23	43178	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
24	39277	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
25	10983	$$$$$$$$$$
26	39145	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
27	23303	$$$$$$$$$$$$$$$$$$$$$$$
28	14793	$$$$$$$$$$$$$$

30	32973	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
31	25358	$$$$$$$$$$$$$$$$$$$$$$$$$
 * 
 */