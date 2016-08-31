/*
author: Karteek Pradyumna Bulusu
This program is solution of Hackerrank problem.
The prison has N prisoners and M sweets which are to be distributed amongst prisoners and distribution happens in order. User also provides the prisioner number to start distribution with. Last sweet has poison. We need to find who gets the last sweet. 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prisoner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int a = 0; a< test; a++){
            int count = sc.nextInt();
            int sweets = sc.nextInt();
            int id = sc.nextInt();
            
            int value = 0;
            if(sweets == 1){
                System.out.println(id);
            }else{
                value = sweets + id - 1;
                if(value > count){
                    value = value % count;
                    System.out.println(value+"");
                }else{
                    System.out.println(value+"");
                }
            }
                       
        }
    }
}
