package homework;

public class RegExUtils {
	//身份证：15或18位数字
	public static final String IDENTITY_CARD = "^\\d{15}|\\d{18}$";
	//邮政编码：不以0开头，6位数字
	public static final String ZIP_CODE = "^[1-9][0-9]{5}$";
	//手机号码：13或158或159开头  11位
	public static final String PHONE_NUM = "^(13\\d{9})|(15[89]\\d{8})$";
	//邮箱：
	public static final String EMAIL = "^[a-zA-Z0-9_.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
	
	public static boolean check(String regex,String input) {
		return input.matches(regex);
	}
	
	public static boolean checkIdentityCard(String input){
		return check(IDENTITY_CARD,input);
	}
	public static boolean checkZipCode(String input){
		return check(ZIP_CODE,input);
	}
	public static boolean checkPhoneNum(String input){
		return check(PHONE_NUM,input);
	}
	public static boolean checkEmail(String input) {
		return check(EMAIL,input);
	}
}
