
/**
 * This class calculates GCD of either two numbers or LCM of three numbers based on input.
 * 
 * Shai Caspin
 * 01/20/17
 */
public class GCD
{
   private int A;
   private int B;
   private int C;
   
    /**
     * Finds GCD of two numbers
     */
    public int GCD(int a, int b)
    {
        A = a;
        B=b; 
        
        if (A<B)
        {
            int placeHolder = B;
            B=A;
            A=placeHolder;
        }
        while (A!=0)
        {
            A = A-B;
            
            if (A<B && A!=0)
            {
                int placeHolder = B;
                B=A;
                A=placeHolder;
            }
        }
        return B;
    }
    
    
    /**
     * Finds GCD/LCM of three numbers
     */
   public int GCD(int a, int b, int c)
    {
        A = GCD(a,b);
        B= c;
        
        B = GCD(A,B);
        return B;
    } 
    }

   
