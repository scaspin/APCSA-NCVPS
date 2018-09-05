
/**
 * Shai Caspin
 * 10/31/16
 * Carrboro High School
 * Program 202a - Extra Credit - Sequence Interval Change
 * 
 * Description:This program produces a sequence with an interval change based on pregiven changes.
 * What I learned: I learned how to use a changing variable based on decisions to increment the loop.
 * Difficulties: I tried getting the icnrement by using division by 10 of the number, but that didn't 
 *               work out well, so I resulted to the simpler solution.
 */

public class SequenceIntervalChange
{
   public static void main(String[] args)
   {
       int increment = 2; //Could also start at 0, but then it would print out 0 as well.
       for (int num=2; num<70; num+=increment) //range of sequence and incrememnts change based on what's in the loop.
       {
           //
           if (num<20)
           {
               increment = 2;
            }
           else if (40<num)
           {
               increment = 4;
            }
            else
           {
               increment = 3;
            }
            
           System.out.println(num);
        }
    }
}
 /**
  * Sample output
  * 
2
4
6
8
10
12
14
16
18
20
23
26
29
32
35
38
41
45
49
53
57
61
65
69
  *
  *
  */