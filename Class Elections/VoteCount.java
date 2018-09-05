/*
*Shai Caspin
*AP Computer Science A
*09/16/2016
*Carrboro High School (NCVPS)
*Program 52h- Class Elections- Extra Credit
*
*Descirption: This program calculates the number of votes each candidate recieved in the elections based
*             off the total and the differences between the winner and all the other candidates.
*What I learned: I leanred how to calculate using Java and a combination of variables and constant integers.
*Difficulties: I had to do the math on paper for the initial calculation for the number of the votes Mary got.
*              I initially tried to write a program for actually solving the equalitites but thought this was
*              an easier solutions.
 */

public class VoteCount
{
    public static void main(String[] args)
    {

        //* Declaration of all variable
int maryVotes;
int peterVotes;
int paulVotes;
int joanVotes;

maryVotes = (9485 + 74 + 23 + 86)/4; //* calculating the number of votes for mary

peterVotes = maryVotes - 74 ; //*Calculating all votes for Peter
paulVotes = maryVotes - 23 ;  //*Calculating all votes for Paul
joanVotes = maryVotes - 86 ;  //*Calculating all votes for Joan

int totalVotes= maryVotes+peterVotes+paulVotes+joanVotes; //*Recalculating total to make sure calculations are correct

//*displaying all final counts
System.out.println("Mary won the elections which gives her " + maryVotes + " votes.");
System.out.println("Peter has 74 less votes than Mary, giving him " + peterVotes + " votes.");
System.out.println("Paul has 23 less votes than Mary, giving him " + paulVotes+ " votes.");
System.out.println("Joan has 86 less votes than Mary, giving him " + joanVotes + " votes.");

System.out.println("The total number of votes casted in the election is " +totalVotes+ " votes.");
    }
}


/*Output:
 * Mary won the elections which gives her 2417 votes.
 *Peter has 74 less votes than Mary, giving him 2343 votes.
 *Paul has 23 less votes than Mary, giving him 2394 votes.
 *Joan has 86 less votes than Mary, giving him 2331 votes.
 *The total number of votes casted in the election is 9485 votes.
 */
