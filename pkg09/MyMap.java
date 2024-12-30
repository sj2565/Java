package pkg09;

import java.util.*;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "»ï¼º");
		map.put(2, "·Ôµ¥");
		map.put(3, "±â¾Æ");
		map.put(4, "sk");
		
		boolean bool = map.containsKey(5);
		System.out.println(bool);
		bool = map.containsKey(3);
		System.out.println(bool);
		
		bool = map.containsValue("³Ø¼¾");
		System.out.println(bool);
		bool = map.containsValue("»ï¼º");
		System.out.println(bool);
		
		if(!map.containsValue("³Ø¼¾")) {
			map.put(5, "³Ø¼¾");
		}
		
		Set<Integer> keylist = map.keySet();
		System.out.println(keylist);
		
		System.out.println("¸Ê Á¤º¸ Ãâ·ÂÇÏ±â");
		for (Integer key : keylist) {
			String value = map.get(key);
			System.out.println("Å° : " + key + ", °ª : " +value);
		}
		
		//map.clear();
		
		if (map.isEmpty()) {
			System.out.println("¸ÊÀÌ ºñ¾î ÀÖ´Ù");
		}
		else {
			System.out.println("¸Ê¿¡ ¿ä¼Ò°¡ µé¾î ÀÖ´Ù");
		}
		
		System.out.println(map);
		System.out.println("¿ä¼ÒÀÇ Å©±â : " +map.size());
	}
}