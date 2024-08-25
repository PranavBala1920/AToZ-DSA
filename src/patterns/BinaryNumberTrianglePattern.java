package patterns;

public class BinaryNumberTrianglePattern {
	static int binary;
	static void loadBinaryNumberTriangle(int value) {
		for (int i = 1; i <= value; i++) {
			if (i%2 == 0) binary = 0; 
			else binary = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(binary);
				binary = 1 - binary;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadBinaryNumberTriangle(5);
	}
}
