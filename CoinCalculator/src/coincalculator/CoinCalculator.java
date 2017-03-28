/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coincalculator;
import java.util.Scanner;
/**
 * Program to work out the change given in the smallest amount of coins.
 * @author Christopher Irvine
 */
public class CoinCalculator 
{

    /**
     * 
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Initialise the coin variables
        int fifty;
        int twenty;
        int ten;
        int five;
        int two;
        int penny;
        
        //Ask the user to enter an amount
        int money;
        System.out.println("Enter the amount of pennies (must be less than"
                + " 100):");
        money = scan.nextInt();
        
        //Find out how many 50p coins are needed
        fifty = money/50;
        System.out.println("Number of 50p coins used = " + fifty);
        
        //Adjust the amount of money left
        money = money%50;
        
        //Find out how many 20p coins are needed
        twenty = money/20;
        System.out.println("Number of 20p coins used = " + twenty);
        
        //Adjust the amount of money left
        money = money%20;
        
        //Find out how many 10p coins are needed
        ten = money/10;
        System.out.println("Number of 10p coins used = " + ten);
        
        //Adjust the amount of money left
        money = money%10;
        
        //Find out how many 5p coins are needed
        five = money/5;
        System.out.println("Numbert of 5p coins used = " + five);
        
        //Adjust the amount of money left
        money = money%5;
        
        //Find out how many 2p coins are needed
        two = money/2;
        System.out.println("Number of 2p coins used = " + two);
        
        //Adjust the amount of money left
        money = money%2;
        
        //Find out how many pennies are needed
        penny = money/1;
        System.out.println("Number of pennies used = " + penny);
    }
    
}
