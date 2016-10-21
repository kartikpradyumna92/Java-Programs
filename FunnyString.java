/*
@author: Karteek Pradyumna Bulusu
This solves a Hackerrank problem which deals with comparision of difference
between of elements of a String array to its reversal.
I obtained the ASCII of each character of the string and stored in an integer array and obtained reverse of it. Upon doing that, I compared the difference between the elements in both the arrays.
*/
import java.io.*;
import java.util.*;

public class FunnyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        String s = "";
        for(int a = 0; a < testCases; a++){
            s = sc.next();
            int count = 0;
            boolean flag = true;
            char[] array = s.toCharArray();
            int[] ascii = new int[array.length];
            int[] reverse = new int[ascii.length];
            // finding the ASCII and storing in both ascii and reverse array. Reverse array will have elements
            // in reverse order.
            for(int b = 0; b< array.length; b++){
                ascii[b]= (int) array[b];
                reverse[array.length -1 - b] = ascii[b];
            }
            // for each element in both arrays, I am seeing if difference between consecutive elements in 
            // ascii is equal to that of revers array. 
            for(int c = 1; c< ascii.length; c++){
                if(Math.abs(ascii[c] - ascii[c-1]) == Math.abs(reverse[c] - reverse[c-1])){
                    if(count != 0){
                        flag = true;
                    }else{
                        flag = false;    
                    }
                }else{
                    count ++;
                    flag = true;  
                }
            }
            if(flag == true){
                System.out.println("Not Funny");
            }else{
                System.out.println("Funny");
            }
        }
    }
}
