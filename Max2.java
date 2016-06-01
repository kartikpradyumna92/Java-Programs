/**
 * @author Karteek Pradyumna Bulusu
 * This program returns the maximum number of the two numbers provided in the command line argument without usin any conditional statements.
 */
public class Max2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer 1
		int one = Integer.parseInt(args[0]);
		// Integer 2
		int two = Integer.parseInt(args[1]);
		System.out.println("Integer one: "+one+"\nInteger two: "+two);
		max(one, two);
	}
	public static int max(int a, int b){
		int max = ((a + b) + Math.abs(a - b) )/2;
		System.out.println("Maximum Number: "+max);
		return max;
	}

}
