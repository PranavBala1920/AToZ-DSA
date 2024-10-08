package patterns;

public class AlphaTrianglePattern {
	static void loadAlphaTrianglePattern(int n) {
		for (int i = 0; i < n; i++) {
			char ch = (char) ('E' - i);
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadAlphaTrianglePattern(5);
	}
}
