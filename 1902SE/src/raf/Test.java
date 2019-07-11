package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 实现一个简易记事本工具
 * 程序启动后，要求用户输入一个文件名，然后创建一个
 * RAF对该文件进行读写操作，
 * 
 * 之后用户在控制台输入的每一行字符串都写入到这个文件中（写入文件的内容不考虑换行问题）。
 * 当用户输入exit时，程序退出。
 * @author soft01
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String fileName = sc.nextLine();
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
		System.out.println("请开始输入内容：");
		String input;
		 while(true){
			input = sc.nextLine();
			if("exit".equals(input)) {
				break;
			}
			byte[] data = input.getBytes();
			raf.write(data);
		}
		 System.out.println("退出成功！");
		 raf.close();
	}
	

}
