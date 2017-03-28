package clubproject;
import java.util.Scanner;
import java.io.*;

/**
 * ClubDriver.java
 *
 * Demonstrates the use of the Scanner class for inputting
 * data from a text file
 *
 * @author Geoff McKeown
 * @version 2
 *
 */

public class ClubDriver {
    
    public static void main(String[] args) {
        final String DELIMITER = "/";
        Scanner fileScan = null;        
        Scanner lineScan = null;  
        
        String nxtLine = null;
        
        String memberName = null;
        int month = 0;
        int year = 0;
        
        // The  data for the Membership objects are held in file MembersInput.
         try{   
            fileScan = new Scanner( new File("MembersInput.txt"));
        }
        catch(Exception e){
            System.out.println(e);}
        
        Club socialClub = new Club();
        
        String [] memberData = new String[3];
        
        while ( fileScan.hasNext() ){
            // Input the line containing  details for next Membership object as a String
            nxtLine = fileScan.nextLine(); 
            
            memberData = nxtLine.split("/");
            
            memberName = memberData[0];
            month = Integer.parseInt(memberData[1]);
            year = Integer.parseInt(memberData[2]);
            
            Membership newMember = new Membership(memberName, month, year);
            socialClub.join(newMember);
       }
        
        System.out.println(socialClub);
    }
    
    public static void selectionSort(Comparable [] a)
    {
        int indexOfNext;
        Comparable next;
        for(int i = 0; i < a.length-1; i++)
        {
            next = a[i];
            indexOfNext = i;
            for (int j = i+1; j < a.length; j++)
                if (a[j].compareTo(next) < 0)
                {
                    next = a[j];
                    indexOfNext = j;
                }
            //Do a swap
            a[indexOfNext] = a[i];
            a[i] = next;
        }
    }    
}
