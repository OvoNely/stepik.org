import java.util.*;

public class GreatestCommonDivisor {
  
  private static int gcdEuclidean(int a, int b) {
			
	int reminder = 1;
		
	while(reminder != 0) {
		reminder = a % b;
		a = b;
		b = reminder;
	}
	
	return a;
}

  public static void main(String args[]) {
    
	
	Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
	
    System.out.println(gcdEuclidean(a,b));
    	
  }
}
