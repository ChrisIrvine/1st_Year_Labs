/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booknumber;
import java.util.Scanner; //Import the scanner class

/**
 * Program to evaluate a 9 digit number to create an International Standard
 * Book Number.
 * @author Chris
 */
public class BookNumber 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Create a new scanenr object
        Scanner scan = new Scanner(System.in);
        //Scan in all the variables
        
        String iSBN;
        System.out.println("Please enter your 9 digit number");
        iSBN = scan.nextLine();
        
        String j;
        j = checkSum(Integer.valueOf(iSBN));
        System.out.println(iSBN+j);
    }
    
    public static String checkSum(int iSBN)
    {
        //create 9 seperate variables for each digit of iSBN
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        //seperate and assign each digit of iSBN
        a = iSBN%10;
        iSBN = iSBN/10;
        b = iSBN%10;
        iSBN = iSBN/10;
        c = iSBN%10;
        iSBN = iSBN/10;
        d = iSBN%10;
        iSBN = iSBN/10;
        e = iSBN%10;
        iSBN = iSBN/10;
        f = iSBN%10;
        iSBN = iSBN/10;
        g = iSBN%10;
        iSBN = iSBN/10;
        h = iSBN%10;
        iSBN = iSBN/10;
        i = iSBN%10;
        //Calcualte the tenth digit
        int j;
        j = ((i*1)+(h*2)+(g*3)+(f*4)+(e*5)+(d*6)+(c*7)+(b*8)+(a*9))%11;
        //Evalaute the result
        if(j>=10)
        {
            return "x";
        }
         return String.valueOf(j);
    }
}
