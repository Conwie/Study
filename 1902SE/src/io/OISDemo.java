package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 * @author soft01
 *
 */
public class OISDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//从person.obj文件中反序列化java对象
		FileInputStream fis = new FileInputStream("person1.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		System.out.println(p.toString());
		ois.close();
	}

}
