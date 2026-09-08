package day7_test;

import java.util.Arrays;
import java.util.Random;

public class Quiz6 {

	public static void main(String[] args) {

		
		
		Random random = new Random();
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			while(true) {
				int ranNum = random.nextInt(100) + 1;
				//System.out.println("롤링.." + ranNum);
				if(!String.valueOf(ranNum).endsWith("3")){
					//System.out.println("값 입력 완료.." + ranNum);
					arr[i] = ranNum;
					break;
				}
			}
			
			//System.out.println("다음 수\n");
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
