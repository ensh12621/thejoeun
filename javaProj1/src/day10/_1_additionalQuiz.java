package day10;

import java.util.Random;

public class _1_additionalQuiz {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr = new int[20];
		int [] cntArr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			cntArr[arr[i]-1]++;
		}
		
		System.out.println("array list ---");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("cntArr list ---");
		for(int i = 0; i<cntArr.length; i++) {
			System.out.println("["+(i+1)+"] 갯수: " + cntArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("cntArr => " + cntArr);
	}

}
