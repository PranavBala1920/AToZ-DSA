package patterns;

public class AlphaRampPattern {
	static void loadAlphaRampPattern(int value) {
		char alphabets = 'A';
		for (int i = 0; i < value; i++) {
			for (char ch = 'A'; ch <= 'A' + i; ch++) {
				System.out.print(alphabets + " ");
			}
			alphabets+=1;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loadAlphaRampPattern(5);
	}
}
