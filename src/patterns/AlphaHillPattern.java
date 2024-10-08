package patterns;

public class AlphaHillPattern {
	static void loadAlphaHillPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			char alpha = 'A';
			int breakPoint = (2 * i + 1) / 2;
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(alpha);
				if (j <= breakPoint)
					alpha++;
				else
					alpha--;
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadAlphaHillPattern(5);
	}
}
