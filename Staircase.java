/*
* This program aims in printing '#' in the form of the staircases based on the
* height provided by the user in the form of integer. '#' is printed in the
* increasing form hence depicting the staircases structure. 
* @author Karteek Pradyumna Bulusu
* @version 1.0
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i + j >= n -1){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
