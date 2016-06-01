/*
* This program aims in coverting the time provided in 12 hour clock to a 24hr clock. The time should be in the format of hh:mm:ssAM/PM.
* This would be converted to the 24 hr clock.
* In the command line argument while executing, provide the time in 12 hour clock.
* @author: Karteek Pradyumna Bulusu
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Timeconv {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        time = time.toLowerCase();
        int len = time.length();
        String first_two = time.substring(0,2);
        int num = Integer.parseInt(first_two);
        
        
        int i = 12;
        String pm = "pm";
        String am = "am";
	// If hours is in between 1 and 12 and it is AM, the remove AM. If number is equal to 12, replace it with 00 or else print as such.
        if(num>0 && num<13 && time.endsWith("am")){
             if(num == 12){
                 char[] cm = am.toCharArray();
                for(char b : cm){
                    time = time.replace(""+b,"");
                }
                int n = 00;
                String s = String.format("%02d",n);
                String replaced = time.replaceAll(first_two, s);
                System.out.print(replaced); 
                 
            }else{
                char[] cm = am.toCharArray();
                for(char b : cm){
                    time = time.replace(""+b,"");
                    
                }
                 System.out.print(time);
            }
        }
        // If hours is between 1 and 12 and it is PM, then remove PM. If number is equal to 12 replace it with 00, or else add 12 to the number
	// and replace in the hours place. This will convert the time into 24 hour clock.
        if(num>0 && num<13 && time.endsWith("pm")){
           
            char[] ch = pm.toCharArray();
            for(char a : ch){
                time = time.replace(""+a,"");
            }
            if(num==12){
                int n = 12;
                String s = String.format("%02d",n);
                String replaced = time.replaceAll(first_two, s);
                System.out.print(replaced);
            }else{
                num += 12;
                String first = String.valueOf(num);
                String replaced = time.replaceAll(first_two, first);
                System.out.print(replaced);
             }
        }
        
    }
}
