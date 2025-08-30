package Module2;

public class NthUniqueElement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 32, 21, 10, 21, 34, 62, 41 };
		boolean b[] = new boolean[arr.length];
		int uniCount = 0;
		int n = 2;
		for (int i = 0; i < arr.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						b[j] = true;
					}
				}
				if (count == 1) {
					uniCount++;
					if (uniCount == n) {
						System.out.println(arr[i]);
						break;
					}

				}
			}
		}
	}
}
