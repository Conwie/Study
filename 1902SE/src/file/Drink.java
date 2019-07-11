package file;
//* 2：1块钱1瓶汽水，2个空瓶可以换1瓶汽水，3个瓶盖可以换1瓶汽水
//* 	编写程序计算20块钱最终可以得到多少瓶汽水？
public class Drink {
	static int all = 20;//库存
	static int battle;//空瓶
	static int hat;//瓶盖
	static int drinking = 0;
	public static void main(String[] args) {
		drink();
	}
	static void drink() {
		all--;
		battle++;
		hat++;
		drinking++;
		if(all>=0) {
			if(battle==2) {
				all++;
				battle = 0;
			}
			if(hat==3) {
				all++;
				hat = 0;
			}
			System.out.println("瓶数:"+all+",battle:"+battle+",hat:"+hat+",drinking:"+drinking);
			drink();
		}
	}
}
