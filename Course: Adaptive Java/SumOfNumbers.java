import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		SumOfNumbers son = new SumOfNumbers();
		
		System.out.println(son.sumOfNubers(scanner, sum));
		
		scanner.close();

	}
	
	public int sumOfNubers(Scanner sc, int sum) {
		
		int n = sc.nextInt();
		
		
		if (n == 0) {
			return sum;
		} else {
			return sumOfNubers(sc, sum + n);
		}
	
	}

}
