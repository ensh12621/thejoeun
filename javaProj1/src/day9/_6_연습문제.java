package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _6_연습문제 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();
		System.out.println("==== 성적 입력 프로그램 ====");
		
		while(true) {
			System.out.print("[ (1) 성적입력 (2) 성적확인 (그 외) 종료] : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				// 이름, 자바점수, db점수, html점수 입력받아서 map으로 만든 후 list에 저장
				Map<String, Object> map = new HashMap<>();
				System.out.println("==============입력 화면 ==============");
				
				System.out.print("이름:");
				String name = scanner.next();
				map.put("name", name);
				System.out.print("자바:");
				int java = scanner.nextInt();
				map.put("java", java);
				System.out.print("DB:");
				int db = scanner.nextInt();
				map.put("db", db);
				System.out.print("HTML:");
				int html = scanner.nextInt();
				map.put("html", html);
				
				list.add(map);
				System.out.println("입력완료..");
				
			}else if(menu == 2){
				// 이름을 입력받은 후 해당학생의 각 점수 출력
				// 학생이 list에 존재하지 않으면 "등록된 학생이 아님 ㅋㅋ"
				System.out.println("학생 검색: ");
				String search = scanner.next();
				
				int searchedIdx = -1;
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("name").equals(search)) {
						searchedIdx = i;
						break;
					}
				}
				
				if(searchedIdx == -1) {
					System.out.println("등록된 학생이 아님 ㅋㅋ");
				}else {
					Map<String, Object> student = list.get(searchedIdx);
					System.out.println(student.get("name") + " 학생의 점수");
					System.out.println("JAVA: " + student.get("java"));
					System.out.println("DB: " + student.get("db"));
					System.out.println("HTML: " + student.get("html"));
				}
				
			}else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		scanner.close();
	}
}
