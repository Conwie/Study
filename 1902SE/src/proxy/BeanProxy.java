package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BeanProxy {
	Object target;
	LogUtil logger = new LogUtil();
	public BeanProxy(Object target) {
		this.target = target;
	}
	
	public Object getBeanProxy() {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new MyInvocationHandler());
	}
	
	private class MyInvocationHandler implements InvocationHandler{

		
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			logger.loginfo(method.getName()+"-> start");
			Object result = method.invoke(target, args);
			logger.loginfo(method.getName()+"-> end");
			return result;
		}
		
	}
}
