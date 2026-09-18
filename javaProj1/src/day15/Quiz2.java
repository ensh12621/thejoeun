package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		StringBuffer buffer = new StringBuffer();
		Map<String, Integer> map = new HashMap<>();
		
		while(true) {
			System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
			String input = scanner.nextLine();
			
			if(input.equals(";")) {
				break;
			}
			
			buffer.append(input);
		}
		
		String subject = buffer.toString();
		
		for(int i=0; i<subject.length(); i++) {
			char c = subject.toLowerCase().charAt(i);
//			System.out.println("loop - " + c);
			
//			System.out.println("----during loop c("+c+")- " + map);
			
			if(map.get(String.valueOf(c)) == null) {
				// 신규 키워드가 맵에 들어올 때
//				System.out.println("["+i+"]get c null");
				map.put(String.valueOf(c), Integer.valueOf(1));
			}else {
//				System.out.println("["+i+"]get c is not null");
				// 맵에 키워드가 이미 존재한다면 수치 증가
				Integer nextNum = map.get(String.valueOf(c)) + 1;
//				System.out.println("nextNum => " + nextNum);
				map.put(String.valueOf(c), nextNum);
			}
		}
		
		System.out.println("히스토그램을 그립니다.");
		
		System.out.println(map);
		
		String[] alphabetArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
								"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		for(String s : alphabetArr) {
			Integer num = map.get(s.toLowerCase());
			
			System.out.print(s);
			if(num != null) {
//				System.out.println("num =>" + num);
				for(int i=0; i<num; i++) {
					System.out.print("-");
				}
				
			}
			System.out.println();
		}
		
	}
}
