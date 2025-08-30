package Module2;

import java.util.Arrays;

public class NthBiggest {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 32, 21, 10, 21, 34, 62, 41 };
		int n=3;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		if(n>arr.length) {
			System.out.println("N value is greater than arr size");
		}
		else {
			System.out.println(arr[arr.length-n]);
		}
		
	}

}
