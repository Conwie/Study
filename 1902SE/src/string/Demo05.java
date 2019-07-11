package string;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 截取子字符串
		 */
		String url = "http://baidu.com/index.html";
		//用法1：按照范围截取
		//截取主机地址:从7开始截取到16(不包含)
		String host = url.substring(7, 16);
		System.out.println(host);//baidu.com
		//用法2按照长度截取
		//从7开始连续截取5个字符
		host = url.substring(7, 7+9);
		System.out.println(host);//baidu.com
		//从17开始截取剩余所有字符
		String query = url.substring(17);
		System.out.println(query);
		
		//方法测试
		Scanner sc = new Scanner(System.in);
		url = sc.nextLine();
		System.out.println(getHost(url));

	}
	/**
	 * 实现一个方法，输入任意url地址，返回其中的主机名
	 */
	public static String getHost(String url) {
		int index = url.indexOf("/",7);
		String host = url.substring(7, index);
		return host;
	}

}
