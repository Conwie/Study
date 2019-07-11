package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 * @author soft01
 *
 */
public class RAFDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./test.dat", "r");
		/**
		 * int read()
		 * 读取1个字节并以int形式返回。
		 * 若返回的整数为-1，则表示读取到了文件末尾。
		 */
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
	}

}
