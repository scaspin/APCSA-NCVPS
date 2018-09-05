
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/05/16
 * Hourly Pay Program 122b
 * 
 * Description: This program produces the pay recieved after a certain number of hours up to 40.
 * What I learned: I learned how to combine if conditions and for loops.
 * Difficulties: I tried to use EasyFromat to fromat the output but that failed, so I decided to just use an
 *              if condition based on how many digits the first number had to control the spacing.
 */

public class HourlyPay
{
   public static void main(String[] args)
   {
       System.out.println("Hours    Pay"); //Print headlines
       for( int hours=1 ; hours<41; hours++) //set conditions for 40 loops for different hours
       { 
           final int PAY_PER_HOUR = 4 ; //finalize pay
           int pay = PAY_PER_HOUR * hours ; // caluclate payment
           
           if (hours<10) {  //different number of spaces based on number of digits in first number
           System.out.println(" "+hours + "        "+ pay);
        } else System.out.println(" "+hours + "       "+ pay); 
    }
}
}

/**
 * Sample output

Hours    Pay
 1        4
 2        8
 3        12
 4        16
 5        20
 6        24
 7        28
 8        32
 9        36
 10       40
 11       44
 12       48
 13       52
 14       56
 15       60
 16       64
 17       68
 18       72
 19       76
 20       80
 21       84
 22       88
 23       92
 24       96
 25       100
 26       104
 27       108
 28       112
 29       116
 30       120
 31       124
 32       128
 33       132
 34       136
 35       140
 36       144
 37       148
 38       152
 39       156
 40       160
 */