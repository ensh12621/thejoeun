package day4;

import java.util.Arrays;

public class _13_선택정렬 {

	public static void main(String[] args) {

		int[] arr = { 9, 6, 7, 3, 5, 66, 40, 2, 275 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				// System.out.println("arr["+i+"]=" + arr[i]+", arr["+j+"]="+ arr[j]);
				if (arr[i] > arr[j]) {
					// System.out.println("changing between " + arr[i] + " and " + arr[j]);
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
			// System.out.println();
		}
		System.out.println(Arrays.toString(arr));
	}
}
