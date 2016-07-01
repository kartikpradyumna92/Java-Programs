/*
This is a program to get the array of integers and store and print it in reverse order. it runs in O(n) where n is the number of integers in the array.
@author: Karteek Pradyumna Bulusu
*/

import java.io.*;
import java.util.*;


public class ArrayReversal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];

        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            rev[n-1-i] = arr[i]; 
        }

        for(int a = 0; a< n ; a++){
            System.out.print(rev[a]+" ");
        }

        in.close();
    }
}
