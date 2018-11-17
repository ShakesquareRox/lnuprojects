package sg222wn_assign1;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// A = P( 1+ r/n )^nt , t = 5; r = 9; P = 1000;n = 1.
		// receiving input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Principle value! \n");
		// double P = 1000;
		double P = input.nextDouble();

		System.out.println("Enter the time! \n");
		// double t = 5;
		double t = input.nextDouble();
		System.out.println("Enter the rate! \n");
		double r = input.nextDouble();
		// applying formula
		if (r < 100.0) {
			r = r / 100.0;
		}
		System.out.println("\nThe rate is " + r);
		// double r = 9.0/100.0;
		double i = 1 + r;
		double j = Math.pow(i, t);
		double A = P * j;
		// rounding off
		A = Math.round(A);
		// printing out result
		System.out.println("\nThe amount accrued after " + t + " years is: " + A);
		input.close();
	}

}
