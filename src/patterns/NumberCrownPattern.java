package patterns;

public class NumberCrownPattern {
	public static void main(String[] args) {
		int value = 5;
		int space = 2 * (value - 1);
		for (int i = 1; i <= value; i++) {
			// star
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// space
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
			space -= 2;
		}
	}

}
