package sg222wn_assign1;

import java.util.Random;

public class randomSum {

	public static void main(String[] args) {
		// enter 5 numbers and print the sum of random numbers
		Random rand = new Random();
		System.out.println("The Five Random Numbers are: ");
		int i = 100;
		int a = rand.nextInt(i);
		System.out.println(a);
		int b = rand.nextInt(i);
		System.out.println(b);
		int c = rand.nextInt(i);
		System.out.println(c);
		int d = rand.nextInt(i);
		System.out.println(d);
		int e = rand.nextInt(i);
		System.out.println(e);
		int sum = a + b + c + d + e;
		System.out.println("The sum is " + sum);
	}

}
