package file;

import java.io.File;
import java.util.Arrays;

/**
 * 获取一个目录中的所有内容
 * @author soft01
 *
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		/*
		 * 获取当前目录下的所有内容
		 */
		File dir = new File(".");
		if(dir.isDirectory()) {
			File[] subs = dir.listFiles();
			System.out.println(subs.length);
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
		
	}

}
