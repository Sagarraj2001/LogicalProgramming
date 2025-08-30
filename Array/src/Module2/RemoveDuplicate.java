package Module2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 32, 21, 10, 21, 34, 62, 41 };
		boolean b[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (b[i] == false) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						b[j] = true;
				}
			}
			if (b[i] == false) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
