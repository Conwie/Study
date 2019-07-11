package obj;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * Object equals方法
		 * equals相等
		 * 
		 * 引子：==和equals
		 * ==用于比较值是否相等
		 * 1.基本类型，就是比较基本类型值是否相等
		 * 2.引用类型，比较引用的值（地址值）是否相等，地址值一样则true
		 * 3.==只能比较两个引用是否引用了同一个对象，
		 * 不能比较两个对象的内容（属性）是否相等。
		 * 
		 * Java在Object类为全部对象定义了equals方法
		 * 用于解决判断对象内容(属性)是否相等问题，
		 * 简称：判断对象是否相等
		 * 
		 * 1.equals方法用于比较对象是否相等
		  * 2.默认的equals方法，其内容就是"=="，与==规则一致
		 * 3.Java建议在子类中重写，修改为
		 * 按照对象属性比较对象是否相等。
		 * 4.Eclipse提供了功能，可以快速重写equals方法。
		 * 按照属性比较对象是否相等。
		 * 5.equals方法要与hashCode一起重写，
		 * 	hashCode方法在hashMap章节详细讲解
		 * 	
		 */
		Goo g1 = new Goo(8);
		Goo g2 = g1;;
		Goo g3 = new Goo(8);
		System.out.println(g1==g2);//true
		System.out.println(g1==g3);//false
		System.out.println(g1.equals(g2));//true
		System.out.println(g1.equals(g3));//false
		
		Cell c1 = new Cell(5,6);
		Cell c2 = new Cell(5,6);
		Cell c3 = new Cell(7,9);
		System.out.println(c1.equals(c2));//true
		System.out.println(c1.equals(c3));//false
	}

}
class Cell{//格子，单元，细胞
	int row;//行
	int col;//列
	public Cell(int row,int col) {
		this.row = row;
		this.col = col;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
}
class Goo{
	int x;
	public Goo(int x) {
		this.x = x;
	}
}