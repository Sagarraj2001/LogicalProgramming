package Module2;

import java.util.Arrays;

public class MoveLeft {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int k = 2;
		for (int j = 0; j < k; j++) {
			int temp = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
