package Practice;

import java.util.*;

public class average {

	public static void main(String[] args) {
		// to take 3 numbers as input and print the average of the 3 numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers! ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int sum = a + b + c;
		double average = sum / 3.0;
		double aRound = Math.round(average*100.0)/100.0;
		System.out.println("The average of the 3 numbers are: " + aRound);
		input.close();

	}

}
