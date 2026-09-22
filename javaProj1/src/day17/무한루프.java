package day17;

import java.util.Random;
import java.util.Scanner;

public class 무한루프 {

	// 시작 시 3판 2선 or 5판 3선으로 할 지 메뉴 선택
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// 1가위 2바위 3보
		// 컴퓨터가 1~3중에 랜덤 숫자 생성
		// 사용자 1~3 사이 숫자 입력
		// 게임이 끝나면 다시 할지 말지 y n
		
		while(true) {
			System.out.print("[(1)3판2선 (2)5판3선 (그외)종료] : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				playGame(3, 2, random, scanner);
				
			}else if(menu == 2) {
				playGame(5, 3, random, scanner);
			}else {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
		
	}

	private static void playGame(int matchTotal, int winTop, Random random, Scanner scanner) {

		int matchCount = 0;
		int nUserWin = 0;
		int nCpuWin = 0;
		int nSamePoint = 0;
		
//		System.out.println("matchCount: " +matchCount );
//		System.out.println("matchTotal: " +matchTotal);
//		System.out.println("winTop: " + winTop);
//		System.out.println("userWin: " + nUserWin);
//		System.out.println("cpuWin: " + nCpuWin);
//		
//		System.out.println(matchCount > matchTotal-1);
		
		
		while( matchCount <= matchTotal-1 && (nUserWin < winTop || nCpuWin < winTop)) {
			

			matchCount++;
			
			int cpu = random.nextInt(3) + 1;
			System.out.print("["+matchCount+"회] (1)가위 (2)바위 (3)보: ");
			int user = scanner.nextInt();
			
			// 가위 vs 바위
			if(cpu == user) {
				System.out.println("비겼다");
				nSamePoint++;
			}else if(
					(user == 1 && cpu == 3)
							||
					(user == 2 && cpu == 1)
							||
					(user == 3 && cpu == 2)
					){

				String cpuChoice = cpu == 1 ? "가위" : cpu == 2 ? "바위" : "보"; 
				String playerChoice = user == 1 ? "가위" : user == 2 ? "바위" : "보";
				
				System.out.println("플레이어 : " + playerChoice + ", 컴퓨터: " + cpuChoice);
				
				System.out.println("사용자가 이김");
				nUserWin++;
			}else {
				String cpuChoice = cpu == 1 ? "가위" : cpu == 2 ? "바위" : "보"; 
				String playerChoice = user == 1 ? "가위" : user == 2 ? "바위" : "보";
				
				System.out.println("플레이어 : " + playerChoice + ", 컴퓨터: " + cpuChoice);
				System.out.println("컴퓨터가 이김");
				nCpuWin++;
			}
			
		}
		
		
		System.out.println("컴퓨터 승리한 횟수("+nCpuWin+") 유저 승리한 횟수("+nUserWin+") 비긴 횟수("+nSamePoint+")");
		if(nCpuWin > nUserWin) {
			System.out.println("컴퓨터가 승리하였습니다.");
		}else if(nCpuWin == nUserWin){
			System.out.println("비겼습니다.");
		}else {
			System.out.println("유저가 승리하였습니다.");
		}

		
		System.out.print("다시 시작 하시겠습니까?");
		String keepGoing = scanner.next();
		if(keepGoing.toLowerCase().equals("y")) {
			playGame(matchTotal, winTop, random, scanner);
		}
	}

}
