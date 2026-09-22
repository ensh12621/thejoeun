package javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _8번문제풀이 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Map<String, Object>> studentList = new ArrayList<>();

		mainLoop: while (true) {
			System.out.println("=== 학생 관리 시스템 입니다!===");
			System.out.print("[(1)학생추가 (2)성적입력 (3)조회 (4)성적수정 (5)종료] : ");
			int command = scanner.nextInt();

			switch (command) {

			case 1:
				addStudent(scanner, studentList);
				break;

			case 2:
				addPoint(scanner, studentList);
				break;

			case 3:
				printGrade(studentList);
				break;

			case 4:
				updateGrade(scanner, studentList);
				break;

			case 5:
			default:
				break mainLoop;
			}

		}

		System.out.println("종료되었습니다.");
	}

	private static void updateGrade(Scanner scanner, List<Map<String, Object>> studentList) {
		System.out.print("이름 입력: ");
		String studentName = scanner.next();

		Map<String, Object> studentMap = findByStudentName(studentName, studentList);
		
		if (studentMap == null) {
			System.out.println("존재하지 않는 학생입니다. 처음으로 이동합니다.");	
			return;
		}
		
		System.out.print("수정할 과목명: ");
		String subject = scanner.next();
		
		int newPoint = 0;
		
		
		switch(subject){
		
		case "java":
			editPoint("java", studentMap, scanner);
			break;
			
		case "oracle":
			editPoint("oracle", studentMap, scanner);
			break;
			
		default:
			System.out.println("존재하지 않는 과목입니다.");
			break;
			
		}
	}

	private static void editPoint(String subject, Map<String, Object> studentMap, Scanner scanner) {
		System.out.println(subject+": ");
		int newPoint = scanner.nextInt();
		studentMap.put(subject, Integer.valueOf(newPoint));
	}

	private static void printGrade(List<Map<String, Object>> studentList) {
		System.out.println(studentList);
	}

	private static void addPoint(Scanner scanner, List<Map<String, Object>> studentList) {

		System.out.print("이름 입력: ");
		String studentName = scanner.next();

		Map<String, Object> studentMap = findByStudentName(studentName, studentList);
		
		if (studentMap == null) {
			System.out.println("존재하지 않는 학생입니다. 처음으로 이동합니다.");	
			return;
		}
		
		int java = receiveNumberInBetween("java: ", 0, 100, scanner);
		int oracle = receiveNumberInBetween("oracle: ", 0, 100, scanner);
		
		studentMap.put("java", java);
		studentMap.put("oracel", oracle);
	}

	private static int receiveNumberInBetween(String prompt, int min, int max, Scanner scanner) {
		
		while(true) {
			System.out.print(prompt);
			int input = scanner.nextInt();
			
			if(!(input >= min && input <= max)) {
				System.out.println(min+" ~ " + max +" 사이의 값을 입력해주세요.");
				continue;
			}
			
			return input;
		}
	}

	private static Map<String, Object> findByStudentName(String studentName, List<Map<String, Object>> studentList) {
		for(Map<String, Object> studentMap: studentList) {
			String targetName = (String)studentMap.get("name");
			if(targetName.equals(studentName)) {
				return studentMap;
			}
		}
		return null;
	}

	private static void addStudent(Scanner scanner, List<Map<String, Object>> studentList) {

		System.out.print("이름 입력: ");
		String studentName = scanner.next();

		if (existsStudentName(studentName, studentList)) {
			System.out.println("이미 존재하는 학생입니다. 처음으로 이동합니다.");	
			return;
		}
		
		Map<String, Object> studentMap = new HashMap<>();
		studentMap.put("name", studentName);
		studentList.add(studentMap);
		System.out.println("학생이 추가되었습니다.");
	}

	private static boolean existsStudentName(String studentName, List<Map<String, Object>> studentList) {
		for(Map<String, Object> studentMap : studentList) {
			String nameInDB = (String)studentMap.get("name");
			if(studentName.equals(nameInDB)) {
				return true;
			}
		}
		return false;
	}
}
