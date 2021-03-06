/*
* author: Karteek Pradyumna Bulusu
* This algorithms rotates an integer array in the left direction based on the count of the rotation provided by the user. Implementation is similar to bubble sort algorithm where the first and second elements of array are replaced in every iteration. The end result prints the rotated array.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leftrotation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alen = sc.nextInt();
        int rot = sc.nextInt();
        
        //delcaring array
        int[] array = new int[alen];
        
        //storing values
        for(int a = 0; a<alen; a++){
            array[a] = sc.nextInt();
        }
        
        //rotating based on the count provided by the user.
        for(int x = 0; x< rot; x++){
            //traverse till the array length
            for(int y = 0; y< alen - 1; y++){
                int temp = array[y];
                array[y] = array[y+1];
                array[y+1] = temp;
            }
        }
        //sorted array
        for(int z = 0; z<alen; z++){
            System.out.print(array[z]+" ");
        }
    }
}
