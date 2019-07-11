package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 块写文本数据，加快写出效率
 * 
 * 具有自动行刷新的缓冲字符输出流：
 *java.io.PrintWriter
 * @author soft01
 *
 */
public class PWDemo1 {

	public static void main(String[] args) throws IOException{
			
		/*
		 * 向pw.txt文件中写出数据
		 * PW提供流直接对文件写操作的构造方法：
		 * PrintWriter(String path)
		 * PrintWriter(FIle file)
		 * 
		 * 也可以传入String类型的字符集编码
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		
		pw.println("我可以接受你的所有，所有小脾气。");
		pw.println("我可以带你去吃很多，很多好东西。");
		
		System.out.println("写出完毕。");
		pw.close();

	}

}
