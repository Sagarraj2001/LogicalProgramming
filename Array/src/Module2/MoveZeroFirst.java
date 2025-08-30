package Module2;

import java.util.Arrays;

public class MoveZeroFirst {

	public static void main(String[] args) {
		int arr[] = { 10, 0, 1, 2, 0, 6, 2, 0, 0, 5, 2, 6, 0 };
		int index = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index--;
			}
		}
		while (index >= 0) {
			arr[index] = 0;
			index--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
