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

		while (true) {
			System.out.print("[ (1)회원추가 (2)확인 (3)포인트차감 (그외)종료 ] : ");
			int menu = scanner.nextInt();

			if (menu == 1) {
				// 이름, 추가할 포인트값(int) 입력받아서 맵에 저장 후 리스트에 저장
				// 포인트를 0이하, 10,000초과 입력할 경우 1~10,000 사이 값을 입력해주세요.
				inputUserInfo(scanner, list);
			} else if (menu == 2) {
				System.out.println(list);
			} else if (menu == 3) {
				subtractPoint(scanner, list);
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

	private static void subtractPoint(Scanner scanner, List<Map<String, Object>> list) {

		// 차감할 사람의 이름 입력
		// 존재여부 체크
		// 있으면 차감할 포인트 입력받고 처리
		// 없을 경우 "해당 사용자 없음" 출력
		// 포인트 음수 불가능 사용자가 가진 포인트 이상으로 차감 불가능
		
		System.out.print("회원이름 입력: ");
		String userName = scanner.next();
		if(!existsUser(userName, list)) {
			System.out.println("해당 사용자 없음");
			return;
		}
		
		Integer maxPoint = -1;
		
		Map<String, Object> target = null;
		
		for(Map<String, Object> map : list) {
			if(map.get("name").equals(userName)) {
				target = map;
				maxPoint = (Integer)map.get("point");
				break;
			}
		}
		
		int pointToSubtract = receiveInput("차감할 포인트 입력: ", scanner, 0, maxPoint);
		int newPoint = maxPoint - pointToSubtract;
		
		target.put("point", newPoint);
		System.out.println("차감이 완료되어 "+ newPoint + " point가 남았습니다.");
	}


	private static boolean existsUser(String userName, List<Map<String, Object>> list) {

		for(Map<String, Object> map : list) {
			if(map.get("name").equals(userName)) {
				return true;
			}
		}
		
		
		return false;
	}

	private static void inputUserInfo(Scanner scanner, List<Map<String, Object>> list) {
		// 이름, 추가할 포인트값(int) 입력받아서 맵에 저장 후 리스트에 저장
		// 포인트를 0이하, 10,000초과 입력할 경우 1~10,000 사이 값을 입력해주세요.

		System.out.print("이름: ");
		String name = scanner.next();

		Integer point = receiveInput("포인트: ", scanner, 0, 10000);

//		System.out.print("포인트: ");
//		Integer point = scanner.nextInt();

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", name);
		map.put("point", point);

		list.add(map);
	}

	private static Integer receiveInput(String prompt, Scanner scanner, int min, int max) {

		while (true) {

			System.out.print(prompt);
			int input = scanner.nextInt();
			if (input >= min && input <= max) {
				return input;
			}
			System.out.println(min + " ~ " + max + " 사이의 수에서 다시 입력 바랍니다");
		}
	}
}
