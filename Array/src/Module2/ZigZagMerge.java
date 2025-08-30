package Module2;

import java.util.Arrays;

public class ZigZagMerge {

	public static void main(String[] args) {
		int arr1[] = { 10, 11, 15, 31, 24, 62, 27 };
		int arr2[] = { 10, 51, 61, 42 };
		int arr3[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else
				arr3[k++] = arr2[j++];
		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		System.out.println(Arrays.toString(arr3));
	}

}
