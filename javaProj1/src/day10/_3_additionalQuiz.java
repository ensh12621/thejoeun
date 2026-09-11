package day10;

public class _3_additionalQuiz {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3 };
		int[] arr2 = { 3, 2, 1, 2 };
		System.out.println(sameNumberCounts(arr1, arr2));
		
		int[] arr3 = {1, 2, 2};
		int[] arr4 = {1, 2, 3};
		System.out.println(sameNumberCounts(arr3, arr4));

	}

	private static boolean sameNumberCounts(int[] arr1, int[] arr2) {
		
		
		boolean isSame = true;
		
		// 배열을 순차적으로 접근해서
		for(int i=0; i<arr1.length; i++) {
			int val = arr1[i];
			int valCnt = 0;
			int valCntInArr2 = 0;
			
			// 첫 번째 배열 요소의 특정 번호의 값이 첫 번째 배열의 다른 요소들과 일치하는 경우
			// 첫 번째 배열에서 몇 회 일치하는지 확인
			for(int j=0; j<arr1.length; j++) {
				if(val == arr1[j])
					valCnt++;
			}
			
			// 첫 번째 배열 요소의 특정 번호의 값이 두 번째 배열의 요소들과 몇 개나 일치하는 지 확인
			for(int j=0; j<arr2.length; j++) {
				if(val == arr2[j]) {
					valCntInArr2++;
				}
			}
			
			if(valCnt != valCntInArr2) {
				isSame = false;
				break;
			}
			
		}
		
		return isSame;
	}
}
