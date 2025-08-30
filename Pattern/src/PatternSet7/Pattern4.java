package PatternSet7;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 7;
		int sp = n / 2;
		int val = 1;
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			int x = i;
			for (int k = 1; k <= val; k++) {
				System.out.print(x + " ");
				if (k <= val / 2) {
					x--;
				} else {
					x++;
				}
			}
			sp--;
			val += 2;
			System.out.println();
		}
		sp = 1;
		val = n - 2;
		for (int i = n / 2; i >= 1; i--) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			int x = i;
			for (int k = 1; k <= val; k++) {
				System.out.print(x + " ");
				if (k <= val / 2) {
					x--;
				} else {
					x++;
				}
			}
			sp++;
			val -= 2;
			System.out.println();
		}
	}
}
