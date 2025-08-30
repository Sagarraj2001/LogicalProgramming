package PatternSet7;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 4; 
        int st = n;
        int rows = 2 * n - 1; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if (i < n) {
                st--; 
            } else {
                st++;
            }
            System.out.println();
        }
    }
}
