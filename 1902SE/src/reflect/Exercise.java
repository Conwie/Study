package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Exercise {
	public static void main(String[] args) throws Exception{
		Class cls = Class.forName("reflect.Person");
//		Object o = cls.newInstance();
//			Constructor[] constructors = cls.getDeclaredConstructors();
//			for(Constructor c : constructors) {
//				System.out.println(c);
//			}
		Constructor c = cls.getDeclaredConstructor(String.class);
		Object o = c.newInstance("小白");
//		Method[] methods = cls.getDeclaredMethods();
//		for(Method m : methods) {
//			System.out.println(m);
//		}
//		Method method = cls.getDeclaredMethod("sayHi");
//		method.invoke(o);
//		Method method = cls.getDeclaredMethod("dosome");
//		method.setAccessible(true);
//		method.invoke(o);
//		Method method = cls.getDeclaredMethod("say", String.class,int.class);
//		method.invoke(o, "张无忌",18);
		System.out.println(o);
	}
}
