package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);		
		map.put("C", 2);
		
		System.out.println(map);
		System.out.println(map.get("D"));
		System.out.println(map.get("A") + 3 );
		System.out.println(map.size());
		
		System.out.println(map.containsKey("D"));
		System.out.println(map.containsValue(1));
		
		/// 탐색
		
		// 맵은 for 문을 통해서 찾을 수 있긴 한데..(인덱스는 없으니 인덱스로는 안되고, 향상포문으로만 가능)
		// 향상포문은 iterrable 요소가 있어야 함.
		
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		// 위와 같은 형태로 set으로 만든 뒤에나 itterate 화 시켜야 함.
		
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}	
		
		// 위 혹은 아래의 방식을 사용해서 밸류값에 엑세스를 할 수 있음.
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key + " :: " + map.get(key));
		}
		
		Collection<Integer> collection = map.values();
		System.out.println(collection); // 컬렉션 자체로 쓰이는 일은 거의 없음.
		
		List<Integer> list = new ArrayList<Integer>(collection);
		Set<Integer> set = new HashSet<Integer>(collection);
		
		System.out.println(list);
		System.out.println(set);
		
//		}
//		for(Map.Entry(String, Integer):map) {
//			
//		}
	}
}
