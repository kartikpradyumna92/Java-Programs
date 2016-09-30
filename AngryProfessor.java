/*
* @ author: Karteek Pradyumna Bulusu
* This is a Hackerrank problem which aims in determining if the professor should cancel the class or not based on the attendence and threshold set by the professor. 
* This problem comes in Implementation section of algorithms in Hackerrank.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int negcount = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                //System.out.println(a[a_i]);
                if(a[a_i] <= 0){
                    negcount ++;
                }
            }
            if(negcount < k){
                System.out.println("Yes. Class with be cancelled.");
            }else{
                System.out.println("No. The class would not be cancelled.");
            }
            negcount = 0;
        }
    }
}
