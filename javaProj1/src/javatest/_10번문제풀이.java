package javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class _10번문제풀이 {

	public static final int MODE_ATTACK = 1;
	public static final int MODE_RECOVERY = 2;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Map<String, Integer> fighters = new HashMap<String, Integer>();
		fighters.put("player", 100);
		fighters.put("monster", 100);
		
		
		
		
		
		System.out.println("야생의 몬스터가 나타났다");
		
		while(true) {
			int action = printStatus(fighters, scanner);
			
			switch(action) {
			
			case MODE_ATTACK:
				attackMonster(fighters, random);
				break;
				
			case MODE_RECOVERY:
				recoverUser(fighters, random);
				break;
			}
			
			if(fighters.get("player") == 0 || fighters.get("monster") == 0) {
				System.out.println("게임 종료");
				break;
			}
			
			monsterTryToAttack(fighters, random);
			
		}
		
		 
		
	}

	private static void monsterTryToAttack(Map<String, Integer> fighters, Random random) {
		int playerHP = fighters.get("player");
		int damage = random.nextInt(10) + 5;
		playerHP -= damage;
		System.out.println("몬스터의 공격! 플레이어는 "+ damage +"의 피해를 입었습니다.");
		if(playerHP < 0) {
			playerHP = 0;
			System.out.println("몬스터의 승리! 안타깝군요.");
		}
		
		fighters.put("player", playerHP);
	}

	private static void recoverUser(Map<String, Integer> fighters, Random random) {
		
		int playerHP = fighters.get("player");
		int healPoint =  random.nextInt(25)+5;
		playerHP += healPoint;
		
		fighters.put("player", playerHP);
		
		System.out.println("플레이어가 체력을 "+healPoint+"만큼 회복했습니다.");
	}

	private static void attackMonster(Map<String, Integer> fighters, Random random) {
		int monsterHP = fighters.get("monster");
		int damage = random.nextInt(10) + 11;
		monsterHP -= damage;
		System.out.println("플레이어의 공격! 몬스터에게 " + damage + "의 피해를 입혔습니다.");
		if(monsterHP < 0) {
			monsterHP = 0;
			System.out.println("몬스터를 쓰려뜨렸습니다! 플레이어 승리!");
		}
		fighters.put("monster", monsterHP);
	}

	private static int printStatus(Map<String, Integer> fighters, Scanner scanner) {
		
		int playerHP = fighters.get("player");
		int monsterHP = fighters.get("monster");
		
		System.out.println("======================================");
		System.out.println("[현재 상태] 플레이어 HP: "+ playerHP +" / 몬스터 HP: " + monsterHP);
		System.out.println("행동을 선택하세요 (1.공격 2.회복): ");
		return scanner.nextInt();
		
	}

}
