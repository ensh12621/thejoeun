package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 컬렉션 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.print(i+"번째 문자 입력: ");
			String input = scanner.next();
			list.add(input);
			
		}
		System.out.println(list);
		
		// 텍스트의 길이가 가장 큰 텍스트를 출력
		
		int maxTarget = 0;
		

		for(int i=0; i<list.size() - 1; i++) {
//			System.out.println("get(i).length : " + list.get(i).length() +", i+1 length: " + list.get(i+1).length());
			if(list.get(maxTarget).length() < list.get(i+1).length()) {
//				System.out.println("캐치");
				maxTarget = i+1;
			}
		}

		System.out.println(list.get(maxTarget));
		
		
		
	}
}
