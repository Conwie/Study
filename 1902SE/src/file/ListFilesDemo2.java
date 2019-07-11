package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中满足指定条件的子项
 * @author soft01
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		File dir = new File(".");
		//文件过滤器，用于定义一个File的过滤规则
		FileFilter filter = new FileFilter() {
			/*
			 * 当参数file符合过滤要求时，当前accept方法
			 * 应当返回true
			 */
			public boolean accept(File file) {
				String name = file.getName();
				return name.startsWith(".");
			}
		};
		/*
		 * 该方法会将目录中所有子项获取到，并顺序调用
		 * 给定的过滤器的accept方法，然后将所有返回
		 * 值为true的子项保留并最终返回。
		 */
		File[] subs = dir.listFiles(filter);
		
/*		File[] subs = dir.listFiles(
				(file)->{return file.getName().startsWith(".");});*/
		
		System.out.println(subs.length);
		for(int i=0;i<subs.length;i++) {
			File sub = subs[i];
			System.out.println(sub.getName());
		}
	}

}
