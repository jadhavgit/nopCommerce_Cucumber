package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		//Adding element add() offer()
		
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("E");
		pq.add(100); //allowed in queue (Heterogeneous data allowed)
		pq.offer("E");
		
		System.out.println(pq);
		
		//get head element   element()  peek();
		//System.out.println(pq.element()); //A
		System.out.println(pq.peek()); //A return head element ,if empty return null
		
		//Return & remove from queue   remove() poll()
		
		System.out.println(pq.remove());//A
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		/*System.out.println(pq.remove("D"));//true
		System.out.println(pq);*/
		
		//Iterator
		Iterator itr=pq.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//using for each loop
		for(Object ele:pq) {
			System.out.println(ele);
		}
		
		


	}

}
