package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * java.util.Map 查找表
 * Map体现的样子是一个多行两列的表格，其中左列称为Key
 * 右列称为value.
 * Map总是根据key来获取对应的value，所以可以将查询条
 * 件作为key，将查找的内容作为value保存，以便后期获取。
 * 
 * 常用实现类：java.util.HashMap 散列表  哈希表
 * 				  java.util.TreeMap 二叉树实现的Map
 * 散列表是当今查询速度最快的数据结构。
 * @author soft01
 * 
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		/*
		 * V put(K k,V v)
		 * 将给定的key-value对保存到Map中
		 * Map有一个要求：Key不允许重复（equals比较）
		 * 若使用Map中已经存在的Key存放一个Value，
		 * 则是替换Value操作，那么put方法的返回值就是
		 * 被替换的Value.若给定的Key当前Map中不存在，
		 * 则返回值为null.
		 */
		map.put("语文", 98);
		map.put("数学", 99);
		map.put("英语", 97);
		map.put("化学", 98);
		map.put("物理", 99);
		System.out.println(map);
		//替换value
		Integer value = map.put("语文", 88);
		System.out.println(value);
		System.out.println(map);
		/*
		 * V get(Object key)
		 * 根据给定的key获取对应value
		 * 若给定的key在Map中不存在，则返回值为null
		 */
		value = map.get("英语");
		System.out.println(value);
		
		value = map.get("体育");
		System.out.println(value);
		
		int size = map.size();
		System.out.println("size:"+size);
		
		boolean isEmpty = map.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		
		/*
		 * V remove(Object key)
		 * 删除给定key所对应的这组键值对，返回值为
		 * 该key对应的value
		 */
		value = map.remove("化学");
		System.out.println(map);
		System.out.println(value);
		
		boolean ck = map.containsKey("数学");
		System.out.println("包含key:"+ck);
		
		boolean cv = map.containsValue(88);
		System.out.println("包含value:"+cv);
		
	}
}
