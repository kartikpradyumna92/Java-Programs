/*
@author: Karteek Pradyumna Bulusu
This is a hackerrank problem which aims at solving chocolate feast problem. Here given the total amount,
amount for each chocolate and number of wrappers we can trade a chocolate for we need to determine
number of chocolates user can buy.
*/
import java.io.*;
import java.util.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a = 0; a< t; a++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int count = 0; 
            int quotient = n/c;
            count += quotient;
            while(quotient >= m){
                count += quotient / m;
                quotient = quotient/ m + quotient%m;
            }
            System.out.println("Number of chocolates user can buy are: "+count);
            
        }
    }
}