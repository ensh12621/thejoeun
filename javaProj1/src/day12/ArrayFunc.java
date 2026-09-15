package day12;

public class ArrayFunc {

	public static int[] concat(int[] array1, int[] array2) {
		
		int[] concatArr = new int[array1.length + array2.length];
		
		int i = 0;
		for(;i<array1.length; i++) {
			concatArr[i] = array1[i];
		}
		
		int j = 0;
		for(; i<concatArr.length; i++) {
			concatArr[i] = array2[j];
			j++;
		}
		
		return concatArr;
	}

}
