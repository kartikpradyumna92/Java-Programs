/*
@author: Karteek Pradyumna Bulusu
@date: 11/22/2016
* Hackerrank Algorithm -> Implementations problem pertaining to find the elements between the elements of two arrays satisfying two conditions. 
First condition is that all the elements of the array are factor of the number
Second condition is that the number is factor is factor all array elements.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        //Sorting the arrays
        Arrays.sort(a);
        Arrays.sort(b);
        //difference between last element of first array and first element of the last array
        int difference = b[0] - a[n-1];
        HashSet hs = new HashSet();
        for(int i = 0; i<= difference; i++){
            int number = a[n-1] + i;
            //condition 1: if number % array element == 0
            boolean aflag = false;
            for(int j = 0; j< a.length; j++){
                if(number % a[j] !=0){
                    aflag = true;
                }
            }
            //condition 2: if array element % number == 0
            boolean bflag = false;
            for(int k = 0 ; k< b.length; k++){
                if(b[k] % number != 0){
                    bflag = true;
                }
            }
            //if both the conditions are satisfied.
            if(aflag == false && bflag == false){
                hs.add(number);
            }
        }
        System.out.println("The number of integers between the two sets are: "+hs.size());
    }
}
