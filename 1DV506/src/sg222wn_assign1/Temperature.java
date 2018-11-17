package sg222wn_assign1;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// F= (9/5)*C + 32 ==> C= 5/9(F - 32)
		// receiving the input
		System.out.println("Enter a number in Fahrenheit!");
		Scanner input = new Scanner(System.in);
		double F = input.nextDouble();
		System.out.println(F);
		// calculating Celsius from the given fahrenheit
		double x = 5.0 / 9.0;
		double C = (F - 32) * x;
		// print out the result
		System.out.println("The temperature in Celsius is:" + C);
		input.close();
	}

}
