package Practice;

import java.util.Scanner;

public class multiplyToTen {

	public static void main(String[] args) {
		//to receive an input number and multiply it by 10 nums and display result
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number! ");
		int i,a = input.nextInt();
		for(i = 0;i <=10;i++) {
			int x = a * i;
			System.out.println(a +" * "+ i + " = " + x);
		}
		input.close();
	}

}
