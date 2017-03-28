/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

import java.util.Scanner;
/**
 * A simple program to covert Kilograms to Pounds. 
 * 1 pound is taken to be 0.454kg 
 * @author ruw12gbu
 */
public class Converter 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        float kilograms;
        System.out.println("Enter the weight in Kilograms:");
        kilograms = scan.nextFloat();
        kilograms *= 0.454;
        
        System.out.println("The weight you entered in pounds is: " + kilograms + "lbs");
    }
    
}
