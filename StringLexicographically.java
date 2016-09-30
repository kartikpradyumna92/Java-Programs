import java.util.Scanner;

/**
 * @author Karteek Pradyumna Bulusu
 * Given a lower case string by the user, it arranges the characters in the string in the alphabetical order.
 */
public class StringLexicographically {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one = sc.next();
		
		char[] arr = one.toCharArray();
		int[] ascii = new int[arr.length];
		
		System.out.println("Before sorting.");
		
		//Converting to the ASCII values.
		for(int a = 0; a<arr.length; a++){
			ascii[a] = (int)arr[a];
			System.out.print(arr[a]+" ");
		}
		lexical(ascii);
	}
	//This method arranges the characters in the alphabetical order.
	public static void lexical(int[] asc){
		int temp;
		//sorting
		for(int b = 0; b<asc.length - 1; b++){
			for(int v = 1; v<asc.length -b; v++){
				if(asc[v-1] > asc[v]){
					temp = asc[v-1];
					asc[v-1] = asc[v];
					asc[v] = temp;
				}
			}
		}
		System.out.println("\n\nAfter Sorting");
		for(int b = 0; b< asc.length; b++){
			System.out.print(Character.toString ((char) asc[b])+" ");
		}
	}
}
