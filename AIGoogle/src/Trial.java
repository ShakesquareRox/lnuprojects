import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter yes!");
			
		String[] plus = new String[21];
		positive(plus, input);
	}

	public static boolean positive(String[] plus, Scanner input) {
		plus = new String[20];
		plus[0] = "Yes";
		plus[1] = "Yep";

		String pos = input.nextLine();

		switch(pos.equals()) {
		case plus[0] : System.out.println("You have written" + plus[0]);
						break;
		case plus[1] : System.out.println("You have written" + plus[1]);
						break;
		}
		
		
		
		
		
		
		/*if (pos.equals(plus[1])) {
			System.out.println("You have entered something positive");
			return true;
		} else {
			System.out.println("Please enter something only positive");
			return false;
		}*/

	}
}
