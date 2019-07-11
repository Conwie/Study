package exception;

import java.awt.AWTException;
import java.io.IOException;
/**
 * 子类重写父类含有throws声明异常抛出的方法时对该方法的重写规则
 * @author soft01
 *
 */
public class ThrowsDemo {

	public void dosome() throws IOException,AWTException{
		
	}

}

class Son extends ThrowsDemo{
	//允许仅抛出部分异常
//	public void dosome() throws IOException{
//		
//	}
	
	//允许抛出父类方法异常的子类型异常
//	public void dosome() throws FileNotFoundException{
//		
//	}
	
	//允许不抛出异常
//	public void dosome() {
//		
//	}
	
	//不允许抛出额外异常
//	public void dosome() throws SQLException{
//		
//	}
	
	//不允许抛出父类方法抛出异常的父类型异常
//	public void dosome() throws Exception{
//		
//	}

}