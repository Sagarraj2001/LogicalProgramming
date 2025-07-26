package Pattern3;

public class Pattern7 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
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
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
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
