package string;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo08 {

	public static void main(String[] args) {
		/*
		 * 检测一个字符串是否以指定字符串开头或结尾
		 */
		String str = "Let's do it!";
		Boolean b = str.startsWith("Let's");
		System.out.println(b);//true
		b = str.startsWith("");
		System.out.println(b);//true
		b = str.startsWith("Let's do it!");
		System.out.println(b);//true
		Boolean e = str.endsWith("it!");
		System.out.println(e);//true
		e = str.endsWith("");
		System.out.println(e);//true
		e = str.endsWith("Let's do it!");
		System.out.println(e);//true
	}

}
