package patterns;

public class SymmetricVoidPattern {
	public static void loadSymmetricVoidPattern(int value) {
		int space = 0;
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < value  - i; j++) {
				System.out.print("*");
			}
			space = space + 2;
			System.out.println();
		}
		int space2 = 8;
		for (int i = 0; i < value; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < space2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			space2-= 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadSymmetricVoidPattern(5);
	}
}
