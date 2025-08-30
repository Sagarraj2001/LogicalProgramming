package Module2;

public class TwoSumProblem {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 31, 25, 62, 24, 12,15 };
		int target=40;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
		}
	}

}
