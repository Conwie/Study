package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PW
 * @author soft01
 *
 */
public class PWDemo2 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("让蜡烛代替所有灯，让音乐代替话语声。");
		pw.println("此时无声胜有声～");
		System.out.println("写出完毕！");
		pw.close();
		System.out.println();
	}

}
