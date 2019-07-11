package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 * @author soft01
 *
 */
public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 实际开发中我们在指定路径时通常使用相对路径。
		 * 相对路径有更好的跨平台性，
		 * “.”：表示当前目录，当前目录具体指哪里要看当
		 * 前程序的运行环境而定，比如在eclipse中运行
		 * 当前程序时，当前目录指的就是当前程序所在的
		 * 项目目录。
		 */
		File file = new File("./demo.txt");
		/*
		 * exists()用来判断当前File表示的文件或目录是否真实存在
		 */
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("文件已创建");
		}else {
			System.out.println("文件已存在！");
		}
	}

}
