
/*
 * Shai Caspin
 * 09/17/16
 * Carrboro High School (NCVPS)
 * Computer Science A
 * Miles per Gallon Program (54a)
 * 
 * Description: This program calculates the average miles per gallon of four different cars
 *              based on previously given information.
 * What I learned: I leanred how to round using casting and multipication.
 * Difficulties: The only difficulty I had was keeping up with all the different variable names.
 */
public class MilesPerGallom
{
    public static void main(String[] args)
    {
        //Declaring and assigning variables for 1970 VW Bug
        int miles1970VWBug = 286 ;
        int gallons1970VWBug = 9 ;
        
        //Declaring and assigning variables for 1979 Firebird
        int miles1979Firebird = 412 ;
        int gallons1979Firebird = 40 ;
        
        //Declaring and assigning variables for 1980 Subaru
        int miles1980Subaru = 361 ;
        int gallons1980Subaru = 18 ;
        
        //Declaring and assigning variables for 1975 Cutlass
        int miles1975Cutlass = 161 ;
        int gallons1975Cutlass = 11 ;
        
        //Calculating miles per gallon for each car
        //1970 VW Bug
        double mpg1970VWBug = (double) miles1970VWBug/gallons1970VWBug ;
        double mpg1970VWBugRounded= (int)(mpg1970VWBug*100+0.5)/100.00 ;
        //1979 Firebird
        double mpg1979Firebird = (double) miles1979Firebird/gallons1979Firebird ;
        double mpg1979FirebirdRounded= (int)(mpg1979Firebird*100+0.5)/100.00 ;
        //1980 subaru
        double mpg1980Subaru = (double) miles1980Subaru/gallons1980Subaru ;
        double mpg1980SubaruRounded= (int)(mpg1980Subaru*100+0.5)/100.00 ;
       //1975 Cutlass
        double mpg1975Cutlass = (double) miles1975Cutlass/gallons1975Cutlass ;
        double mpg1975CutlassRounded= (int)(mpg1975Cutlass*100+0.5)/100.00 ;
       
        
        //Displaying results
        System.out.println(" The resulting average miles per gallon of each car are: ") ;
        System.out.println(" The 1970 VW Bug averaged " + mpg1970VWBugRounded + " miles per gallon.") ;
        System.out.println(" The 1979 Firebird averaged " + mpg1979FirebirdRounded + " miles per gallon.") ;
        System.out.println(" The 1980 Subaru averaged " + mpg1980SubaruRounded + " miles per gallon.") ;
        System.out.println(" The 1975 Cutlass averaged " + mpg1975CutlassRounded + " miles per gallon.") ;
        
    }
}
/*Sample output:
 * 
 * The resulting average miles per gallon of each car are: 
 * The 1970 VW Bug averaged 31.78 miles per gallon.
 * The 1979 Firebird averaged 10.3 miles per gallon.
 * The 1980 Subaru averaged 20.06 miles per gallon.
 * The 1975 Cutlass averaged 14.64 miles per gallon.
 */

        