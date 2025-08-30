package Module1;

public class SumOfElement {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		for(int i=0;i<arr.length;i++) {
			arr[i]=sum(arr[i]);
			System.out.print(arr[i]+" ");
		}
		
		
	}

	private static int sum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}

}
