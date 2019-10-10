import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		
		if (k == m || k == n) {
			System.out.println("YES");
			return;
		}
		
		if (k > m*n) {
			System.out.println("NO");
			return;
		}
		
		for (int i = 1; i <= m; i++) {
			if (i * n == k) {
				System.out.println("YES");
				return;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (i * m == k) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");

	}

}
