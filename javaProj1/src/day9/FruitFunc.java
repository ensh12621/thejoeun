package day9;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FruitFunc {

	static Scanner s = new Scanner(System.in);
	static Map<String, Object> searchFruit(List<Map<String, Object>> list, String searchKeyword) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("name").equals(searchKeyword)) {
				return list.get(i);
			}
		}
		return null;
	}
}
