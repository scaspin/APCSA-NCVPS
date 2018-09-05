
/**
 * Shai Caspin
 * 12/09/16
 * Carrboro High School
 * 
 * Program 520a- mRNA
 * Description: Messenger RNA (mRNA) molecules can be composed of different arrangements of 4 bases:
 *              1.	Adenine
 *              2.	Uracil
 *              3.	Cytosine
 *              4.	Guanine
 *              This program generates and prints out all the combinations of 3 bases which are possible within mRNA..
 * What I learned: I learned how to loop through characters in an array.
 * Difficulties: I had to figure out how to run through characters in an array, but I realized eventually.
 */

public class Prog520a
{
    public static void main(String[] args)
    {
        char[] mRNA= {'A','U','C','G'}; //Creates the array of the fur different bases
        
        for (char a : mRNA) //runs through the first possible base
        {
            for (char b : mRNA)  //runs through the second possible base
            {
                for (char c : mRNA) //runs through the third possible base
                {
                    //Prints all the possible combos
                    System.out.println(Character.toString(a) + Character.toString(b) +Character.toString(c));
                }
            }
        }
    }
}
/**
 * Sample output
 * 
AAA
AAU
AAC
AAG
AUA
AUU
AUC
AUG
ACA
ACU
ACC
ACG
AGA
AGU
AGC
AGG
UAA
UAU
UAC
UAG
UUA
UUU
UUC
UUG
UCA
UCU
UCC
UCG
UGA
UGU
UGC
UGG
CAA
CAU
CAC
CAG
CUA
CUU
CUC
CUG
CCA
CCU
CCC
CCG
CGA
CGU
CGC
CGG
GAA
GAU
GAC
GAG
GUA
GUU
GUC
GUG
GCA
GCU
GCC
GCG
GGA
GGU
GGC
GGG 
 * 
 */