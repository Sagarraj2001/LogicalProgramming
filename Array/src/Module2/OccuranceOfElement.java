package Module2;

public class OccuranceOfElement {

	public static void main(String[] args) {
		int arr[] = { 10, 51, 12, 21, 10, 21, 51 };
		boolean b[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(arr[i]+"-->"+count);
			}
		}
	}

}
