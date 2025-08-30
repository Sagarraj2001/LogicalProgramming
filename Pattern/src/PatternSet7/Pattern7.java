package PatternSet7;

public class Pattern7 {

    public static void main(String[] args) {
        int n = 7; // odd number of rows
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if (i <= n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }

            System.out.println();
        }
    }
}
