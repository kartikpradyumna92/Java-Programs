/*
Using HashMap of String and Integers to store Names and phone numbers.
@author: Karteek Pradyumna Bulusu

*/
import java.util.*;
import java.io.*;

class Dictionary{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> map = new HashMap<String, Integer>();
        
	for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
       // System.out.println(map);
        
	while(in.hasNext()){
            String s = in.next();
            // Write code here
            //System.out.println(s);
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        
	in.close();
    }
}
