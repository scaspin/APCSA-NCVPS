
/**
 * Shai Caspin
 * 10/19/16
 * Carrboro HS (NCVPS)
 * Program 166e - Decimal Equlivalents
 * 
 * Description: This program yield a table of decimal equivalents of all proper fractions with denominators 
 *              2 through 14 inclusive when the numerator is less than the denominator.
 * What I learned: I learned how to use interated loops where that are conditioned based on variables in the
 *                 other loop, like is done with the numerator and deonimator variables.
 * 
 */

public class DecimalEquivalents
{
   public static void main(String[] args)
   {
      for (int denominator=2; denominator<=15; denominator++) //increment denominator by 1 up to and including14
      {
          for (int numerator = 1; numerator < denominator; numerator++)//numerator up by 1 as long as less than denominator
          {
              double division = (int)(((double)numerator/denominator)*10000+0.5)/10000.00 ;//runding ad calculating division
              System.out.println(numerator+"/"+denominator+"\t"+division); //output
            }
        }
    }
}
/**
 * Sample output
 * 
1/2	    0.5
1/3	    0.3333
2/3	    0.6667
1/4	    0.25
2/4	    0.5
3/4	    0.75
1/5	    0.2
2/5	    0.4
3/5	    0.6
4/5	    0.8
1/6	    0.1667
2/6	    0.3333
3/6	    0.5
4/6	    0.6667
5/6	    0.8333
1/7	    0.1429
2/7	    0.2857
3/7	    0.4286
4/7	    0.5714
5/7	    0.7143
6/7	    0.8571
1/8	    0.125
2/8	    0.25
3/8	    0.375
4/8	    0.5
5/8	    0.625
6/8	    0.75
7/8	    0.875
1/9	    0.1111
2/9	    0.2222
3/9 	0.3333
4/9	    0.4444
5/9	    0.5556
6/9	   	0.6667
7/9	    0.7778
8/9	    0.8889
1/10	0.1
2/10	0.2
3/10	0.3
4/10	0.4
5/10	0.5
6/10	0.6
7/10	0.7
8/10	0.8
9/10	0.9
1/11	0.0909
2/11	0.1818
3/11	0.2727
4/11	0.3636
5/11	0.4545
6/11	0.5455
7/11	0.6364
8/11	0.7273
9/11	0.8182
10/11	0.9091
1/12	0.0833
2/12	0.1667
3/12	0.25
4/12	0.3333
5/12	0.4167
6/12	0.5
7/12	0.5833
8/12	0.6667
9/12	0.75
10/12	0.8333
11/12	0.9167
1/13	0.0769
2/13	0.1538
3/13	0.2308
4/13	0.3077
5/13	0.3846
6/13	0.4615
7/13	0.5385
8/13	0.6154
9/13	0.6923
10/13	0.7692
11/13	0.8462
12/13	0.9231
1/14	0.0714
2/14	0.1429
3/14	0.2143
4/14	0.2857
5/14	0.3571
6/14	0.4286
7/14	0.5
8/14	0.5714
9/14	0.6429
10/14	0.7143
11/14	0.7857
12/14	0.8571
13/14	0.9286
1/15	0.0667
2/15	0.1333
3/15	0.2
4/15	0.2667
5/15	0.3333
6/15	0.4
7/15	0.4667
8/15	0.5333
9/15	0.6
10/15	0.6667
11/15	0.7333
12/15	0.8
13/15	0.8667
14/15	0.9333
 * */