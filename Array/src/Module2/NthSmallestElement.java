package Module2;

import java.util.Arrays;

public class NthSmallestElement {

	public static void main(String[] args) {
		int n=4;
		int arr[]= {10,21,31,12,19,13,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		if(n>arr.length) {
			System.out.println(" n value is bigger than array size");
		}
		else {
			System.out.println(arr[arr.length-n]);
		}
	}

}
