package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문장 입력: ");
		String phrase = scanner.nextLine();
		Map<String, Object> map = countWords(phrase);
		System.out.println(map);
		scanner.close();
	}

	private static Map<String, Object> countWords(String phraseParam) {
		String phrase = phraseParam.toLowerCase().replaceAll("[,|!]", "");
		
		StringTokenizer tokenizer = new StringTokenizer(phrase, " ");
		List<String> tokenList = new ArrayList<String>();
		
		// 토큰으로 만들기
		int tokenCount = 0;
		while(tokenizer.hasMoreTokens()){
			tokenList.add(tokenizer.nextToken());
			tokenCount++;
		}
		
		// System.out.println("tokenList- " + tokenList);
		
		// 토큰 갯수 구하기
		// System.out.println("tokenCount - " + tokenCount);
		Map<String, Object> tokenMap = new HashMap<String, Object>();
		for(int i=0; i<tokenCount; i++) {
			// System.out.println("for - " + tokenList.get(i));
			Integer tokenDupCount = (Integer)tokenMap.get(tokenList.get(i));
			if(tokenDupCount == null){
				tokenMap.put(tokenList.get(i), 1);
			}else {
				tokenMap.put(tokenList.get(i), (tokenDupCount+1));
			}
		}
		
		return tokenMap;
	}
	
}
