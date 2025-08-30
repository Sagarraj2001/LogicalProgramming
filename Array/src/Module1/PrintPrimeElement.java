package Module1;

public class PrintPrimeElement {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}

	private static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
