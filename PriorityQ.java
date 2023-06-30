package Day7;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	      public static void main(String[] args) 
	      {
	    	  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	    	  //Adding
	    	  pq.add(4);
	    	 System.out.println(pq);
	    	  pq.add(2);
	    	 System.out.println(pq.element());
	    	  pq.add(1);
	    	  System.out.println(pq);
	    	  pq.add(3);
	    	  System.out.println(pq);
	    	  System.out.println("----------------------");
	    	  System.out.println(pq.element());
	    	
	    	  //Iterating
	    	  Iterator<Integer> itr = pq.iterator();
	    	  while(itr.hasNext())
	    	  {
	    		  System.out.println(itr.next());
	    	  }
	    	  //Removing element
	    	  pq.poll();
	    	  pq.remove();
	    	  
	    	  System.out.println(pq);
	    	  
}
}
