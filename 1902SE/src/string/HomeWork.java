package string;

public class HomeWork {
	public static void main(String[] args) {
		//获取一个字符串中最后一个"/"后的字符序列
		String s = "someapp/manager/emplist.action";
		int endIndex = s.lastIndexOf("/");
		String lastString = s.substring(endIndex+1);
		System.out.println(lastString);
		//检查一个字符串是否为回文
		String str = "able was i ere i saw elba";
		int n = 0;
		char[] chs = str.toCharArray();
		for(int i=0;i<chs.length/2;i++) {
			if(chs[i]==chs[chs.length-i-1]) {
				n++;
			}
		}
		if(n==chs.length/2) {
			System.out.println("是回文");
		}else {
			System.out.println("不是");
		}

	}
	

}
