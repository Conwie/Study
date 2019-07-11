package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ShowAllUserDemo {

	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		//for(int i=0;i<raf.length/100;i++)
		while(raf.getFilePointer()<raf.length()) {
			byte[] b = new byte[32];
			raf.read(b);
			String name = new String(b,"UTF-8").trim();
			
			raf.read(b);
			String pwd = new String(b,"UTF-8").trim();
			
			raf.read(b);
			String nickname = new String(b,"UTF-8").trim();
			
			int age = raf.readInt();
			System.out.println(name+","+pwd+","+nickname+","+age);
			}
		raf.close();
	}

}
