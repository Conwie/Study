package file;

import java.io.File;

/**
 * 完成方法，实现将给定的File表示的文件或目录删除
 * @author soft01
 *
 */
//一共20块钱  汽水瓶  瓶盖
public class Test {
	static int all = 20;
	static int sum = 0;
	public static void main(String[] args) {
		File dir = new File("./demo");
		delete(dir);
		add(0);
		System.out.println(sum);
		coco(20,0,0);
		System.out.println(all);
	}
	
	public static void delete(File file) {
		/*
		 * 如果file表示的是文件则可以直接删除
		 * 如果是一个目录，需要县获取其所有子项，
		 * 并将所有子项全部删除才可以删除这个目录。
		 */
/*		if(file.isDirectory()) {
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				if(sub.isDirectory()) {//如果目录里还有目录
					delete(sub);//继续往下找
					sub.delete();//删除空目录
					System.out.println(sub.getName()+"删除成功");
				}else {//不是目录则删除文件
					sub.delete();
					System.out.println(sub.getName()+"删除成功");
				}
			}
		}*/
/*		if(file.isDirectory()) {
			//先将该目录中所有子项清空
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				
				 * 递归调用
				 * 在当前方法内部继续调用本方法的现象称为递归调用。
				 * 递归尽量避免使用，层级越多开销越大，执行效率较慢。
				 * 若需使用递归，必须注意两点：
				 * 1：尽量避免层级太多
				 * 2：递归调用必须被一个分支控制不能必定调用，否则是死循环
				 
				delete(sub);//继续往下找
			}
		}
		file.delete();*/
	}
	

//	 * 1：编写一段代码，完成1+2+3+4+...100;并输出结果
//	 * 	在代码中不得出现for,while关键字
		public static void add(int num) {
	if(num<100) {
		add(++num);
		sum+=num;
	}
}
//		 * 2：1块钱1瓶汽水，2个空瓶可以换1瓶汽水，3个瓶盖可以换1瓶汽水
//		 * 	编写程序计算20块钱最终可以得到多少瓶汽水？
		static void coco(int money,int battle,int cap) {
			if(money>=0) {
				if(battle%2==0 && battle!=0) {
					money++;
					all++;
					battle = 0;
				}
				if(cap%3==0 && cap!=0) {
					money++;
					all++;
					cap = 0;
				}
				System.out.println("钱："+money+", "+"空瓶子："+battle+", "+"瓶盖："+cap);
				coco(--money,++battle,++cap);
			}
		}
}
