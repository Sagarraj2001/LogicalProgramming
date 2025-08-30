package Module2;

public class MostFrequentElement {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 10, 20, 10, 30, 50, 20, 10, 20 };
		int maxCount = 0;
		int frequentElement = arr[0];
		boolean b[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						b[j] = true;
						count++;
					}
				}

				if (maxCount < count) {
					maxCount = count;
					frequentElement = arr[i];
				}
			}
		}
		System.out.println(frequentElement+" "+maxCount);
	}

}
