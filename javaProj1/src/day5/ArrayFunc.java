package day5;

public class ArrayFunc {

	public void maxMinChange(int[] arr) {
		int minIdx = -1, maxIdx = -1;
		int tmpVal = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(tmpVal > arr[i]) {
				tmpVal = arr[i];
				minIdx = i;
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			if(tmpVal < arr[i]) {
				tmpVal = arr[i];
				maxIdx = i;
			}
		}
		
		int tmpVal2 = arr[minIdx];
		arr[minIdx] = arr[maxIdx];
		arr[maxIdx] = tmpVal2;
		
		
		
		
	}

}
