package Module1;

public class LinearSerach {

	public static void main(String[] args) {
		int arr[]= {10,11,15,31,24,62,27};
		int target=5;
		int resIndex=linearSerach(arr,target);
		if(resIndex==-1) {
			System.out.println(target+" is not available in the present Array");
		}
		else {
			System.out.println(target+" is found at "+resIndex +" Position");
		}
	}

	private static int linearSerach(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				return i+1;
			}
		}
		return -1;
	}

}
