package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据量，减少实际读写的次数，可以提高读写的效率。
 * 单字节读写通常称为：随即读写
 * 一组一组字节读写通常称为：块读写
 * @author soft01
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * RAF提供了块读写数据的方法
		 * int read(byte[] data)
		 * 一次性读取给定字节数组总长度的字节量，
		 * 返回值为实际读取到的字节量，若返回值为
		 * -1则表示文件末尾（本次没有读取到任何数据）
		 * 
		 * void write(byte[] data)
		 * 一次性将给定的字节数组中所有字节写入到文件中
		 * 
		 * void write(byte[] data,int offset,int len)
		 * 将给定字节数组从下标offset处的连续len个字节一次性写入文件
		 */
		RandomAccessFile src = new RandomAccessFile("./111.doc", "r");
		RandomAccessFile desc = new RandomAccessFile("./111_copy.doc", "rw");
		
		//记录每次实际读取到的字节量
		int len = -1;
		//10K
		byte[] b = new byte[1024*10];
		long start = System.currentTimeMillis();
		while((len = src.read(b))!=-1) {
			desc.write(b, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println("复制完毕！");
		src.close();
		desc.close();
	}

}
