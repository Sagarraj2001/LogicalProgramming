package Pattern.com;

public class Pattern19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char)(k + 64) + " ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print((char)(k + 64) + " ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
