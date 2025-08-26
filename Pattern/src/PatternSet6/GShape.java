package PatternSet6;

public class GShape {

	public static void main(String[] args) {
		int n = 5;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || (j == n && i >= mid) || (i == mid && j >= mid))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
