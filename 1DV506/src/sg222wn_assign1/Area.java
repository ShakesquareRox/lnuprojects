package sg222wn_assign1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// to make a program that prints area of a circle with radius

		double pi = 22.0 / 7.0;
		double radius;
		System.out.println("Enter the radius of the circle! \n");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		double area = pi * radius * radius;
		// rounding off
		double x;
		x = Math.round(area * 10.0) / 10.0;
		System.out.println("\nThe area is " + area);
		System.out.println("\nThe rounded off area is " + x);
		input.close();
	}

}