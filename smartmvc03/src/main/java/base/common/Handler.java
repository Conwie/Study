package base.common;

import java.lang.reflect.Method;

public class Handler {
	private Method mh;
	private Object obj;
	
	public Handler(Method mh, Object obj) {
		super();
		this.mh = mh;
		this.obj = obj;
	}
	public Method getMh() {
		return mh;
	}
	public Object getObj() {
		return obj;
	}
	public void setMh(Method mh) {
		this.mh = mh;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}
