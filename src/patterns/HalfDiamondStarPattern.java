package patterns;

public class HalfDiamondStarPattern {
	static void loadRightAngledDiamondPattern(int value) {
		for (int i = 1; i <= 2 * value - 1; i++) {
			int star = i;
			if (i > value) {
				star = 2 * value - i;
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadRightAngledDiamondPattern(5);
	}
}
