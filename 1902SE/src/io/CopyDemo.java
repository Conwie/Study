package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * 缓冲流是u以对高级流，在流连接中起到加速读写效率的作用。
 * @author soft01
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("111.doc");
		FileOutputStream fos = new FileOutputStream("111_copy2.doc");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		long start = System.currentTimeMillis();
		while((len = bis.read())!=-1) {
			bos.write(len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
		bis.close();
		bos.close();
	}

}
