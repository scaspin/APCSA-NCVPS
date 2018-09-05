
/**
 * Shai Caspin
 * 11/09/16
 * Carrboro HS (NCVPS)
 * Program 230b - Ulam's Hypothesis Program
 * 
 * Description:The mathematician Stanislau Ulam of the University of Colorado hypothesized that any positive integer 
 *             would always converge to 1 if treated as follows. If it is odd, multiply it by three and add 1 If it is 
 *             even, divide it by 2. The procedure is then applied to the result of each calculation. This program tests 
 *             that hyopthesis for all numbers up to 25.
 * What I learned: I learned how to use conditional statements within loopsand reuse variables.
 * Difficulties:It took me a while to realize how to reuse the variable, but I eventually understood it.
 */

public class UlamsHypothesis
{
   public static void main(String[] args)
   {
       for (int integer=1; integer<=25 ; integer++) //run the program 25 times
       {
           int num = integer; 
           System.out.print("\n" + EasyFormat.format(num,2,0) + ":"); //get the number that the theory starts with
           do
           { 
               if(num % 2 == 0) //even numbers
               {
                   num /= 2; //divide by two
                   System.out.print(EasyFormat.format(num,4,0)); 
               }
               else // if it's not even, it's odd
               {
                   num = 3 * num + 1; //nultiply by 3 and add 1
                   System.out.print(EasyFormat.format(num,4,0)); 
               }
           
            } while (num != 1);
        }  
    }
}

/**
 * Sample output
 * 
 1:   4   2   1
 2:   1
 3:  10   5  16   8   4   2   1
 4:   2   1
 5:  16   8   4   2   1
 6:   3  10   5  16   8   4   2   1
 7:  22  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
 8:   4   2   1
 9:  28  14   7  22  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
10:   5  16   8   4   2   1
11:  34  17  52  26  13  40  20  10   5  16   8   4   2   1
12:   6   3  10   5  16   8   4   2   1
13:  40  20  10   5  16   8   4   2   1
14:   7  22  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
15:  46  23  70  35 106  53 160  80  40  20  10   5  16   8   4   2   1
16:   8   4   2   1
17:  52  26  13  40  20  10   5  16   8   4   2   1
18:   9  28  14   7  22  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
19:  58  29  88  44  22  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
20:  10   5  16   8   4   2   1
21:  64  32  16   8   4   2   1
22:  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
23:  70  35 106  53 160  80  40  20  10   5  16   8   4   2   1
24:  12   6   3  10   5  16   8   4   2   1
25:  76  38  19  58  29  88  44  22  11  34  17  52  26  13  40  20  10   5  16   8   4   2   1
 * 
 * 
 */