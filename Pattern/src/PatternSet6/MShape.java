package PatternSet6;

public class MShape {

	public static void main(String[] args) {
		int n = 5;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (i == j && i <= mid) || (i + j == n + 1 && i <= mid))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
