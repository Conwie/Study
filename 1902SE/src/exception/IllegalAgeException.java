package exception;
/**
 * 自定义异常
 * 通常我们使用自定义异常来定义业务逻辑问题
 * 
 * 年龄不合法异常
 * 当年龄范围在0-100之外时会抛出该异常
 * @author soft01
 *
 */
public class IllegalAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}
