package Practice;

import java.util.Scanner;

public class dayToWord {

	public static void main(String[] args) {
		// to print days in words
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a day of the week from 1-7: ");
		int day = input.nextInt();
		// nested if method
		if (day < 7) {
			if (day == 1) {
				System.out.println("Monday");
			}
			if (day == 2) {
				System.out.println("Tuesday");
			}
			if (day == 3) {
				System.out.println("Wednesday");
			}
			if (day == 4) {
				System.out.println("Thursday");
			}
			if (day == 5) {
				System.out.println("Friday");
			}
			if (day == 6) {
				System.out.println("Saturday");
			}
			if (day == 7) {
				System.out.println("Sunday");
			}
		} else {
			System.out.println("The day doesnt come from 1-7!");
		}
		// switch case method
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("The day doesnt come from 1-7!");
		}
		input.close();
	}

}
