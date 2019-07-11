package file;

import java.io.File;

/**
 * 删除一个目录
 * @author soft01
 *
 */
public class DeleteDirDemo {

	public static void main(String[] args) {
		//删除./demo/a/b/c/d目录
		File dir = new File("./demo");
		if(dir.exists()) {
			/*
			 * 删除目录时有一个前提条件，就是这个目录
			 * 必须是一个空目录，否则无法删除
			 */
			dir.delete();
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	}

}
