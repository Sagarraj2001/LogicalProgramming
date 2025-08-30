package Module1;

public class CountOddDigit {

	public static void main(String[] args) {
		int n = 1154214;
		System.out.println(count(n));
	}

	static int count(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) % 2 != 0)
			return 1 + count(n / 10);
		return count(n / 10);
	}
}
