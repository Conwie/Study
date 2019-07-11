package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import jdk.internal.util.xml.impl.Input;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 块读操作，并且可以按行读取字符串
 * @author soft01
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("src/io/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		/*
		 * BufferedReader提供的方法：
		 * String readLine()
		 * 该方法用来读取一行字符串，但是该行最后的换行符
		 * 不包含在内。
		 * 若返回值为null时表示流读取到了末尾。
		 */
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}
