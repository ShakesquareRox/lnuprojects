package sg222wn_assign1;

import java.util.*;

public class Time {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// to print seconds in hours and minutes
		// receiving input
		System.out.println("Enter the seconds that u want to convert into hours and minutes \n");
		int seconds = input.nextInt();
		// converting seconds to minutes and hours
		int minutes = seconds / 60;
		int hours = minutes / 60;
		// finding the remainder minutes and hour
		int rMinutes = minutes % 60;
		int rSeconds = seconds % 60;
		// printing out the result

		System.out.println(hours + " hrs " + rMinutes + " mins " + rSeconds + "secs");

		input.close();

	}

}
