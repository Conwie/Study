package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 程序启动后要求用户输入：用户名，密码，昵称，年龄
 * 其中年龄是int值，其他为字符串
 * 然后将该用户信息写入到user.dat文件保存
 * 
 * 每条记录占用100字节，其中用户名，密码、昵称为字符串
 * 各占32字节，年龄为int值是固定的4字节
 * 
 * 字符串实际占用的字节取决与字符数，通常写文件可以故意
 * “留白”使得字符串占用的字节量固定，这样利于读取也利于
 * 修改，缺点是留白会浪费硬盘空间。
 * @author soft01
 *
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String pwd = sc.nextLine();
		System.out.println("请输入昵称：");
		String nickname = sc.nextLine();
		System.out.println("请输入年龄：");
		int age = Integer.parseInt(sc.nextLine());
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length());
		//写用户名
		byte[] data = name.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);//扩容到32字节
		//将32字节一次性写出
		raf.write(data);
		
		//写密码
		data = pwd.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写年龄
		raf.writeInt(age);
		
		System.out.println(raf.getFilePointer());
		
		
	}

}
