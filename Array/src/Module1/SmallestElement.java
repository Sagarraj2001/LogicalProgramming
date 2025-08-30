package Module1;

public class SmallestElement {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(small>arr[i])
				small=arr[i];
		}
		System.out.println(small);
	}

}
