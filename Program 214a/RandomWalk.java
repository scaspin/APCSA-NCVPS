
/**
 *Shai Caspin
 *11/09/16
 *Carrboro High School (NCVPS)
 *Program 214a - random walk program
 *
 *Description:Someone is standing at the center of a bridge that is 7 ft bridge long. Their stride is exactly one
 *            foot. They can’t control the direction they are going but the bridge is very narrow and they can 
 *            only go forward or backward with each step. This program  calculates how many steps the 
 *            person will walk before exiting the bridge. This program executes this simulation 1000 times 
 *            and the output displays the average and greatest number of steps taken. 
 *What I learned: I learned how to use Monte carlo simulations and random number generators to perform caluclations
 *                that are otherwise very hard to perform. I also learned the importance of using logical steps in 
 *                programs to make sure numbers are kept well organzied and follow a certain logic.
 *Difficulties: I at first thought the program meant that the person was standing on one side and trying to get to the
 *              other, which yielded very high and improbably results, I then read the instructions again and 
 *              realized my mistakes.
 */

import java.util.*;


public class RandomWalk
{
    public static void main(String args[])
    {
        //Declare random number generator and variable associated with it
        Random rndm = new Random();
        int direction;
        
        //Print headers
        System.out.print("Run\tAverage\t\tGreatest Number of Steps");
        
        //SIMULATIONS ARE RUN 20 DIFFERENT TIMES
        for(int simulationNum = 1; simulationNum<=20; simulationNum++)
        {
            //Variables are redeclared for every time the simulation is run
            double stepAverage = 0;
            long stepsTotal = 0;
            int stepsMax = 0;
           
           // Each scenario is ran 1000 times, then averaged and displays a result from that simulation
            for (int iteration = 0; iteration<=1000; iteration++)
            {
                int steps=0;
                double bridgePosition = 3.5; //position is in the middle of the 7 foot bridge, 7/2=3.5
                
                //Loop to detemine number of steps needed to get off the bridge
                do
                {  
                   direction = rndm.nextInt(2); //random number either 0 or 1
                   
                   if (direction==0) //zero means step back
                   {
                       bridgePosition--;
                    }
                   else //1 means step forwards
                   {
                       bridgePosition++;
                    }
                   steps++; //counter for num of steps
                   
                } while (0<bridgePosition && bridgePosition<7); //keep doing while still on bridge
                
                //Counter for all steps
                stepsTotal=stepsTotal+steps;
                
                //TO FIND MAX THROUGH THE ITERATIONS
                if (stepsMax<steps)
                {
                    stepsMax=steps;
                }

           }
          
           //Calculate average by divided total steps in all 1000 scenarios by 1000
           stepAverage= stepsTotal/1000.00;
           
           //DISPLAY OUTPUT
           System.out.print("\n#"+EasyFormat.format(simulationNum,2,0)+EasyFormat.format(stepAverage,12,4)+EasyFormat.format(stepsMax,20,0));
           
        }
    }
}
/**
 * Sample output
 * 
Run Average     Greatest Number of Steps
# 1     15.8700                  76
# 2     15.8640                  90
# 3     15.4540                  92
# 4     16.0140                  88
# 5     15.6740                 120
# 6     15.4740                 114
# 7     16.4020                 114
# 8     15.6160                  92
# 9     15.6260                  70
#10     15.8780                  74
#11     15.2980                  70
#12     16.0280                 100
#13     16.1240                  72
#14     16.1200                  96
#15     16.0620                  80
#16     15.5580                  80
#17     16.0400                  96
#18     15.8360                  98
#19     15.7580                  80
#20     15.9200                  94
 * 
 * 
 * 
Run Average     Greatest Number of Steps
# 1     15.5660                  72
# 2     15.6800                  86
# 3     15.5020                  88
# 4     16.5160                  88
# 5     16.8340                 100
# 6     15.7060                  82
# 7     16.2960                 104
# 8     15.9920                 102
# 9     15.6360                 106
#10     16.6680                 140
#11     15.8940                  96
#12     16.5040                  94
#13     15.9920                  92
#14     15.5820                 100
#15     16.0460                  98
#16     16.5180                 100
#17     16.9440                  98
#18     15.7180                  88
#19     15.3380                  76
#20     15.5700                 138
 * 
 * 
 * 
Run Average     Greatest Number of Steps
# 1     15.4400                  94
# 2     16.5680                 104
# 3     15.3640                 100
# 4     15.9920                 108
# 5     15.8880                  94
# 6     15.7480                  84
# 7     15.5060                 106
# 8     15.7040                  82
# 9     16.0840                 104
#10     16.3460                 100
#11     16.6420                 146
#12     16.3120                  88
#13     16.4920                  78
#14     16.1600                  90
#15     16.1860                 118
#16     16.1500                  84
#17     15.4400                 118
#18     16.3460                  98
#19     15.7960                 118
#20     16.6380                  90
 *
 */