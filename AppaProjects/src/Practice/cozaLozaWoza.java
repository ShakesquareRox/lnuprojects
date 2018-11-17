package Practice;

public class cozaLozaWoza {

	public static void main(String[] args) {
		// coza for multiples of 3; loza for 5; woza for 7
		int i;
		for (i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				System.out.println("Coza");
			}
		}
		for (i = 1; i < 11; i++) {
			if (i % 5 == 0) {
				System.out.println("Loza");
			}
		}
		for (i = 1; i < 11; i++) {
			if (i % 7 == 0) {
				System.out.println("Woza");
			}
		}
	}

}
