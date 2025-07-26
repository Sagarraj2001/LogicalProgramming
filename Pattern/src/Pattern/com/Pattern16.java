package Pattern.com;

public class Pattern16 {
	
	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%3d",x);
				x++;
			}
			System.out.println();
		}


	}

}
