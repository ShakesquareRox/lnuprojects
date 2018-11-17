import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Choose an operation: \n1.Addition \n2.Subtract \n3.Multiply \n4.Divide");
		int i = input.nextInt();

		if (i <= 4) {

			System.out.println("You have chosen " + i);

			System.out.println("Please enter input values: ");

			float a = input.nextFloat();

			float b = input.nextFloat();

			if (i == 1) {
				System.out.println(a + b);
			}
			if (i == 2) {
				System.out.println(a - b);
			}
			if (i == 3) {
				System.out.println(a * b);
			}
			if (i == 4) {
				System.out.println(a / b);
			}
		} else {

			System.out.println("Please choose between 1 and 4...Or Detroit Become Human!");
		}

	}
}
