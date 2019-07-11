package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		String s = "good good study day day up";
		String ns = s.replaceAll("\\s", "");
		System.out.println(ns);
		char[] chs = ns.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<chs.length;i++) {
			if(map.containsKey(chs[i])) {
				map.put(chs[i], map.get(chs[i])+1);
			}else  {
				map.put(chs[i], 1);
			}
		}
		//通过迭代key来遍历map
/*		Set<Character> keySet = map.keySet();
		for(Iterator<Character> i = keySet.iterator();i.hasNext();) {
			Character c = i.next();
			Integer n = map.get(c);
			System.out.println(c+"="+n);
		}*/
		//通过迭代entry遍历map
		Set<Entry<Character,Integer>> entry = map.entrySet();
		for(Entry<Character,Integer> e : entry) {
			Character key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+"="+value);
		}
	}
}
