package Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet();
		//HashSet <Integer>hsi=new HashSet<Integer>();
		//HashSet<String> hss=new HashSet<String>();
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Welcome");
		hs.add(100);
		hs.add(10.0);
		hs.add(5f);
		hs.add(true);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		//remove()
		hs.remove(2);//here 0is index
		//hs.remove("John"); //here John is element
		System.out.println("After removing elemet from array list :"+hs);
		
		for(Object hss:hs) {
			System.out.println(hss);
		}
		
		
	}

}
