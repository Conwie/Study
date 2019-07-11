package file;

import java.io.File;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * File API 可以创建“系列文件夹”
		 * 将目标路径上的系列文件夹都创建出来
		 * file.mkdirs()
		 */
		File file = new File("./demo/a/b/c/d");
		boolean b = file.mkdirs();
		System.out.println(b);
	}

}
