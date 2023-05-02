package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityqueueProgram {

	public static void main(String[] args) {
 
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(50);
		q.add(80);
		q.add(60);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
