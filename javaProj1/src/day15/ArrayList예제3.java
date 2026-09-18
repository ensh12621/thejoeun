package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList예제3 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 30);
		Human park = new Human("박영희", 30);
		
		List<Human> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		
		System.out.println(list);
		
		// 사람 이름 입력받고 list에 있는지 검색
		// 있으면 "있다" 출력 후 종료
		// 없으면 아무것도 출력 x
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String keyword = scanner.next();

		
		for(Human h : list) {
			if(h.getName().equals(keyword)){
				System.out.println("있다");
			}
		}
		
		
		
		
		
		
	}
}
