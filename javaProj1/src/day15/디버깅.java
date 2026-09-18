package day15;

public class 디버깅 {

	public static void main(String[] args) {
		int[] arr = {3,5,2,9,4};
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		
		
		for(int i=0; i<arr.length; i++) { // 에러 발생 디버그 확인용
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		
	}
}
