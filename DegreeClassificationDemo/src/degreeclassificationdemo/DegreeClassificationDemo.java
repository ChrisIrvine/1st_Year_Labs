/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package degreeclassificationdemo;
import java.util.Scanner;

/**
 * Program to evaluate a percentage mark and return with the correct grade
 * boundary.
 * @author Chris
 */
public class DegreeClassificationDemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int mark;
        System.out.println("Please enter the mark");
        mark = scan.nextInt();
        String classification;
        String range;
        classification = findClassification(mark);
        range = markRange(classification);
        System.out.println(classification + " " + range);
    }
    
    public static String findClassification(int mark)
    {
        if (mark < 39)
        {
            return "Fail";
        }
        else if (mark >= 40 && mark <= 49)
        {
            return "Thrid";
        }
        else if (mark >= 50 && mark <= 59)
        {
            return "Two(2)";
        }
        else if (mark >= 60 && mark <= 69)
        {
            return "Two(1)";
        }
        else if (mark >= 70 && mark <= 100)
        {
            return "First";
        }
        else 
        {
            return "Please enter a valid mark";
        }
    }
    
    public static String markRange(String degreeClass)
    {
        switch(degreeClass)
        {
            case "Fail":
                return "[0, 39]";
            case "Third":
                return "[40, 49]";
            case "Two(2)":
                return "[50, 59]";
            case "Two(1)":
                return "[60, 69]";
            case "First":
                return "[70, 100]";
            default:
                return "Error";
        }
    }
}
