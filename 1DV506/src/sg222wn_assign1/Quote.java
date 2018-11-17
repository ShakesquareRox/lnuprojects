package sg222wn_assign1;

import java.util.Scanner;

public class Quote {

	public static void main(String[] args) {
		// receive input quote
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a quote! \n");
		String quote = input.nextLine();
		// printing out with punctuations
		System.out.println("\"" + quote + "\"");
		input.close();

	}

}
