import java.util.Scanner;

class person {
	String name;
	int age;
	int funIndex;
	Scanner input1 = new Scanner(System.in);

	public void rules() {
		System.out.println("You can rate the person's fun index based on the following statistics! ");
		System.out.println("F.I. 1-3: The person is not that fun! Mostly no parties! Not much social");
		System.out
				.println("F.I. 4-6: The person is of average fun. Might attend parties but doesn't throw any parties!");
		System.out.println("F.I. 7-8: The person is fun..Parties last for 3-4 hours!");
		System.out.println(
				"F.I. 9: Don't lose that person if u don't want to miss out on life!...Parties last for 8-9 hours!");
		System.out.println(
				"Extreme condition-10: The person is a god! Funnest mortal ever! Parties might last for a day if allowed!");
	}

	public void drunkPeople() {
		System.out.println("Do the people consume alcohol? ");
		String x = input1.nextLine();
		String positive = " yes, yep,yea, of course, okey-dokey,hell yea, hell yes"
				+ "yass, affirmative,roger,righto,yup,ja,yessir";
		if (positive.contains(x)) {
			System.out.println("The person drinks!");
			if (age < 18) {
				System.out.println("Wtf!The person is not supposed to drink!");
			}
		}
		String negative = "nay\r\n" + "nix\r\n" + "never\r\n" + "not, negative, nope";
		if (negative.contains(x)) {
			System.out.println("The person doesn't drink! Good for them!");
		}
		String doubt = "distrust\r\n" + "hesitate\r\n" + "impugn\r\n" + "suspect\r\n" + "challenge\r\n" + "demur\r\n"
				+ "disbelieve\r\n" + "discredit\r\n" + "dispute\r\n" + "fear\r\n" + "fluctuate\r\n" + "imagine\r\n"
				+ "insinuate\r\n" + "misgive\r\n" + "mistrust\r\n" + "query\r\n" + "scruple\r\n" + "surmise\r\n"
				+ "vacillate\r\n" + "waver\r\n" + "be apprehensive of\r\n" + "be curious\r\n" + "be dubious\r\n"
				+ "be in a quandary\r\n" + "be puzzled\r\n" + "be uncertain\r\n" + "be undetermined\r\n"
				+ "call in question\r\n" + "harbor suspicion\r\n" + "have qualms\r\n" + "misdoubt\r\n"
				+ "read differently\r\n" + "shilly-shally\r\n" + "skepticize\r\n" + "smell a rat\r\n"
				+ "take dim view of\r\n" + "wonder at,i hope , i think so, i dont think so";
		if (doubt.contains(x)) {
			System.out.println("Humans can never be accurate!");
		}
	}

	public boolean decision(int x, int lower, int upper) {
		x = funIndex;
		return lower <= x && x <= upper;
	}

	public void compare() {
		if (decision(funIndex, 1, 3)) {
			System.out.println("The person is not that fun! Mostly no parties! Not much social");
		}
		if (decision(funIndex, 4, 6)) {
			System.out.println("The person is of average fun. Might attend parties but doesn't throw any parties!");
		}
		if (decision(funIndex, 7, 8)) {
			System.out.println("The person is fun..Parties last for 3-4 hours!");
		}
		if (funIndex == 9) {
			System.out.println(
					"Don't lose that person if u don't want to miss out on life!...Parties last for 8-9 hours!");
		}
		if (funIndex == 10) {
			System.out.println("The person is a god! Funnest mortal ever! Parties might last for a day if allowed!");
		}

	}

}

public class funIndex {

	public static void main(String[] args) {
		// a program that can predict how long a party will last
		Scanner input = new Scanner(System.in);
		person person1 = new person();
		System.out.println("Enter the person's name! ");
		person1.name = input.nextLine();
		System.out.println("Enter the person's age! ");
		person1.age = input.nextInt();
		System.out.println("The name is " + person1.name + " and I'm " + person1.age + " years old");
		person1.rules();
		System.out.println("\nRate the person's fun in a range of 1-10 according to u!");
		person1.funIndex = input.nextInt();
		int fun = person1.funIndex;
		/*
		 * if (person1.decision(fun, 1, 25)) {
		 * System.out.println("The person is not that fun!"); } if
		 * (person1.decision(fun, 26, 50)) {
		 * System.out.println("The person is of average fun"); } if
		 * (person1.decision(fun, 51, 75)) {
		 * System.out.println("The person is fun..Parties last for 3-4 hours!"); } if
		 * (person1.decision(fun, 76, 100)) { System.out.println(
		 * "Don't lose that person if u don't want to miss out on life!...Parties last for 8-9 hours!"
		 * ); } if (person1.funIndex == 100) {
		 * System.out.println("The person is a god!"); }
		 */
		System.out.println("You can rate that the person is " + fun + " huh!");
		person1.compare();
		person1.drunkPeople();

		input.close();
	}

}
