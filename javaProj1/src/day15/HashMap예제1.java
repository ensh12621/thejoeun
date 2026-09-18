package day15;

import java.util.HashMap;
import java.util.Map;

public class HashMap예제1 {

	public static void main(String[] args) {
		Map<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("hegiht", 170.1);
		
		//System.out.println(hong);
		
		Map<String, Object> addr = new HashMap<>();
		addr.put("도로명주소", "인천시 부평구 어쩌구 저쩌구 ...");
		addr.put("상세주소", "00동 00호");
		addr.put("우편번호", "123-123");
		
		hong.put("address", addr);
		
		System.out.println(hong);
		Map<String, Object> addrMapReturned = (Map<String, Object>)hong.get("address");
		System.out.println(addrMapReturned.get("도로명주소"));
		
	}
	
}
