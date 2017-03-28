/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leapyear;

/**
 * Program to evaluate all the leap years between the years 2000 to 2999
 * and print them into 10 columns, one for each century.
 * @author ruw12gbu
 */
public class LeapYear 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for (int year = 2000; year < 3000; year++)
        {
            if (isLeapYear(year))
            {
                System.out.print(year + "  |  ");
            }
            if (year % 100 == 0) {
                System.out.println();
            }
        }
    } 
    
    public static boolean isLeapYear(int year)
    {
        if((year%4)!=0)
            return false;
        else if ((year%100)!=0)
            return true;
        else if ((year%400)!=0)
            return false;
        else
            return true;
    }
}
