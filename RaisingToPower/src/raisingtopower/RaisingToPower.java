/*
 * Program to run an algorithm that will then determine the worst-case run-time
 * using the run-time complexity algorithm. 
 *
 * Given a non-zero number, x, and a positive integer, n, to output the value
 * of x raised to the power of n.
 */
package raisingtopower;

/**
 *
 * @author Christopher Irvine
 */

import java.util.Scanner;
import java.lang.Math;

public class RaisingToPower 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        double n = scan.nextInt();
        
        long t1 = System.nanoTime();
        double xPowerOfN = Math.pow(x , n);
        
        System.out.println(xPowerOfN);
        
        double p = x;
        
        for(int i = 0; i < n-1; i++)
        {
            p *= x;
        }
        
        System.out.println(p);
        long t2 = System.nanoTime();
        
        long timeTaken = t2-t1;
        System.out.println(timeTaken);
    }
    
}
