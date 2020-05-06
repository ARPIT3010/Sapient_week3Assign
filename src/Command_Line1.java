

// A java class to read n numbers from command line argument for displaying sum, avg, biggest and smallest number
public class Command_Line1 {
	private static  int sum = 0, max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
	private static float avg;
	
	//
	public void calData(int num[]) {
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if(min > num[i])
				min = num[i];
			if (max < num[i])
				max = num[i];
		}



		min = num[0];
		max = num[num.length - 1];
		// type cast integer value "sum" into float
		avg = (float)sum / num.length;
	}

	public void displayData() {
		System.out.printf("Sum = : %d", sum);
		System.out.println();
		
		System.out.printf("Maximum = : %d", max);
		System.out.println();
		System.out.printf("Minimum = : %d", min);
		System.out.println();
		System.out.printf("Average = : %f", avg);
	}
}
