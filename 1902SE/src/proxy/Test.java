package proxy;

public class Test {
	public static void main(String[] args) {
/*		Function target = new Me();
		Function proxy = new BuyerProxy(target,10);
		proxy.buyFlower();*/
		UserService target = new UserServiceImpl();
		
		BeanProxy bp = new BeanProxy(target);
		UserService proxy = (UserService) bp.getBeanProxy();
		proxy.addUser();
		proxy.deleteUser();
		proxy.modifyUser();
	}
}
