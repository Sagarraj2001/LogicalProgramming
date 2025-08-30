package PatternSet7;

public class Pattern6 {

	public static void main(String[] args) {
		int n=7,sp=n/2,val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int k=1;k<=val;k++) {
				System.out.print((char)(x+64)+" ");
				if(k<=val/2) {
					x++;
				}
				else {
					x--;
				}
			}
			if(i<=n/2) {
				sp--;
				val+=2;
			}
			else {
				sp++;
				val-=2;
			}
			System.out.println();
		}
	}

}
