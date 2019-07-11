package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流读写效率之所以高是因为数据在经过它时，一定
 * 会被转化为块读写。
 * 
 * 缓冲输出流写出数据要注意缓冲区。
 * @author soft01
 *
 */
public class Bos_flush {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "回首掏～";
		bos.write(str.getBytes("UTF-8"));
		/*
		 * void flush()
		 * 强制将缓冲流中缓冲区里已缓存的数据一次性写出。
		 */
		bos.flush();
		System.out.println("写出完毕");
		bos.close();
	}

}
