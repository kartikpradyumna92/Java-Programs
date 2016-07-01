/*
This program sorts the array of integers in increasing order using "Bubble sorting" algorithm. Further it prints first and last element of the array. Adding to it, this will print the number of swaps it will make to sort the array of integers. 
@author: Karteek Pradyumna Bulusu
*/
import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int swap_count = 0;
        
        int count = sc.nextInt();
       // System.out.println(count);
        int[] arr = new int[count];

        for(int a = 0; a < count; a++){
            arr[a] = sc.nextInt();
            //System.out.print(arr[a]);
            
        }

        boolean flag = true;
        
	while(flag){
            flag = false;
            for(int b = 0; b< arr.length-1;b++){
                if(arr[b] > arr[b+1]){
                    int temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                    swap_count++;
                    flag = true;
                }
           // System.out.print(arr[b]);
            }
        }
	//Print statements to print the count of swaps, first element and last element in the sorted array.
        System.out.println("Array is sorted in "+swap_count+" swaps.");
        System.out.println("First Element: "+arr[0]);  
        System.out.println("Last Element: "+arr[count-1]);  
        
    }
}
