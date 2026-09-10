package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _2_ArrayList문제 {
	public static void main(String[] args) {
		
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int ranNum;
			while(true) {
				ranNum = random.nextInt(30) + 1;
//				System.out.println("입력 시도 => " + ranNum);
				if(!list.contains(ranNum)) {
					break;
				}
//				System.out.println("중복..");
			}
			
			list.add(ranNum);
			//System.out.println(list);	
			
			
		}
		
		System.out.println(list);
	}
}
