
/**
 * Shai Caspin
 * 02/25/2017
 * Carrboro Hs (NCVPs)
 * Program 427a-sieve of erantosthenes
 * 
 * Description:Use the Sieve of Eratosthenes to locate and print out all prime numbers from 1 to 1000.
 * Difficulties: making sure all numbers were actually counted.
 * 
 */
public class Program427a
{
    public static void main(String[] args)
    {
        //Set up array of booleans
        boolean[] numbers = new boolean[1000];
        
        //Define all parameters of the array as true, meaning not prime
        for (int i = 0; i<1000; i++)
        {
            numbers[i]=true;
        }
        
        //Go through each of the steps and take out all multiples by turning them to false
        for (int j = 2; j<1000; j++)
        {
            for (int k = 2; k<1000; k=k+j)
            {
                if (k%j==0)
                {
                    if (numbers[k]==true)
                    {
                        numbers[k]=false;
                    }
                }
            }
        }
        
        
        //Printing out the index of those that are still true in a 5x20 table
        int count = 0 ;
        for (int i = 0; i<200; i++)
        {
            System.out.println();
           
            for (int j = 0; j<=5; j++)
            {
                if (numbers[count]==true)
                {
                    System.out.print(count+"\t");
                 }
                 
                if (count<999)
                {
                 count++; 
                }
            }
        }
    }
}
/**
 * Sample output
 * 
 *   2   3   5   7   11  
     13  17  19  23  29  
     31  37  41  43  47
     53  59  61  67  71  
     73  79  83  89  97  
    101 103 107 109 113
    127 131 137 139 149 
    151 157 163 167 173 
    179 181 191 193 197
    199 211 223 227 229 
    233 239 241 251 257 
    263 269 271 277 281
    283 293 307 311 313 
    317 331 337 347 349 
    353 359 367 373 379
    383 389 397 401 409 
    419 421 431 433 439 
    443 449 457 461 463
    467 479 487 491 499 
    503 509 521 523 541 
    547 557 563 569 571
    577 587 593 599 601 
    607 613 617 619 631 
    641 643 647 653 659
    661 673 677 683 691 
    701 709 719 727 733 
    739 743 751 757 761
    769 773 787 797 809 
    811 821 823 827 829 
    839 853 857 859 863
    877 881 883 887 907 
    911 919 929 937 941 
    947 953 967 971 977
    983 991 997

 */