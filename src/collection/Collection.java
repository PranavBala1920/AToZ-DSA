import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<List<Integer>> lists = new ArrayList<>();
		int n = scanner.nextInt();

		for (int i = 1; i < n; i++) {
			int d = scanner.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				list.add(scanner.nextInt());
			}
			lists.add(list);
		}
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			try {
				System.out.println(lists.get(x - 1).get(y - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
		scanner.close();
	}
}
