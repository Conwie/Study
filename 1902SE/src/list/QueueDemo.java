package list;

import java.util.LinkedList;
import java.util.Queue;

/*
 * java.util.Queue 队列
 * Queue接口继承自Collection
 * 队列可以保存一组元素，但是存取元素必须遵循先进先出
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("one");
		q.offer("two");
		q.offer("three");
		q.offer("four");
		q.offer("five");
		System.out.println(q);
		/*
		 * 出队操作，获取队首元素并将该元素从队列中移除。
		 */
		String str = q.poll();
		System.out.println(str);
		System.out.println(q);
		
		/*
		 * 引用队首元素，获取队首元素后该元素不会被移除
		 */
		str = q.peek();
		System.out.println(str);
		System.out.println(q);
		//获取队列元素个数
		System.out.println(q.size());
		
		//遍历队列，使用迭代器遍历后元素还在队列中
		for(String s : q) {
			System.out.println(s);
		}
		System.out.println(q);
		/*
		 * 使用poll方法遍历队列元素
		 */
		while(q.size()>0) {
			System.out.println(q.poll());
		}
//		for(int i=0;i<q.size();) {
//			q.poll();
//		}
		System.out.println(q);
	}

}
