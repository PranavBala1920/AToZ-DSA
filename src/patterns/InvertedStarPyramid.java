package patterns;

public class InvertedStarPyramid {
	static void loadPattern(int value) {
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * value - (2 * i + 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadPattern(5);
	}
}
