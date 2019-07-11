package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据以及RAF基于指针的操作
 * @author soft01
 *
 */
public class RafDemo3 {

	public static void main(String[] args) throws IOException {
		 RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		 //获取当前RAF的指针位置，默认在文件最开始
		 long pos = raf.getFilePointer();
		 System.out.println("pos:"+pos);
		 //向文件中写入一个int最大值
		 int max = Integer.MAX_VALUE;
		 raf.write(max>>>24);
		 System.out.println("pos:"+raf.getFilePointer());
		 raf.write(max>>>16);
		 raf.write(max>>>8);
		 raf.write(max);
		 System.out.println("pos:"+raf.getFilePointer());
		 /**
		  * RAF提供了方便写出基本类型的方法
		  */
		 //连续写4个字节，将int值对应2进制写入文件
		 raf.writeInt(max);
		 System.out.println("pos:"+raf.getFilePointer());
		 //连续写8个字节，将long值对应2进制写入文件
		 raf.writeLong(123L);
		 System.out.println("pos:"+raf.getFilePointer());
		 //...
		 raf.writeDouble(123.123);
		 System.out.println("pos:"+raf.getFilePointer());

		 System.out.println("写出完毕！");
		 //将指针移动到文件开始
		 raf.seek(0);
		 System.out.println("pos:"+raf.getFilePointer());
		 /*
		  * int readInt()
		  * 连续读取4个字节，将int值读取回来
		  */
		 int d = raf.readInt();
		 System.out.println(d);
		 System.out.println("pos:"+raf.getFilePointer());
		 
		 //读取long值
		 raf.seek(8);
		 long l = raf.readLong();
		 System.out.println(l);
		 System.out.println("pos:"+raf.getFilePointer());
		 
		 //读取double值
		 double db = raf.readDouble();
		 System.out.println(db);
		 System.out.println("pos:"+raf.getFilePointer());

		 
		 //修改long值为256
		 //1移动到long值所在的位置
		 raf.seek(8);
		 //2重新写8字节将原数据覆盖
		 raf.writeLong(256);
		 
		 
		 raf.seek(8);
		 l = raf.readLong();
		 System.out.println(l);
		 
		 raf.writeDouble(168.888);
		 raf.seek(16);
		 db = raf.readDouble();
		 System.out.println(db);
		 
		 raf.close();
	}

}
