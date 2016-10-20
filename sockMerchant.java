/*
@author: Karteek Pradyumna Bulusu
This problem deals with finding the count of total number of pairing socks. It is a hackerrank problem in the algorithms section.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }      
        int count = 0;
        // assigning value 0 to every element that is paired in order to avoid being paired to other elements during the iteration process. Also I particularly chose the value '0' since the values in c are greater than 0 and there won't be any value in the array = 0.
        for(int a = 0; a<c.length; a++){
            for(int b = a+1; b< c.length; b++){
                if(c[a] !=0 && c[b] != 0){
                    if(c[a] == c[b]){
                        count += 1;
                        c[a] = c[b] = 0;
                    }else{}    
                }
            }
        }
        System.out.println(count);
    }
}
