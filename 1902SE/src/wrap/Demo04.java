package wrap;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 提取商品价格
		 * 计算商品总价
		 */
		String str = "1, 大黄蜂, 500, 1.28, 北京";
		String[] s = str.split(",\\s");
		double price = Double.parseDouble(s[3]);
		System.out.println(price);//1.28
		int num = Integer.parseInt(s[2]);
		double total = price*num;
		System.out.println(total);
	}
	
}
