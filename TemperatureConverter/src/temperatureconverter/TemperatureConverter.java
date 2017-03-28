/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temperatureconverter;
import java.util.Scanner;
        
/**
 * This is a two way converter to convert Centigrade to Fahrenheit and vice
 * versa.
 * @author Christopher Irvine
 */
public class TemperatureConverter
{

    /**
     * Method to get the user to enter Centigrade and 
     */
    public static void main(String[] args) 
    {
        // Create a new scanner called scan
        Scanner scan = new Scanner(System.in);
        
        int answer;
        System.out.println("What temperature are you starting with? 1(C) or 2(F)"); 
        answer = scan.nextInt();
        
        if (answer == 1)
        {
            //Ask the user to enter a double for Centigrade
            double centigradeOne;
            System.out.println("Enter the temperature in Centigrade:");
            centigradeOne = scan.nextDouble();
            
            //Convert the Centigrade value into Fahrenheit
            double fahrenheitOne;
            fahrenheitOne = (centigradeOne*9)/5+34;
            System.out.println("Your temperature in Fahrenheit is: " + fahrenheitOne);
        }
        else
        {
            //Ask the user to enter a double for Fahrenheit
            double fahrenheitTwo;
            System.out.println("Enter the temperature in Fahrenheit:");
            fahrenheitTwo = scan.nextDouble();
            
            double centigradeTwo;
            centigradeTwo = (fahrenheitTwo-32)*5/9;
            System.out.println("Your temperature in Centigrade is: " + centigradeTwo);
        }
    }
        
    
}
