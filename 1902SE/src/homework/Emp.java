package homework;

public class Emp {
	String name;
	int age;
	char sex;
	double salary;
	public Emp(String name,int age,char sex,double salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	public String toString() {
		return "["+name+","+age+","+sex+","+salary+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		if(obj instanceof Emp) {
			Emp e = (Emp) obj;
			return e.name.equals(this.name);
		}else {
			return false;
		}
	}
}
