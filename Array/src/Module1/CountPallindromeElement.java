package Module1;

public class CountPallindromeElement {

	public static void main(String[] args) {
		int arr[] = { 10, 11, 15, 33, 24, 66, 27 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPllaindrome(arr[i])) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean isPllaindrome(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev==temp;
	}

}
