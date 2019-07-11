package string;

public class Demo11 {

	public static void main(String[] args) {
		/**
		 * StringBuilder的用途
		 * 1.Java中动态字符串连接，是自动利用StringBuilder完成的。
		 *    2.在一行上使用字符串连接会使用同一个StringBuilder对象。
		 *    3.如果进行大量的字符串操作，请使用一个StringBuilder对象实现字符串连接
		 *    提高字符串连接性能。
		 * 4.StringBuffer与StringBuilder
		 * 	API方法完全一样，内部结构完全一样
		 * StringBuffer 是线程安全的API,方法加锁了
		 * 	StringBuffer 早 慢
		 *  StringBuilder 新  快
		 */
		String s1 = "您好";
		String s2 = "Java";
		String s3 = s1+s2;
		//s3 = new StringBuilder(s1).append(s2).toString();
		String s4 = s1+s2+5+8;
		//s4 = new StringBuilder(s1).append(s2).append(5).append(8).toString();
		
		//案例：将一个数组连接为一个字符串
		int[] arr = {4,1,10,3,7,9,56};
		StringBuilder s = new StringBuilder();
		s.append("["+arr[0]);
		for(int i=1;i<arr.length;i++) {
			s.append(", ");
			s.append(arr[i]);
		}
		s.append("]");
		s.toString();
		System.out.println(s);
	  arr = new int[100000];//10w个0
	  System.out.println(stringBuilderTest(arr));
	  System.out.println(stringBufferTest(arr));
		System.out.println(stringTest(arr));
	}
	
	//将数组连接为一个字符串
	//动态字符串连接会不断产生新的StringBuilder对象
	//计算性能差
	public static long stringTest(int[] arr) {
		long start = System.currentTimeMillis();
		String str = "["+arr[0];//创建了一个StringBuilder对象
		for(int i=1;i<arr.length;i++) {
			str+=", "+arr[i];//创建了n个StringBuilder对象
		}
		str+="]";//创建了一个StringBuilder对象
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	//只创建了一个StringBuilder对象
	public static long stringBuilderTest(int[] arr) {
		long start = System.currentTimeMillis();
		StringBuilder s = new StringBuilder("[").append(arr[0]);
		for(int i=1;i<arr.length;i++) {
			s.append(", ").append(arr[i]);
		}
		s.append("]");
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long stringBufferTest(int[] arr) {
		long start = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("[").append(arr[0]);
		for(int i=1;i<arr.length;i++) {
			s.append(", ").append(arr[i]);
		}
		s.append("]");
		long end = System.currentTimeMillis();
		return end-start;
	}
}
