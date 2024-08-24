package patterns;

class RectangularStarPattern {
	static void loadPattern(int value) {
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadPattern(6);
	}
}
