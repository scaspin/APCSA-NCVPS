
/**
 * Shai Caspin
 * 10/15/16
 * Carrboro High School (NCVPS)
 * Program 162d- Population growth
 * 
 * Description: This program takes in the precentage of population growth, year, and population at said year,
 *              and calculates by what year the population will double given that the growth rate of the
 *              population stays constant. The program outputs the population count in millions every year until
 *              it is double the initial population alongside the year.
 * What I learned: I learned how to integrate different variables in loop conditions.
 * Difficulties:I forgot to divide the rate by 100, but then realized my mistake and fixed it.
 */

import java.io.* ;
import java.util.*;

public class PopulationGrowth
{
    public static void main(String[] args)
    {
        Scanner growthRateInput = new Scanner(System.in);
        
        //get initial info. for calculations
        System.out.print("Enter annual growth rate: ");
        double growthRate = growthRateInput.nextDouble();
        
        //year and initial populaiton don't affect time it takes for population to double
        System.out.print("Enter year of population measurement: ");
        int year = growthRateInput.nextInt();
        System.out.print("Enter population in millions: ");
        int initialPopulation = growthRateInput.nextInt();
        
        double population = (double)initialPopulation;
        
        //print headlines
        System.out.println("\n------Growth rate "+ growthRate+ "% annually------");
        System.out.println("Year               Population (in millions)");
        
        for (year=year; population < (2*initialPopulation) ; year++) //loop for years starting with year 2010
        {
                                   
            population += (int)(population*(growthRate/100)); //calculate population every year
                        
            System.out.println(year + "               "+population); //print year and population during year
        }
        
        System.out.println("\nThe population will double by " +((int)year-1)); //display final year for doubling
    }
}
/**
 * Sample output
 * 
Enter annual growth rate: 2.9
Enter year of population measurement: 2010
Enter population in millions: 236

------Growth rate 2.9% annually------
Year               Population (in millions)
2010               242.0
2011               249.0
2012               256.0
2013               263.0
2014               270.0
2015               277.0
2016               285.0
2017               293.0
2018               301.0
2019               309.0
2020               317.0
2021               326.0
2022               335.0
2023               344.0
2024               353.0
2025               363.0
2026               373.0
2027               383.0
2028               394.0
2029               405.0
2030               416.0
2031               428.0
2032               440.0
2033               452.0
2034               465.0
2035               478.0

The population will double by 2035
 * 
 * 
 * 
Enter annual growth rate: 5
Enter year of population measurement: 1998
Enter population in millions: 200

------Growth rate 5.0% annually------
Year               Population (in millions)
1998               210.0
1999               220.0
2000               231.0
2001               242.0
2002               254.0
2003               266.0
2004               279.0
2005               292.0
2006               306.0
2007               321.0
2008               337.0
2009               353.0
2010               370.0
2011               388.0
2012               407.0

The population will double by 2012
 * 
 * 
 * 
Enter annual growth rate: 6.7
Enter year of population measurement: 2000
Enter population in millions: 607

------Growth rate 6.7% annually------
Year               Population (in millions)
2000               647.0
2001               690.0
2002               736.0
2003               785.0
2004               837.0
2005               893.0
2006               952.0
2007               1015.0
2008               1083.0
2009               1155.0
2010               1232.0

The population will double by 2010
 * 
 * 
 * 
Enter annual growth rate: 2.1
Enter year of population measurement: 2015
Enter population in millions: 3002

------Growth rate 2.1% annually------
Year               Population (in millions)
2015               3065.0
2016               3129.0
2017               3194.0
2018               3261.0
2019               3329.0
2020               3398.0
2021               3469.0
2022               3541.0
2023               3615.0
2024               3690.0
2025               3767.0
2026               3846.0
2027               3926.0
2028               4008.0
2029               4092.0
2030               4177.0
2031               4264.0
2032               4353.0
2033               4444.0
2034               4537.0
2035               4632.0
2036               4729.0
2037               4828.0
2038               4929.0
2039               5032.0
2040               5137.0
2041               5244.0
2042               5354.0
2043               5466.0
2044               5580.0
2045               5697.0
2046               5816.0
2047               5938.0
2048               6062.0

The population will double by 2048
 */