package Pattern2.com;

public class SPattern {

	public static void main(String[] args) {
		 int n = 5; 
		 int mid=n/2+1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <=n; j++) {
	               if(i==1 || i==n ||i==mid || (i==2 && j==1) || (i==n-1 && j==n)) {
	            	   System.out.print("* ");
	               }
	               else {
	            	   System.out.print("  ");
	               }
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <=n; j++) {
	               if(j==1 || j==n || i==1 || i==mid) {
	            	   System.out.print("* ");
	               }
	               else {
	            	   System.out.print("  ");
	               }
	            }
	            System.out.println();
	        }
	        System.out.println();
	        for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if (i == 1 || i == n || j == 1 || (i == mid && j >= mid)|| (j==n && i>mid) ) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
	        System.out.println();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <=n; j++) {
	               if(j==1 || j==n || i==1 || i==mid) {
	            	   System.out.print("* ");
	               }
	               else {
	            	   System.out.print("  ");
	               }
	            }
	            System.out.println();
	        }
	        System.out.println();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <=n; j++) {
	               if(j==1 || i==1 || i==mid || (j==n && i<=mid)|| (i==j && i>=mid)) {
	            	   System.out.print("* ");
	               }
	               else {
	            	   System.out.print("  ");
	               }
	            }
	            System.out.println();
	        }
	}

}
