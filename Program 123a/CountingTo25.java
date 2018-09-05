
/**
 * Shai Caspin
 * 10/15/16
 * Carrboro High School (NCVPS)
 * Program 123a- counting to 25 in fives
 * 
 * Description: This program uses integrated loops to output numbers 1-25 in five lines.
 * What I learned: I learned how to use the \t procedure and run loops every 5 nested loops.
 * Difficulties: I tried to write this program by myself and had trouble understanding how to 
 *               do so, but then I watched the video in our notes and adjusted the code they 
 *               used to fit the program. Now I understand how to do it.
 */

public class CountingTo25
{
    public static void main(String[] args)
    {
        System.out.println("Counting to 25 five numbers at a time!");
       
        for (int y=1; y<=25 ; y+=5) //5 lines by incrementing y by 5 up until 25
        {
            for (int x=y; x<y+5;x++) //increment by one
            {
                System.out.print(x +"\t"); //number and a tab for space afterwards
            }
            System.out.println("\n"); //space between each line
        }
    }
}
/**
 * Sample output
 * 
Counting to 25 five numbers at a time!
1	2	3	4	5	

6	7	8	9	10	

11	12	13	14	15	

16	17	18	19	20	

21	22	23	24	25	
 */