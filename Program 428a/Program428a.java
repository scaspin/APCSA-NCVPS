
/**
 * Shai Caspin
 * 02/20/17 
 * Carrboro High School (NCVPS)
 * Program 428a - very busy jailer
 * 
 * Description-A king once decided to grant amnesty to some of his prisoners due to lack of jail 
 *             space rather than build a new prison.  He instructed his jailer to carryout the 
 *             following procedure to determine which prisoners were to be set free. The jailer 
 *             was to first unlock each of the 1000 cells. Then starting with the 2nd cell (number 
 *             2), he turned the key in every 2nd cell. Then starting with the 3rd cell he turned 
 *             the key in every 3rd cell; then starting the 4th, he turned the key in every 4th 
 *             cell, etc.  Each turn of the key either locked or unlocked the cell door.  
 *             When he was completely done those with the unlocked doors could leave.  
 *             Who were the lucky ones?
 *  What I leared- how to program!
 */
public class Program428a
{
    public static void main(String[] args)
    {
        //Array for prison cells holding 1000 cells
        boolean[] prisoners = new boolean[1000];
        
        //Setting each value of the cell to locked (false) before guard goes around
        for (int i = 0; i<1000; i++)
        {
            prisoners[i] = false;
        }
        
        //Go through each cell reversing what it is as needed
        for (int i = 1; i <1000; i++) 
        {
            for (int j = 1; j <1000; j++) 
            {
                if(j % i == 0) 
                {
                    prisoners[j] =! prisoners[j];
                }
            }
        }
        
        /**
         * I created another array for the values of cells that are open after the guard is 
         * done so the program is a bit cleaner and there aren't too many iterated loops within
         * the output section.
         */
        int[] openDoors = new int[50];
        int count = 0;
        for (int i = 0; i<1000; i++)
        {
            if (prisoners[i]==true)
            {
                openDoors[count] = i;
                count++;
            }
        }
        
        //Display the output of those cells that are open randomly
        
        System.out.println("The free prisoners are those in cells: ");
        int num = 0;
         
        for (int l = 1; l<=7; l++)
        {
             System.out.println();
             for (int m = 1; m<=5; m++)
             {
                 System.out.print(openDoors[num]+"\t");
                 num++;
                }
           }
    }
}
 
/**
  * Sample output
  * 
The free prisoners are those in cells: 
1	4	9	16	25	
36	49	64	81	100	
121	144	169	196	225	
256	289	324	361	400	
441	484	529	576	625	
676	729	784	841	900	
961	
  */