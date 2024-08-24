package patterns;

public class RightAngledNumberPyramidII {
	static void loadPattern(int value) {
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadPattern(5);
	}
}
