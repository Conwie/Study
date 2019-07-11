package demo;

import java.util.Arrays;

import net.sourceforge.pinyin4j.PinyinHelper;

public class PinYinDemo {

	public static void main(String[] args) {
		String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray('我');
		System.out.println(Arrays.toString(pinyinArray));
	}

}
