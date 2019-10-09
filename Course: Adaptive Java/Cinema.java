import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int [][] seats = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				seats[i][j] = scanner.nextInt();
			}
		}
		
		int k = scanner.nextInt();
		
		scanner.close();				
		
		for (int i = 0; i < n; i++) {
			int count = 0;			
			for (int j = 0; j < m; j++) {
				if (seats[i][j] == 0) {
					count++;
				} else {
					count = 0;
				}
				if (count >= k) {
					System.out.println(i + 1);
					return;
				}
			}
		}
		
		System.out.println(0);
	}
}
