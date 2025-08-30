package Module1;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		reverseArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] reverseArray(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
		return arr;
		
	}

}
