package string;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * 从后向前查找lastIndexOf()
		 * 返回起始字符的序号，如果找不到返回-1
		 */
		String url = "http://www.baidu.com/index.html";
		int index = url.lastIndexOf(".com");//返回'.'的位置
		System.out.println(index);//16
		index = url.lastIndexOf(".cn");
		System.out.println(index);//-1
		
		System.out.println(getFileName(url));
	}
	/**
	 * 解析URL，将查询的文件名截取出来
	 */
	public static String getFileName(String url) {
		int lastIndex = url.lastIndexOf("/");
		String fileName = url.substring(lastIndex+1);
		return fileName;
	}
}
