package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流来完成对文件的复制操作
 * 思路：
 * 使用文件输入流来读取原文件，使用文件输出流向复制
 * 文件中写出。
 * 循环顺序从原文件读取字节写入到复制文件中完成复制
 * 
 * 这里使用块读写形式复制。由于读写方法一样，可参考
 * 使用RAF复制操作的案例
 * @author soft01
 *
 */
public class Test {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_copy2.txt");
		byte[] buf = new byte[100];
		int len = -1;
		while((len = fis.read(buf))!=-1) {
			fos.write(buf,0,len);
		}
		System.out.println("复制完毕！");
		fis.close();
		fos.close();
	}

}
