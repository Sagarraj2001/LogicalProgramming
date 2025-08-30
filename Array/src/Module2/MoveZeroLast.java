package Module2;

import java.util.Arrays;

public class MoveZeroLast {

	public static void main(String[] args) {
		int arr[]= {10,0,1,2,0,6,2,0,0,5,2,6,0};
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		for(int i=index;i<arr.length;i++) {
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
