package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 完成简易记事本工具
 * 使用PrintWriter并自行使用流连接形式创建。
 * 
 * 首先输入一个文件名，然后对该文件操作，之后每输入的
 * 一行字符串都按行写入到该文件中，当输入"exit"时，
 * 程序退出。
 * @author soft01
 *
 */
public class Test2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String fileName = sc.nextLine();
		PrintWriter pw = new PrintWriter
				(new BufferedWriter
						(new OutputStreamWriter
								(new FileOutputStream(fileName,true),"UTF-8")));
		System.out.println("请输入文字：");
		while(true) {
			String input = sc.nextLine();
			if("exit".equals(input.toLowerCase())) {
				System.out.println("退出成功！");
				break;
			}
				pw.println(input);
		}
		pw.close();
	}

}
