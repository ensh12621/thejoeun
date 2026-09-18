package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayList예제2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		// 1부터 20까지 숫자 6개넣기
		// 일단은 중복 신경쓰지 말것
		
		
		for(int i=0; i<6; i++) {
			int ranNum = random.nextInt(20)+1;
			
			if(list.contains(ranNum)) {
				i--;
				continue;
			}
			
			list.add(ranNum);
		}
		
		System.out.println(list);
	}
}
