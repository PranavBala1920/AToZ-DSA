package patterns;

public class SymmetricButterflyPattern {
	public static void loadSymmetricButterflyPattern(int value) {
		int space = value * 2 - 2;
		for (int i = 1; i <= value * 2 - 1; i++) {
			int star = i;
			if (i > value) {
				star = value * 2 - i;
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < value)
				space -= 2;
			else
				space += 2;
		}
	}

	public static void main(String[] args) {
		loadSymmetricButterflyPattern(3);
	}
}
