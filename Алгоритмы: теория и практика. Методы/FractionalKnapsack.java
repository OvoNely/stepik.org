import java.util.Scanner;

class FractionalKnapsack {

	private static double getOptimalValue(int capacity, int[] values, int[] weights) {
		
		double optimalValue = 0;
		double[] conditionalCost = new double[values.length];
		
		for (int i = 0; i < values.length; i++) {
			if (capacity == 0)
				return optimalValue;
			
			for (int j = 0; j < values.length; j++) {
				if (weights[j] > 0)
					conditionalCost[j] = (double) values[j]/weights[j];
			}

			int indexOfMaxValueItem = 0;
			double temp = 0;
			
			for (int j = 0; j < conditionalCost.length; j++) {
				if (conditionalCost[j] > temp) {
					indexOfMaxValueItem = j;
					temp = conditionalCost[j];
				}
			}
			
			int numberOfParts = 0;
			
			if(weights[indexOfMaxValueItem] > capacity)
				numberOfParts = capacity;
			else
				numberOfParts = weights[indexOfMaxValueItem];
			
			optimalValue += numberOfParts * conditionalCost[indexOfMaxValueItem];
			weights[indexOfMaxValueItem] -= numberOfParts;
			capacity -= numberOfParts;
			conditionalCost[indexOfMaxValueItem] = 0;
		}
		
		
		return optimalValue;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.printf("%.3f",getOptimalValue(capacity, values, weights));
	}
}
