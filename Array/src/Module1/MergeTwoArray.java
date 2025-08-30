package Module1;

public class MergeTwoArray {

	public static void main(String[] args) {
		int arr1[]= {10,11,15,31,24,62,27};
		int arr2[]= {10,51,61,42};
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
