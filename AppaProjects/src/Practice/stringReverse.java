package Practice;

public class stringReverse {

	public static void main(String[] args) {
		//to print a string in reverse
		String sName = "The quick brown fox";
		String reverse = "";
		int i;
		for(i = sName.length()-1; i>=0; i--) {
			reverse = reverse + sName.charAt(i);
		}
		System.out.println("The reversed string is: " + reverse);
	}

}
