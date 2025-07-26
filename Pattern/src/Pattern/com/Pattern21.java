package Pattern.com;

public class Pattern21 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int k=i;k>0;k--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
