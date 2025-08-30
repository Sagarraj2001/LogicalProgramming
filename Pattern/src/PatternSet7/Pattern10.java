package PatternSet7;

public class Pattern10 {

	public static void main(String[] args) {
		int n=7;
		int val=1,sp=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=val;j++) {
				System.out.print(j+" ");
			}
			if(i<=n/2) {
				val++;
				sp--;
			}
			else {
				val--;
				sp++;
			}
			System.out.println();
		}
	}

}
