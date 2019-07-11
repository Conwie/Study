package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 文件的复制
 * @author soft01
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("./111.doc", "r");
		RandomAccessFile desc = new RandomAccessFile("./111_copy.doc", "rw");
		//记录每次从原文件读取到的字节
		long start = System.currentTimeMillis();
		int d = -1;
		while((d=src.read())!=-1) {
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println("复制完毕！");
		src.close();
		desc.close();
	}

}
