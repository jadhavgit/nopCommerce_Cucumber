package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//LinkedList ll=new LinkedList();
		//LinkedList<Integer> lli=new LinkedList<Integer>();
		//LinkedList<String> lls=new LinkedList<String>();
		
		LinkedList ll=new LinkedList();
		ll.add("Welcome");
		ll.add(100);
		ll.add(10.0);
		ll.add(5f);
		ll.add(true);
		ll.add('A');
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		for(Object linklist:ll) {
			System.out.println(linklist);
			
		}

	}

}
