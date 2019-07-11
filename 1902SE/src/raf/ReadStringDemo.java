package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 读取文本数据
 * @author soft01
 *
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		/**
		 * RandomAccessFIle提供的方法：
		 * long length()
		 * 获取当前RAF操作的文件的长度（单位是字节）
		 */
		byte[] data = new byte[(int) raf.length()];
		System.out.println(Arrays.toString(data));
		//将文件中所有字节一次性读取出来
		raf.read(data);
		System.out.println(Arrays.toString(data));
		//将给定的字节数组按照指定的字符集还原为字符串
		String str = new String(data,"UTF-8");
		System.out.println(str);
		
		raf.close();
	}

}
