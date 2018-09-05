
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 10/07/16
 * Program 122c - function chart
 * 
 * Description: this program yields a fucntion chart for even values between 0 and 50. First column is number, 
 *              second is one added to the number, third is number doubled, fourth is square of number.
 * What I learned: I learned how to increment for loops by 2.
 * Difficulties: Not all of the output would fit in the output window of BlueJ.
 */

public class FunctionChart //declare class
{
    public static void main(String[] args){
        for (int number =2; number <= 50; number+=2) //set loop starting at 2, until 50, incremented by 2
        {
            int plus1 = number + 1; //add one
            int times2 = number * 2; // multiply by 2
            int square = number * number; //number squared
            
            //Print results in one formatted line with a space in  between.
            System.out.println("\n"+EasyFormat.format(number,6,0)+EasyFormat.format(plus1,6,0)+EasyFormat.format(times2,6,0)
                               +EasyFormat.format(square,6,0));
            } 
    }
}
  
/**
 * Sample output
 * 
     2     3     4     4
     
     4     5     8    16

     6     7    12    36

     8     9    16    64

    10    11    20   100

    12    13    24   144

    14    15    28   196

    16    17    32   256

    18    19    36   324

    20    21    40   400

    22    23    44   484

    24    25    48   576

    26    27    52   676

    28    29    56   784

    30    31    60   900

    32    33    64  1024

    34    35    68  1156

    36    37    72  1296

    38    39    76  1444

    40    41    80  1600

    42    43    84  1764

    44    45    88  1936

    46    47    92  2116

    48    49    96  2304

    50    51   100  2500
    
 */