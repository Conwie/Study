package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流，在流连接中负责对java中任何
 * 对象进行读写（可以将对象与一组字节间转换。）
 * @author soft01
 *
 */
public class OOSDemo {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 将一个Person实例写入文件person.obj中
		 */
		String name = "张无忌";
		int age = 18;
		String gender = "男";
		String[] otherInfo = {"九阳神功","乾坤大挪移","赵敏","武当","明教"};
		Person p = new Person(name, age, gender, otherInfo);
		FileOutputStream fos = new FileOutputStream("person1.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		/*
		 * 对象输出流写对象的方法：
		 * void writeObject(object obj)
		 * 将给定对象按照其结构转换为一组字节后写出
		 * 
		 * 涉及到的术语：
		 * 当对象经过OOS写出时，其将该对象按照结构转换
		 * 为了一组字节，这个过程称为“对象序列化”
		 * 
		 * 当序列化的这组字节再经过FOS写入到文件中（写
		 * 入到磁盘做长久保存）这个过程称为“数据持久化”
		 */
		oos.writeObject(p);
		System.out.println("写出完毕！");
		oos.close();
	}

}
