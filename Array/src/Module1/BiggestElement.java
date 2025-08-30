package Module1;

public class BiggestElement {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		int big=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		System.out.println(big);
	}

}
