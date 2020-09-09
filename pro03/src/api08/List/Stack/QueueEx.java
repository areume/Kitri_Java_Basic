package api08.List.Stack;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : Queue는 인터페이스로 제공된다. 하위 클래스인 LinkedList로 구현한다.
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<Integer>(); // First In First Out
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()+"\t"+queue.size());
		}
		
		
		
		LinkedList<Integer> que=new LinkedList<Integer>();
		que.offer(77);
		que.offer(88);
		que.offer(99);
		que.offer(100);
		System.out.println(que);		
		System.out.println(que.getFirst());
		System.out.println(que.getLast());
		
		que.addFirst(1);
		que.addLast(2);
		System.out.println(que);
		
		que.removeFirst();
		que.removeLast();
		System.out.println(que);
		
	}

}
