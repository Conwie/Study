package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射调用方法
 * @author soft01
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person p = new Person();
		p.sayHello();
		
		/*
		 * 利用反射机制
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要实例化的类的名字：");
		String classname = sc.nextLine();
		Class cls = Class.forName(classname);
		Object obj = cls.newInstance();
		
		System.out.println("请输入你要执行的方法的名字：");
		String methodName = sc.nextLine();
		Method method = cls.getDeclaredMethod(methodName);
		method.invoke(obj);
		
	}
}
