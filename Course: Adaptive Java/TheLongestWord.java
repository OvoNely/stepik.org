import java.util.Scanner;

public class TheLongestWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int maxCount = 0;
		String result = "";
		
		while(scanner.hasNext()) {
			String str = scanner.next();
			count = str.length();
			if (count > maxCount) {
				result = str;
				maxCount = str.length();
			}
		}
		
		scanner.close();
		
		System.out.println(result);
		
	}

}
