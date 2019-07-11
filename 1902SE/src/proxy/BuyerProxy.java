package proxy;

public class BuyerProxy implements Function{
	private Function target;
	private int money;
	public BuyerProxy() {
		
	}
	public BuyerProxy(Function target,int money) {
		this.target = target;
		this.money = money;
	}
	public void buyFlower() {
		if(money==10) {
			System.out.println("找到朋友帮我买花");
			this.target.buyFlower();
		}else {
			System.out.println("先支付跑腿费！");
		}
		
		
	}

}
