/*
@author: Karteek Pradyumna Bulusu
Hackerrank problem which deals with finding the maximum element in the Stack.
I created another Stack which always store maximum element and returning the maximum element using Stack.peek() function.

*/
import java.io.*;
import java.util.*;

public class MaxElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Stack st = new Stack();
        Stack maxEle = new Stack();
        for(int a = 0; a< count; a++){
            int num = sc.nextInt();
            if(num == 1){
                int value = sc.nextInt();
                if(st.isEmpty()){
                    st.push(value);
                    maxEle.push(value);
                }else{
                    int maxPeek = (Integer)maxEle.peek();
                    if(maxPeek < value){
                        maxEle.push(value);
                    }
                    st.push(value);
                }
            }else if (num == 2){
                
                if(!st.isEmpty() && !maxEle.isEmpty() && (st.peek() == maxEle.peek())){
                    maxEle.pop();
                }
                st.pop();
            }else if(num == 3){               
                System.out.println("The maximum element in the stack is: "+maxEle.peek());
            }
        }
    }
}
