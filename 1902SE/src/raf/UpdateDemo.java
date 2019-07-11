package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改用户昵称
 * 
 * 程序启动后要求用户输入用户名以及新的昵称
 * 然后将user.dat文件中该用户的昵称更改
 * 若suer.dat文件没有此用户则最终显示:查无此人
 * @author soft01
 *
 */
public class UpdateDemo{

	public static void main(String[] args)  throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String checkName = sc.nextLine();
		System.out.println("请输入新昵称：");
		String newNickname = sc.nextLine();
		
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		//标识昵称是否有改过
		boolean update = false;
		for(int i=0;i<raf.length()/100;i++) {
			//先将指针移动到每条记录开始位置
			raf.seek(100*i);
			//读取用户名
			byte[] b = new byte[32];
			raf.read(b);
			String name = new String(b,"UTF-8").trim();
			if(name.equals(checkName)) {
				//是该用户名
				System.out.println("找到"+name);
				//将指针移动到昵称位置
				raf.read(b);//raf.seek(i*100+64)
				b = newNickname.getBytes();
				b = Arrays.copyOf(b, 32);
				raf.write(b);
				update = true;
				break;
			}
		}
		if(!update) {
			System.out.println("查无此人！");
		}
		raf.close();
		
	}

}
