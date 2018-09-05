
/**
 * Shai Caspin
 * Carrboro High School
 * Final Grade Class - establishing student record obejcts
 * 
 * 02/02/17
 */

import java.io.*;
import java.util.*;

public class StudentRecord
{
    private int quiz1;
    private int quiz2;
    private int midTerm;
    private int finalTest;
    private double finalPerc = percent();
    private char letterGrade;
    
    /**
     * Referencing student record to return print out of record
     */
    public String studentRecord()
    {
        return quiz1 +"\t    "+quiz2+"\t    "+midTerm+"\t     "+finalTest+"\t    "+finalPerc+"\t"+letterGrade;
    }
    
    /**
     * Setting student record
     */
    public void studentRecord(int q1, int q2,int mt,int ft)
    {
        quiz1 = q1;
        quiz2 = q2;
        midTerm = mt;
        finalTest = ft;
        finalPerc = percent();
        letterGrade = letterGrade();
    }
    
    /**
     * Mutator methods
     * 
     */
    public void setQuiz1(int q1)
    {
        quiz1=q1;
    }
    public void setQuiz2(int q2)
    {
        quiz2=q2;
    }
    public void setMidTerm(int mt)
    {
        midTerm = mt;
    }
    public void setFinalTest(int ft)
    {
        finalTest = ft;
    }    
    
    /**
     * Accessor methods
     */
    public int getQuiz1()
    { 
        return quiz1;
    }
    public int getQuiz2()
    {
        return quiz2;
    }
    public int getMidTerm()
    {
        return midTerm;
    }
    public int getFinalTest()
    {
        return finalTest;
    }
    
    /**
     * Calculating and returning final grade
     * 
     */
    public double percent()
    {
        finalPerc = (quiz1*10.0)*0.125 + (quiz2*10.0)*0.125 + midTerm*0.25 + finalTest*0.5;
        
        return finalPerc;
    }
    
    /**
     * Letter Grade
     * 
     */
    public char letterGrade()
    {
        if (finalPerc >= 90)
           { 
             return 'A';
           } 
        else if (finalPerc >= 80)
           {
             return 'B';
           } 

        else if (finalPerc >= 70)
           {
             return'C';
           } 

        else if (finalPerc >= 60)
           {
             return'D';
           } 
        else if (finalPerc < 60)
           {
             return  'F';
           } 
        else
        {
            return 'N';
        }
    }
}
