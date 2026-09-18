package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap예제2 {

	public static void main(String[] args) {
		
		
		// 스캐너로 학번, 이름, 자바점수, db점수 입력받아서 map에 담기
		// key는 순서대로 "stuno, name, java, db"
		
		Map<String, Object> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번: ");
		map.put("stuNo", scanner.next());
		
		System.out.print("이름: ");
		map.put("name", scanner.next());
		
		System.out.print("자바점수: ");
		map.put("java", scanner.nextInt());
		
		System.out.print("DB점수: ");
		map.put("db", scanner.nextInt());
		
		
		System.out.println(map);
		
		
	}
}
