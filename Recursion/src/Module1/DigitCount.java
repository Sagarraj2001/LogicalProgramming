package Module1;

public class DigitCount {

	public static void main(String[] args) {
		int n = 5425;
		System.out.println(count(n));
	}

	private static int count(int n) {
		if (n < 10) {
			return 1;
		}
		return 1 + count(n / 10);
	}

}
