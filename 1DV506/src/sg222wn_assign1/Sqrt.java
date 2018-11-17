package sg222wn_assign1;

import java.util.*;
import java.lang.Math;

public class Sqrt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// to print the square root for distance; distance = ((x1-x2)^2 +
		// (y1-y2)^2)^(1/2)
		// the first coordinates
		System.out.println("Enter the first coordinates! ");
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		System.out.println("The coordinates are " + "(" + x1 + "," + y1 + ")");
		// the second coordinates
		System.out.println("Enter the second coordinates! ");
		double x2 = input.nextInt();
		double y2 = input.nextInt();
		System.out.println("The coordinates are " + "(" + x2 + "," + y2 + ")");
		// (x1-x2)^2
		double x = x1 - x2;
		double a = Math.pow(x, 2.0);
		int aRound = (int) Math.round(a);
		// System.out.println(aRound);
		// (y1-y2)^2
		double y = y1 - y2;
		double b = Math.pow(y, 2.0);
		int bRound = (int) Math.round(b);
		// System.out.println(bRound);
		// add
		int sum = aRound + bRound;
		int distance = (int) Math.sqrt(sum);
		System.out.println("The distance is " + distance + " units");
		input.close();
	}

}
