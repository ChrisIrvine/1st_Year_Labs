/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumcubed;

/**
 * Program to find the four integers that when you cube the sum of their parts
 * the total enters the number, between 100 and 500.
 * @author Chris
 */
public class SumCubed 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int number;
        int count = 0;
        number = 100;
        while (number <= 500 && count < 4)
        {
            int a;
            int b;
            int c;
            
            a = (number%10);
            b = (number / 10 % 10);
            c = (number / 100);
            
            if ((a*a*a) + (b*b*b) + (c*c*c) == number)
            {
                System.out.println(number);
                count ++;
            }
            
            number ++;   
        }
    }
    
}
