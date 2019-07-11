package file;

import java.io.File;
import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) throws IOException {
		/*
		 * 创建文件时候，如果所在文件夹
		 * 不存在，则抛出异常
		 */
		File file = new File("/home/soft01/demo/abc/t.txt");
		file.createNewFile();
	}

}
