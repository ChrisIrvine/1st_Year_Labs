/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bodymassindex;
import java.util.Scanner; //import the Scanner class

/**
 * This program will calculate a persons BMI from their height and weight
 * @author Chris
 */
public class BodyMassIndex 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Create a new scanner object
        Scanner scan = new Scanner(System.in);
        //Ask the user to enter some data
        double weight;
        System.out.println("Please enter your weight in kilograms");
        weight = scan.nextDouble();
        System.out.println("Please enter your height in meters");
        double height;
        height = scan.nextDouble();
        //Invoke and print out the bodyMassIndex method
        String bMI;
        bMI = bodyMassIndex(weight, height);
        System.out.println(bMI);
        
    }
    
    public static String bodyMassIndex(double weight, double height)
    {
        //Calculate the BMI
        double bMI;
        height = height*height;
        bMI = weight/height;
        //Work out what catagory the user's data falls under
        if(bMI<16)
        {
            return "Seriously Underweight";
        }
        else if(bMI<=16||bMI<18)
        {
            return "Underweight";
        }
        else if(bMI<=18|bMI<24)
        {
            return "Normal Weight";
        }
        else if(bMI<=24||bMI<29)
        {
            return "Overweight";
        }
        else if(bMI<=29||bMI<35)
        {
            return "Seriously Overweight";
        }
        else
        {
            return "Obese";   
        }
    }
}
