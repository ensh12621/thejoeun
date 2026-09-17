package day14;

import java.util.Arrays;
import java.util.Random;

public class Quiz5 {

	public static void main(String[] args) {
		
		int[][] map = new int[4][4];
		Random random = new Random();
		
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				
				if(j <= map[i].length-2 && i <= map.length - 2) {
					map[i][j] = random.nextInt(10)+1;
				}else if(j == map[i].length - 1) {
					int tmp = 0;
					for(int x = 0; x<map[i].length; x++) {
						tmp += map[i][x];
//						System.out.println(map[i][x]);
					}
					map[i][j] = tmp;
				}else if(i == map.length - 1) {
					int tmp = 0;
					
					for(int x =0; x<map[3].length; x++) {
						tmp += map[0][x];
					}
					
					
					for(int x = 0; x<map[j].length; x++) {
						tmp += map[i][x];
//						System.out.println(map[i][x]);
					}
					map[i][j] = tmp;
				}
				
				
				
			}
		}
		
		for(int i=0; i<map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		
	}
}
