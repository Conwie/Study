package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流读取文本数据
 * @author soft01
 *
 */
public class ISRDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		//一次读取一组字符
/*		char[] chs = new char[18];
		isr.read(chs);
		String str = new String(chs);
		System.out.println(chs);*/
		//一次读取一个字符
		int len = -1;
		while((len = isr.read())!=-1) {
			System.out.print((char)len);
		}
		isr.close();
	}

}
