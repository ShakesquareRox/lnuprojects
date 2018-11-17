import java.util.Scanner;

public class Calc_Adv {

	private Scanner input;

	public Calc_Adv() {

		input = new Scanner(System.in);

		System.out.println("Choose an operation: \n1.Addition \n2.Subtract \n3.Multiply \n4.Divide");

		int i = input.nextInt();

		while (i <= 4) {

			System.out.println("Enter two numbers: ");

			float a = input.nextFloat();
			float b = input.nextFloat();

			switch (i) {
			case 1:
				System.out.println(a + b);
				break;
			case 2:
				System.out.println(a - b);
				break;
			case 3:
				System.out.println(a * b);
				break;
			case 4:
				System.out.println(a / b);
				break;
			default:
				System.out.println("Enter just a number or Detroit Become Human!");
			}
		}
	}

}
