/*
@author: karteek Pradyumna Bulusu
This is a Hackerrank challenge which deals with finding the number of sub arrays which has negative sum of the elements and returning the count of it.
*/
import java.io.*;
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int a = 0; a< array.length; a++){
            array[a] = sc.nextInt();
        }
        int count = 0; // keeps count of negative sums
        int sum = 0; //keeps the value of sum after every addition operation
        // for all elements in the array, it is added with every other element in order to check the sign of the sum
        for(int b = 0; b< array.length; b++){
            for(int c = b; c<array.length; c++){
                sum += array[c];
                if(sum < 0){
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println("\nThe number of sub arrays with negative sum are:\n"+count);
    }
}
