
/**
 * Shai Caspin
 * 10/0716
 * Program 152a - from 3 to 9669
 * 
 * Description: This program yields the sum of the multiples of 3 from 3 to 9669.
 * What I learned: I learned how to use += operators and how to increment loops efficiently.
 * Difficulties: I ran my program with the initializing condition number=1 instead of number=3, so the
 *               resulting number was off by 6446 for a while until I fixed it.
 */

public class From3to9669
{
    public static void main(String[] args){
       long total = 0 ;  // initialize total so we can use it in output
        for (int number=3; number<=9669; number+=3){ //loop for all numbers between 3 and 9669 incremented by 3. 
              total += number ; //summation of numbers
                  }
       System.out.println("The sum of the multiples of 3 from 3 to 9669 is " + total); //output
}
}

/** output:
 * The sum of the multiples of 3 from 3 to 9669 is 15586428
 */