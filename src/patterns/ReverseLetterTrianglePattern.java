package patterns;

public class ReverseLetterTrianglePattern {
	static void loadIncreasingLetterTriangle(int value) {
		for (int i = 0; i < value; i++) {
			for (char ch = 'A'; ch < 'A' + (value-i); ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadIncreasingLetterTriangle(10);
	}
}
