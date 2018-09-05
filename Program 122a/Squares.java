
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/05/16
 * Square vs square root program 122a
 * 
 * Description: This program shows the square and square root of all numbers between 1 and 40.
 * What I learned: I learned how to combine if conditions and for loops.
 * Difficulties: I tried to use EasyFromat to fromat the output but that failed, so I decided to just use an
 *            
 *            if condition based on how many digits the first number had to control the spacing.
 */

public class Squares
{
   public static void main(String[] args)
   {
       System.out.println("Number     Square     Square root"); //Print headlines
       for( int number=1 ; number<41; number++) //set conditions for 40 loops for different hours
       { 
          int square = number * number; //square of the number
          double squareRoot = (int)(Math.sqrt(number) * 10000+0.5) / 10000.0; //square root rounded to 4th dec place
           
           if (number<10) {  //different number of spaces based on number of digits in first number
               if (square<10) {
           System.out.println(" "+number + "          "+ square+"          "+squareRoot);
               }else  System.out.println(" "+number + "          "+ square+"         "+squareRoot);
        } else 
            if (square<1000) {
          System.out.println(" "+number + "         "+ square+"        "+squareRoot); 
            }else System.out.println(" "+number + "         "+ square+"       "+squareRoot); 
    } 
}
}

/**
 * Sample output
 * 
Number     Square     Square root
 1          1          1.0
 2          4          1.4142
 3          9          1.7321
 4          16         2.0
 5          25         2.2361
 6          36         2.4495
 7          49         2.6458
 8          64         2.8284
 9          81         3.0
 10         100        3.1623
 11         121        3.3166
 12         144        3.4641
 13         169        3.6056
 14         196        3.7417
 15         225        3.873
 16         256        4.0
 17         289        4.1231
 18         324        4.2426
 19         361        4.3589
 20         400        4.4721
 21         441        4.5826
 22         484        4.6904
 23         529        4.7958
 24         576        4.899
 25         625        5.0
 26         676        5.099
 27         729        5.1962
 28         784        5.2915
 29         841        5.3852
 30         900        5.4772
 31         961        5.5678
 32         1024       5.6569
 33         1089       5.7446
 34         1156       5.831
 35         1225       5.9161
 36         1296       6.0
 37         1369       6.0828
 38         1444       6.1644
 39         1521       6.245
 40         1600       6.3246
 
 */