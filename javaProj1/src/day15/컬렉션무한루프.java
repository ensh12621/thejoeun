package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 컬렉션무한루프 {

	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=============== 포인트 관리 프로그램 ==============");
		
		while(true) {
			System.out.print("[ (1)회원추가 (2)확인 (그외)종료 ] : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				// 이름, 추가할 포인트값(int) 입력받아서 맵에 저장 후 리스트에 저장
				// 포인트를 0이하, 10,000초과 입력할 경우 1~10,000 사이 값을 입력해주세요.
				inputUserInfo(scanner, list);
			}else if(menu == 2) {
				System.out.println(list);
			}else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

	private static void inputUserInfo(Scanner scanner, List<Map<String, Object>> list) {
		// 이름, 추가할 포인트값(int) 입력받아서 맵에 저장 후 리스트에 저장
		// 포인트를 0이하, 10,000초과 입력할 경우 1~10,000 사이 값을 입력해주세요.
		
		System.out.print("이름: ");
		String name = scanner.next();
		
		System.out.print("포인트: ");
		Integer point = scanner.nextInt();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", name);
		map.put("point", point);
		
		list.add(map);
	}
}
