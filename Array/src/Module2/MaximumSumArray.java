package Module2;

public class MaximumSumArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, -5, 4, -4, 3, -6 };
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
	}

}
