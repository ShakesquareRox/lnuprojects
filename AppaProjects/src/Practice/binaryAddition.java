package Practice;
import java.util.Scanner;
public class binaryAddition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two binary digits");
		int a = input.nextInt();
		int b = input.nextInt();
		String a1 = Integer.toBinaryString(a);
		System.out.println(a1);
		String a2 = Integer.toBinaryString(b);
		System.out.println(a2);
		String result = binaryAddition.binarySum(a1,a2);
		//int sum = Integer.toBinaryString(result);
		System.out.println(result);
		input.close();
		
		
	}
	public static String binarySum(String a,String b) {
		return a + b;
	}
	
}
