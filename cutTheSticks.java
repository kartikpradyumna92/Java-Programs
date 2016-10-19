/*
 @author: Karteek Pradyumna Bulusu
 This is a Hackerrank challenge which deals with finding the minimum element in the array and recursively reducing every element of the array with it till all the elements from the array are removed. Also, I had to return the size of resultant array after every operation.
*/
import java.io.*;
import java.util.*;

public class cutTheSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        //insertion of the elements
        for(int a = 0; a< size; a++){
            array[a] = sc.nextInt();
        }
        //sorting
        Arrays.sort(array);
	System.out.println("\n The output is: \n");
        System.out.println(array.length);
        //ignoring zeros and finding the count of non-zero elements.
        for(int b = 0; b< array.length; b++){
            int count = 0;
            int min = minimum(array);
            for(int a = 0; a< array.length; a++){
                if(array[a]!= 0){
                    array[a] -= min;
                    if(array[a] != 0){
                        count++;
                    }    
                }
            }
            if(count != 0){
                System.out.println(count); 
            }
        }
    }
    //finding minimum element of the array.
    public static int minimum(int[] ar){
        int min = ar[0];
        boolean flag = true;
        for(int a = 0 ; a< ar.length; a++){
            if(ar[a] == 0){
            }else if(ar[a] != 0){
                if(flag == true){
                    min = ar[a];  
                }
                flag = false;
            }
        }
        return min;
    }
}
