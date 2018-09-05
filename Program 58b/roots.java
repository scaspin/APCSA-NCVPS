
/**
 * Shai Caspin
 * Carrboro High School (NCVPS)
 * 09/20/16
 * Program 58b - finding roots
 * 
 * Description: This program takes user input for the coefficients of quadratic equations (not necessarily integers)
 *              and yields the real roots of the functions. If a root does not exist, the program yiels a NaN output.
 * What I leanred: I leanred how to use mathematical operations such as square root.
 * Difficulties: I couldn't decide whether to use integers or doubles, but settled on doubles in case more complicated 
 *               equations want to be solved.
 */

//allowing for user input
import java.io.* ;
import java.util.* ;

public class roots
{
  public static void main(String args[])
  {
      System.out.println("Root Solver for Quadratic Equations");
      
      
      //User input
      Scanner coefficientsOfQuadraticEquationReader = new Scanner(System.in) ;
      System.out.print("Enter the three coefficients of the quadractic equation \nin consecutive order with a space between each one:") ;
      
      //Assign input to variables. I chose to use doubles so the program could also solve more complex quadratics
      double firstCoefficient  = coefficientsOfQuadraticEquationReader.nextDouble();
      double secondCoefficient = coefficientsOfQuadraticEquationReader.nextDouble();
      double thirdCoefficient = coefficientsOfQuadraticEquationReader.nextDouble();
      
      // Calculations
      double rootA = ( (-1 * secondCoefficient) + Math.sqrt((secondCoefficient * secondCoefficient) - (4 * firstCoefficient * thirdCoefficient))) / (2 * firstCoefficient) ; 
      //When the square root is positive
      double rootB = ( (-1 * secondCoefficient) - Math.sqrt((secondCoefficient * secondCoefficient) - (4 * firstCoefficient * thirdCoefficient))) / (2 * firstCoefficient) ; 
      // When the square root is negative
  
      //Output
      System.out.println("The roots of the polynomial " + firstCoefficient + "x^2 + " + secondCoefficient + "x + " 
                        + thirdCoefficient + "\nare " + rootA + " and " + rootB + ". \nIf NaN is returned, the root does not exist.") ;
                        
    
    }
}
/**
 * Sample output
 * 
 *Root Solver for Quadratic Equations
 *Enter the three coefficients of the quadractic equation 
 *in consecutive order with a space between each one:1 4 4
 *The roots of the polynomial 1.0x^2 + 4.0x + 4.0
 *are -2.0 and -2.0. 
 *If NaN is returned, the root does not exist.
 *
 *Root Solver for Quadratic Equations
 *Enter the three coefficients of the quadractic equation 
 *in consecutive order with a space between each one:1 5 6
 *The roots of the polynomial 1.0x^2 + 5.0x + 6.0
 *are -2.0 and -3.0. 
 *If NaN is returned, the root does not exist.
 */
