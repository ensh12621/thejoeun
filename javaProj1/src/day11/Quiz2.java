package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz2 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,3};
		int[] arr2 = {3,2,1,2};
		
		boolean result = hasSameElementCounts(arr1, arr2);
		System.out.println(result);
		
		int[] arr3 = {1,2,2};
		int[] arr4 = {1,2,3};
		
		result = hasSameElementCounts(arr3, arr4);
		System.out.println(result);
	}

	private static boolean hasSameElementCounts(int[] arr1, int[] arr2) {
		
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		
		for(int i=0; i<arr1.length; i++) {
			
			Integer cnt = map1.get(arr1[i]);
			Integer cnt2 = map2.get(arr2[i]);
			
			if(cnt == null) {
				map1.put(arr1[i], Integer.valueOf(1));
			}else {
				map1.put(arr1[i], cnt+1);
			}
			
			if(cnt2 == null) {
				//System.out.println("cnt2 is null => " + arr2[i]);
				map2.put(arr2[i], Integer.valueOf(1));
			}else {
				//System.out.println("cnt2 is not null => " + arr2[i] + ", cnt2+1:" + (cnt2+1) );
				map2.put(arr2[i], cnt2+1);
			}
			
//			System.out.println("for - map1 =>" + map1);
//			System.out.println("for - map2 => " + map2);
			//System.out.println("for arr2["+i+"] => " + arr2[i]);
			
		}
		
//		System.out.println("result => " + map1);
//		System.out.println("result2 => " + map2);
		
		Set<Integer> map1KeySets = map1.keySet();
		Iterator<Integer> iter1 = map1KeySets.iterator();
		
		while(iter1.hasNext()) {
			Integer intKey= iter1.next();
//			System.out.println(intKey + "," + map1.get(intKey));
//			System.out.println(intKey + "," + map2.get(intKey));
			if(map1.get(intKey) != map2.get(intKey)) {
				return false;
			}
			
		}
		
		return true;
	}
}
