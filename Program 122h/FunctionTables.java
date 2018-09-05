
/**
 * Shai Caspin
 * 10/07/16
 * Carrboro High School (NCVPS)
 * Program 122h- Function tables Extra Credit
 * 
 * Descripion: This program produces function tables for the number 1-20, their square, root, cube, and 4th root.
 * What I learned: I learned how to use the Easy.Format class in formatting output.
 * Difficulties: I forgot that the power function assumes any operations used are integers, so I had to manipulate 
 *               the (1/4) to be (1.0/4) so that it treats it like a double instead of an integer.
 */

public class FunctionTables
{
   public static void main(String[] args)
   {
       System.out.println("Number    Square   Square Root     Cube     4th Root"); //Print head lines
       for( int number=1 ; number<21; number++) //set conditions for 20 loops for different hours
       { 
          
           int square = number * number ; //square
           double squareRoot = Math.sqrt(number); //root
           double cube = Math.pow(number,3); //cube
           double fourthRoot = Math.pow(number, (1.0 / 4)); //to the power of 1/4, same ar 4th root
           
           //Display output in nice right alingned format
           System.out.println(EasyFormat.format(number,3,0)+EasyFormat.format(square,10,0)+
                              EasyFormat.format(squareRoot,14,4)+ EasyFormat.format(cube,12,0)
                              +EasyFormat.format(fourthRoot,12,4));
    } 
}
    }

/**
 * Sample output
Number    Square   Square Root     Cube     4th Root
  1         1        1.0000           1      1.0000
  2         4        1.4142           8      1.1892
  3         9        1.7321          27      1.3161
  4        16        2.0000          64      1.4142
  5        25        2.2361         125      1.4953
  6        36        2.4495         216      1.5651
  7        49        2.6458         343      1.6266
  8        64        2.8284         512      1.6818
  9        81        3.0000         729      1.7321
 10       100        3.1623        1000      1.7783
 11       121        3.3166        1331      1.8212
 12       144        3.4641        1728      1.8612
 13       169        3.6056        2197      1.8988
 14       196        3.7417        2744      1.9343
 15       225        3.8730        3375      1.9680
 16       256        4.0000        4096      2.0000
 17       289        4.1231        4913      2.0305
 18       324        4.2426        5832      2.0598
 19       361        4.3589        6859      2.0878
 20       400        4.4721        8000      2.1147
 * 
 **/ 
