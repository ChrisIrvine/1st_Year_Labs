/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplesums;

import java.util.Scanner;
/**
 * Imported the Scanner class from the Utility library
 * A simple program to perform some basic arithmetic
 * @author ruw12gbu
 */
public class SimpleSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner numbers = new Scanner(System.in);
        
        float floatNumber; Float floatNumbers;
        System.out.println("Enter two decimal numbers:");
        floatNumber = numbers.nextFloat();
        floatNumbers = numbers.nextFloat();
        
        System.out.println("The floating point numbers entered was : " + floatNumber + " " + floatNumbers);
        
        int a; int b;
        System.out.println("Enter two whole numbers:");
        a = numbers.nextInt();
        b = numbers.nextInt();
        a += b;
        System.out.println("The sum of the two numbers entered is: " + a);
        
        int x; int y;
        System.out.println("Enter two whole numbers:");
        x = numbers.nextInt();
        y = numbers.nextInt();
        x -= y;
        System.out.println("The difference of the two whole numbers entered is: " + x);
        
        int c; int d;
        System.out.println("Enter two whole nubmers:");
        c = numbers.nextInt();
        d = numbers.nextInt();
        c *= d;
        System.out.println("The product of the two whole numbers entered is: " + c);
    }
}
