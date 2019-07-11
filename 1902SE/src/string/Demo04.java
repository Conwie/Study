package string;
/**
 * indexOf的用法
 * @author soft01
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 从前往后查找指定的字符串、字符
		 * 找到就返回首位置，找不到返回-1
		 */
		String str = "今天晚上打不打游戏？不打";
		int index = str.indexOf("不打");
		System.out.println(index);//5
		index = str.indexOf("不打",6);
		System.out.println(index);//10
		index = str.indexOf('打');
		System.out.println(index);//4
		index = str.indexOf('哦');
		System.out.println(index);//-1

	}

}
