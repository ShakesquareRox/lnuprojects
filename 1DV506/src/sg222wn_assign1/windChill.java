package sg222wn_assign1;

import java.util.*;

public class windChill {
	public static void main(String[] args) {
		// wind chill = 13.12 + 0.6215*T - 11.37*V^{0.16} + 0.3965*T*V^{0.16}; T=
		// temperature;V = wind speed.
		// input items
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature! ");
		double T = input.nextDouble();
		System.out.println("Enter the wind speed! ");
		double V = input.nextDouble();
		V = V * 18 / 5;
		// formula
		double windChill = 13.12 + 0.6215 * T - 11.37 * Math.pow(V, 0.16) + 0.3965 * T * Math.pow(V, 0.16);
		// result
		double wCRound = Math.round(windChill*10.0)/10.0;
		System.out.println("The windchill is: " + wCRound);
		input.close();
	}

}