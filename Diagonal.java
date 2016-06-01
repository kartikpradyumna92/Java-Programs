/*
* This programs aims in finding the difference in the sum of the diagonals.
* The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing space-separated integers describing the columns.
* The output will be displayed in the form of integer. 
* @author: Karteek Pradyumna Bulusu.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int one = 0; //sum of diagonal 1
        int two = 0; //sum of diagonal 2
        int diff = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                a[i][j]= in.nextInt();
            }
        }
        
        for(int i =0; i<n;i++){
            one += a[i][i];
            two += a[i][n-1-i];
        }
        
       // check if diagonal one is greater or two.
        if(one < two){
            diff = two - one;
            System.out.println(diff);
        }else if(one >= two){
            diff = one - two;
            System.out.println(diff);
        }
    }
}
