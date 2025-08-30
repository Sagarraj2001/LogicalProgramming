package Module1;

public class MissingElement {

	public static void main(String[] args) {
		int arr[]= {1,6,7,5,9,11};
		int big=arr[0];
		int small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
			if(arr[i]<small)
				small=arr[i];
		}
		for(int i=small+1;i<big;i++) {
			if(isMissing(i,arr)) {
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isMissing(int i, int[] arr) {
		for(int j=0;j<arr.length;j++) {
			if(i==arr[j])
				return false;
		}
		return true;
	}

}
