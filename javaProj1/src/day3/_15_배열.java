package day3;

public class _15_배열 {

	public static void main(String[] args) {
		int arr[] = {5, 2, 7, 4, 3};

		int max = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
}
