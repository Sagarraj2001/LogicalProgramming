package PatternSet7;

public class Pattern8 {

	public static void main(String[] args) {
		int n=7,sp=0,val=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=val;k++) {
				System.out.print(k+" ");
			}
			if(i<=n/2) {
				sp++;
				val-=2;
			}
			else {
				sp--;
				val+=2;
			}
			System.out.println();
		}
	}

}
