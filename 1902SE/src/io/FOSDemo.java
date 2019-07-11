package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * javaIO		标准的输入与输出
 * java以统一的标准的读写形式定义了一套API，称为“流”
 * 使用流可以读写人以设备（网络，文件，键盘，控制台等）
 * 
 * java将流按照功能以方向的形式分为两类：
 * 输入流：input，是外界到我们写的程序的方向，使用输入
 * 			流用于从外界获取数据，是读操作。
 * 输出流：output,用于将数据发送至外界，是写操作。
 * 
 * java将流划分为节点流与处理流
 * 节点流：又称为低级流“，是真实连接程序与数据源的”管道“，
 * 			负责实际搬运数据的流。
 * 			读写一定是建立在低级流基础上进行的。
 * 处理流：又称“高级流”，高级流不能独立存在，必须连接在
 * 			其他流上，目的是当数据流经当前高级流时对数据
 * 			做某些加工处理，简化我们对数据的该操作。
 * 
 * 串联一组高级流并最终连接在低级流上，在读写操作的过程
 * 中对数据进行一系列流水线式的加工处理，这种读写操作称
 * 为：流的连接。
 * 流连接也是IO的精髓所在。
 * 
 * 文件流
 * 文件流是一对低级流，作用是读写文件数据
 * 在功能上它们与RandomAccessFile一致但是RAF是基于
 * 指针的读写，特点是可以对任意文件读或写，并且能做到
 * 对文件数据编辑操作，读写灵活
 * 
 * 文件流是基于java IO的流式读写，而流式读写是一种顺序
 * 读写形式，只能顺序向后读或写，不能回退。但是基于流连接，
 * 串联高级流可以将复杂数据读写操作简单化。
 * @author soft01
 *
 */
public class FOSDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 对fos.txt文件写操作
		 * 
		 * 构造方法：
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * 以上两种创建方式创建的文件输出流是覆盖写操作。
		 *即：若指定的文件已经存在，会先将该文件数据删除。
		 *然后通过当前流写出的内容作为该文件数据保存。
		 *
		 *如果在构造方法中再传入第二个参数，是一个boolean
		 *值，该值为true时，文件输出流为追加模式，即：原有
		 *数据都保留，通过当前流写出的内容会被追加到文件后面。
		 *
		 *文件输出流不支持修改部分数据的操作。比如之前用RAF做
		 *的修改用户昵称操作，文件流做不到。
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str = "来了老弟～";
		fos.write(str.getBytes("UTF-8"));
		System.out.println("写出完毕！");
		fos.close();
	}

}
