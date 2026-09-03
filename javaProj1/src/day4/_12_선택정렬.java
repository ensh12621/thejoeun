package day4;

import java.util.Arrays;

public class _12_선택정렬 {

	public static void main(String[] args) {
		int[] arr = { 9, 6, 7, 3, 5 };

		System.out.println("original -> " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				// System.out.println("arr["+i+"]=" + arr[i]+", arr["+j+"]="+ arr[j]);
				if(arr[i] > arr[j]){
					// System.out.println("changing between " + arr[i] +  " and " + arr[j]);
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
			//System.out.println();
		}

//		
//		System.out.println(Arrays.toString(arr));
//	
//		int minIndex = 0;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[minIndex] > arr[i]) {
//				minIndex = i;
//			}
//		}
//		int temp = arr[0];
//		arr[0] = arr[minIndex];
//		arr[minIndex] = temp;
//		System.out.println(Arrays.toString(arr));
//		

		System.out.println("Sorted -> " + Arrays.toString(arr));
	}
}
