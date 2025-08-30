package Module1;

public class SumOfOddElement {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

}
