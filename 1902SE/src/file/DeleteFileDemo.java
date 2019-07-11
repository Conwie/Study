package file;

import java.io.File;

/**
 * 删除一个文件
 * @author soft01
 *
 */
public class DeleteFileDemo {

	public static void main(String[] args) {
		/*
		 * 删除当前目录下的demo.txt文件
		 */
		File file = new File("./demo.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("文件已删除！");
		}else {
			System.out.println("文件不存在");
		}
	}

}
