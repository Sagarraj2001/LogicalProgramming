package Module1;

public class ProductOfDigit {

	public static void main(String[] args) {
		int n = 5632;
		System.out.println(product(n));
	}

	static int product(int n) {

		if (n <= 9)
			return n;
		return n % 10 * product(n / 10);
	}

}
