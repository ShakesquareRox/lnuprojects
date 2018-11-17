package sg222wn_assign1;

import java.util.Scanner;

public class SoT {

	public static void main(String[] args) {
		// read input

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3 digit number! \n");

		int num = input.nextInt();

		// separate individual digits
		// first digit
		int digitOne = num / 100;
		// second digit
		int n2 = num / 10;
		int digitTwo = n2 % 10;
		// third digit
		int digitThree = num % 10;
		// sum the 3 digits
		int sum = digitOne + digitTwo + digitThree;
		// print out the result
		System.out.println("\nThe Sum of the 3 digits are " + sum);
		input.close();
	}

}
