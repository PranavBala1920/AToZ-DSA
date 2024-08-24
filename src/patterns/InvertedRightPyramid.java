package patterns;

public class InvertedRightPyramid {
	static void loadPattern(int value) {
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= value - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadPattern(5);
	}
}
