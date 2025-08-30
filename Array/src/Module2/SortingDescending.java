package Module2;

import java.util.Arrays;

public class SortingDescending {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 9, 31, 25, 62, 24, 12 };
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
