package string;

public class Demo09 {

	public static void main(String[] args) {
		/*
		 * StringBuilder
		 * 可变字符串，其方法可以修改StringBuilder中
		 * 字符数组的内容。因为没有赋值新字符数组
		 * 相对于String API其操作性能好
		 */
		//创建StringBuilder对象时候，会自动在内部创建一个16个元素的char数组
		StringBuilder buf = new StringBuilder();
		buf.append("刘苍松");
		buf.append("今天下午");
		//当超过16个元素时候会自动扩容至(16*2+2)个元素，超过34个元素后扩容+1
//		buf.append("6666666666666666666666666666");
		buf.insert(3,"老师");//在第三个元素后加入指定字符串
		System.out.println(buf);
		buf.delete(3,3+2);//在第三个元素后开始删除字符，3+删除的长度
		System.out.println(buf);
		buf.replace(0,0+3, "范传奇"); //在第一个元素的位置开始，替换3个长度的元素，替换的字符串长度不够则用空字符替换
		System.out.println(buf);
	}

}
