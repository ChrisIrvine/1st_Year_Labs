/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cointoss;
import java.util.Random;

/**
 * Program to toss a coin 'm' times and to generate the number of heads and
 * tails that result from that toss.
 * @author ruw12gbu
 */
public class CoinToss 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {       
        Random randomGenerator = new Random();

        for(int m = 1; m <= 101; m += 10)
        {        
            int even = 0;
            int odd = 0;
            for (int i = 0; i < m; i++) {
                if((randomGenerator.nextInt()%2)==0)
                {
                    even += 1;
                }
                else
                {
                    odd += 1;
                }
            }
            System.out.println("Heads = " + even + " and Tails = " + odd);
        }
    }
}
