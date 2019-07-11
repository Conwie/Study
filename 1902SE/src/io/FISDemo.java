package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 从文件中读取字节
 * @author soft01
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] buf = new byte[100];
		int len = fis.read(buf);
		String str = new String(buf,0,len,"UTF-8");
		System.out.println(str);
	}

}
