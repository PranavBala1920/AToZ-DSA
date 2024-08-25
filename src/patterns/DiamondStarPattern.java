package patterns;

public class DiamondStarPattern {
	static void loadFirstPattern(int value) {
		for (int i = 0; i < value; i++) {
			// Space
			for (int j = 0; j < value - i - 1; j++) {
				System.out.print(" ");
			}
			// Star
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			// Space
			for (int j = 0; j < value - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void loadSecondPattern(int value) {
		for (int i = 0; i < value; i++) {
			// Space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// Star
			for (int j = 0; j < 2 * value - (2 * i + 1); j++) {
				System.out.print("*");
			}
			// Space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadFirstPattern(5);
		loadSecondPattern(5);
	}
}
