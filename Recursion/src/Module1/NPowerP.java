package Module1;

public class NPowerP {

	public static void main(String[] args) {
		int n=3,p=3;
		System.out.println(power(n,p));
	}

	private static int power(int n, int p) {
		if(p==0)
			return 1;
		return n*power(n,--p);
	}

}
