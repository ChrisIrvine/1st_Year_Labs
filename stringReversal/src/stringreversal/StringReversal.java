/*
 * Program to implement and test the string reversal algorithm
 */
package stringreversal;
import java.util.Scanner;
/**
 *
 * @author ruw12gbu
 */
public class StringReversal {

    /**
     * Given a character string, s, to output a string consisting of the 
     * characters in s but in reverse order.
     * n = length of s
     * s = character string
     * headOfS = substring of s in character positions 1 to 1
     * tailOfS = substring of s in character positions 2 to n
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        if (n == 1)
        {
            System.out.println(s);
        }
        else 
        {
            char headOfS = s.charAt(0);
            String tailOfS = s.substring(1);
            System.out.println(tailOfS + headOfS);
        }
    }
    
}
