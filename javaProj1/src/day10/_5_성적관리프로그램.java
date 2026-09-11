package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _5_성적관리프로그램 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();
		List<String> indexList = new ArrayList<>();
		System.out.println("========= 성적관리 프로그램 =========");

		while (true) {
			System.out.print("[ (1)성적등록 (2)성적확인 (3)리스트 (그외)종료 ]: ");
			int menu = scanner.nextInt();

			if (menu == 1) {
				addNewGrade(scanner, list, indexList);
			} else if (menu == 2) {
				showGradeList(scanner, list);
			} else if (menu == 3) {
				printRank(list);
				// 메뉴에 들어오면 학생들 전체 등수 출력
				// 5명 있으면
				// 1등 : 000, 00점
				// 2등 : 000
				// 3등 : 000
				// 4등 : 000
				// 5등 : 000
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	private static void printRank(List<Map<String, Object>> list) {
		// 메뉴에 들어오면 학생들 전체 등수 출력
		// 5명 있으면
		// 1등 : 000, 00점
		// 2등 : 000
		// 3등 : 000
		// 4등 : 000
		// 5등 : 000

		// 총점 구하기

		// 총점과 이름을 담는 리스트
		List<Map<String, Object>> totalList = new ArrayList<>();

		// 총점과 이름 값을 구해서 배열에 담기
		String[] studNameArr = new String[list.size()];
		Integer[] studTotalArr = new Integer[list.size()];
		for (int i = 0; i < list.size(); i++) {
			studNameArr[i] = (String) list.get(i).get("studName");
			studTotalArr[i] = (Integer) list.get(i).get("java") + (Integer) list.get(i).get("db")
					+ (Integer) list.get(i).get("html");
		}

		// 총점 비교 후에 이름과 총점 배열 위치 동시에 바꾸기 - 버블정렬
		for (int i = 0; i < studTotalArr.length - 1; i++) {
			for (int j = 0; j < studTotalArr.length - 1 - i; j++) {
				if (studTotalArr[j] < studTotalArr[j + 1]) {
//					System.out.println(studTotalArr[j] + "점 / " + studTotalArr[j + 1] + "점");
					String tmpName = studNameArr[j];
					studNameArr[j] = studNameArr[j + 1];
					studNameArr[j + 1] = tmpName;

					Integer tmpInt = studTotalArr[j];
					studTotalArr[j] = studTotalArr[j + 1];
					studTotalArr[j + 1] = tmpInt;
//					System.out.println("교체 후..");
//					System.out.println(studTotalArr[j] + "점 / " + studTotalArr[j + 1] + "점");
				}
			}

		}

		for (int i = 0; i < studTotalArr.length; i++) {
			System.out.println((i + 1) + "등: " + studNameArr[i] + ", " + studTotalArr[i] + "점");

		}

	}

	private static void showGradeList(Scanner scanner, List<Map<String, Object>> list) {
		System.out.print("학번 입력: ");
		String studNo = scanner.next();

		Map<String, Object> studentMap = findByStudentNo(list, studNo);

		if (studentMap == null) {
			System.out.println("학번을 확인해주세요.");
		} else {
			Integer total = (Integer) studentMap.get("java") + (Integer) studentMap.get("db")
					+ (Integer) studentMap.get("html");
			System.out.println(studentMap.get("studName") + " 학생의 총점은 " + total + "입니다.");
		}

		// 학번이 존재하면, 해당 학생의 시험 총점 출력
		// 해당 학번 x => 학번을 확인해주세요.

	}

	private static Map<String, Object> findByStudentNo(List<Map<String, Object>> list, String studNo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get("studNo").equals(studNo)) {
				return list.get(i);
			}
		}
		return null;
	}

	private static void addNewGrade(Scanner scanner, List<Map<String, Object>> list, List<String> indexList) {

		Map<String, Object> map = new HashMap<String, Object>();

		String studNo = receiveStudNo(scanner, indexList, 4, "학번: ");

		System.out.print("이름: ");
		String studName = scanner.next();
		int java = inputPoint(scanner, 0, 40, "JAVA 점수: ");
		int db = inputPoint(scanner, 0, 35, "DB 점수: ");
		int html = inputPoint(scanner, 0, 25, "HTML 점수: ");

//		System.out.print("JAVA 점수: ");
//		int java= scanner.nextInt();
//		System.out.print("DB 점수: ");
//		int db = scanner.nextInt();
//		System.out.print("HTML 점수: ");
//		int html = scanner.nextInt();

		map.put("studNo", studNo);
		map.put("studName", studName);
		map.put("java", java);
		map.put("db", db);
		map.put("html", html);

		indexList.add(studNo);
		list.add(map);
	}

	private static int inputPoint(Scanner scanner, int min, int max, String prompt) {

		while (true) {

			System.out.print(prompt);
			int input = scanner.nextInt();
			if (input >= min && input <= max) {
				return input;
			}
			System.out.println(min + "과 " + max + "값 사이에 다시 입력해주세요.");
		}
	}

	private static String receiveStudNo(Scanner scanner, List<String> indexList, int length, String prompt) {

		while (true) {
			System.out.print(prompt);
			String val = scanner.next();

			if (val.length() != length) {
				System.out.println("학번은 4글자로 입력해주세요.");
				continue;
			}

			if (indexList.contains(val)) {
				System.out.println("중복되는 학번입니다. 다시 입력해주세요.");
				continue;
			}

			return val;
		}
	}
}
