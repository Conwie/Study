package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque 双端队列
 * Deque接口继承自Queue接口，双端队列是队列两端都
 * 可以做进出队操作的队列。
 * 常用实现类：java.util.LinkedList
 * @author soft01
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		
		deque.offerFirst("four");
		System.out.println(deque);
		
		deque.offerLast("five");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
		//遍历队列
		for(String s : deque) {
			System.out.println(s);
		}
		System.out.println(deque);
	}
}
