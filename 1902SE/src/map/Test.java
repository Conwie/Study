package map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		/*
		 * 统计当前字符串中每个字符出现的次数
		 */
		String str = "thinking in java!! i love java!";
		/*
		 * key:出现的字符
		 * value:该字符出现的次数
		 */
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				Integer value = map.get(c);
				map.put(c,++value);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
	}

}
