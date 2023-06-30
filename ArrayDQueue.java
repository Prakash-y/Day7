package Day7;

import java.util.ArrayDeque;

public class ArrayDQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		//Adding
		dq.add(18);
		dq.add(22);
		dq.add(13);
		dq.add(29);
		dq.add(40);
		dq.add(25);
		System.out.println(dq);
		//Iterating
		for(Integer a : dq)
		{
			System.out.println(a);
		}
		//Adding first
		dq.addFirst(101);
		dq.addFirst(88);
		
		//Adding last
		dq.addLast(6);
		dq.addLast(11);
		System.out.println(dq);
		
		//removing
		dq.remove();
		dq.removeFirst();
		dq.removeLast();
		System.out.println("After removing element :"+ dq);

		
		
		//first element
		System.out.println("First element : "+ dq.getFirst());
		System.out.println(dq.peek());
		
		//Last element
		System.out.println("Last element : " + dq.getLast());
		
		System.out.println("poll : "+dq.poll());
		dq.push(200);
		System.out.println("The size of array:"+dq.size());
		System.out.println(dq);
		
		
	}
}
