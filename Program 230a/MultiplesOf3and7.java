
/**
 *Shai Caspin
 *10/31/16
 *Carrboro HS (NCVPS)
 *Program 230a - multiples of 3 and t
 *
 *Decription: This program prints out all numbers that are multiples of 3 and 7 between 1 and 100.
 *What I learned: I learned how to use loops and decision making statements.
 *Difficulties: I didn't know if numbers like 21 (multiple of both 3 and 7) would be printed twice (would've happened if it was two different
 *              decision making statements were separate) but I used 
 */

public class MultiplesOf3and7
{
    public static void main(String[] args)
    {
        int num = 1; //first number is one, doesn't matter where this starts as long as it's less than or equal to 3
        
        while (num<100) //all numbers less than 10
        {
            if (num%3 == 0) //all numbers that when divided by 3 have a remainder of 0 are divisible by 3
            {
                System.out.println(num); //print number
            }
            //Use else if so no number gets orinted twice
            else if (num%7 == 0) //all numbers that when divided by 7 have a remainder of 0 are divisible by 7
            {
                System.out.println(num);//print number
            }
            
            num++; //increment numbers by 1
        }
    }
}
/**
 * Output
3
6
7
9
12
14
15
18
21
24
27
28
30
33
35
36
39
42
45
48
49
51
54
56
57
60
63
66
69
70
72
75
77
78
81
84
87
90
91
93
96
98
99

 * 
 */