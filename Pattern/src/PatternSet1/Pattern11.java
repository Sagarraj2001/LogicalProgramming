package PatternSet1;

public class Pattern11 {

	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(x%2 +" ");
				x++;
				
			}
			System.out.println();
		}
	}

}
