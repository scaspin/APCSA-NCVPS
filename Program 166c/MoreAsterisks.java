
/**
 *Shai Caspin
 *10/19/2016
 *Carrboro HS (NCVPS)
 *Program 166c- Extra cRedit- pyramid of stars
 *
 *Desription:This program produces a pyramid of star with a base 12 stars wide.
 *What I learned: I learned how to sue a counter to print spaces to get character in right place.
 *Difficulties: Getting the alignment perfectly was hard.
 */

public class MoreAsterisks
{
    public static void main(String[] args)
    {
        for (int numStars=1; numStars<12; numStars += 2)//every row has an additional two stars for 6 rows
        {
            for (int spaces=0; spaces <= (5 - numStars / 2); spaces++)//spaces are 5-half a side of column
            {
                System.out.print(" "); //print space
            }
            for (int starsPrinted=0; starsPrinted<numStars; starsPrinted++) //print stars
            {
                System.out.print("*");
            }
        System.out.println(); //new line
        }
    }
}

/** Sample output
      *
     ***
    *****
   *******
  *********
 ***********

 */ 