package Pattern.com;

public class Pattern24 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            int x=i;
            for(int k=1;k<=i*2-1;k++) {
            	System.out.print(x+" ");
            	if(k<i)
            		x--;
            	else
            		x++;
            }
            System.out.println();
        }
    }
}
