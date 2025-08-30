package Module1;

public class SumOfDigit {

	public static void main(String[] args) {
		int n = 5421;
		System.out.println(sum(n));
	}

	static int sum(int n) {
		if (n <= 9)
			return n;
		return n % 10 + sum(n / 10);
	}

}
