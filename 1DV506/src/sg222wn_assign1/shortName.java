package sg222wn_assign1;

import java.util.Scanner;

public class shortName {

	public static void main(String[] args) {
		// Receiving input
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name! \n");

		String fName = input.nextLine();

		System.out.println("Enter your last name! \n");

		String lName = input.nextLine();
		// printing the initials
		char shortFirstName = fName.charAt(0);
		String shortLastName = (String) lName.subSequence(0, 4);
		System.out.println("\n" + shortFirstName + ". " + shortLastName);
		input.close();
	}

}
