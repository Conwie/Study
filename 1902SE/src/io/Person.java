package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 * 
 * 一个类若希望被对象流读写，那么这个类必须要
 * 实现接口：Serializable
 * @author soft01
 *
 */
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * 当一个属性使用transient修饰后，那么进行序列化
	 * 时这个值会被忽略，忽略不必要的属性可以达到对象
	 * 序列化瘦身操作，减少不必要的资源开销。
	 */
	private transient String[] otherInfo;
	public Person(String name, int age, String gender, String[] otherInfo) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String toString() {
		return name+","+age+","+gender+","+Arrays.toString(otherInfo);
	}
}
