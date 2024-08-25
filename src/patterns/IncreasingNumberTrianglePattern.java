package patterns;

public class IncreasingNumberTrianglePattern {
	static void loadIncreasingNumberTriangle(int value) {
		int number = 0;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				number++;
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadIncreasingNumberTriangle(5);
	}
}
