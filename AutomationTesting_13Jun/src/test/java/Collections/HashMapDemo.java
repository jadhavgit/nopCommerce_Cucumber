package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap hs=new HashMap();
		HashMap<Integer,String> hs=new HashMap<Integer,String>();

		hs.put(101, "John");
		hs.put(102, "David");
		hs.put(103, "Scott");
		hs.put(104, "Mary");
		hs.put(105, "Tye");
		hs.put(103, "X");
		hs.put(106, "David");
		//hs.put(null, "John");		
		//hs.put(null, "null");
		//hs.put(101, "null");

		System.out.println(hs);
		
		System.out.println(hs.get(105));
		
		hs.remove(106);
		System.out.println(hs);
		
		System.out.println(hs.containsKey(101));//true
		System.out.println(hs.containsKey(106));//false
		
		System.out.println(hs.containsValue("Mary"));//true
		System.out.println(hs.containsValue("xyz"));//false
		
		System.out.println(hs.keySet()); //return all key set
		
		for(Object i:hs.keySet()) {
			System.out.println(i);
		}
		
		
		System.out.println(hs.values()); //return all the values as collection

		for(Object s:hs.values()) {
			System.out.println(s);
		}
		
		//System.out.println(hs.entrySet());//return all entries as set
		
		/*for(Object ss:hs.keySet()) {
			System.out.println(ss+" "+hs.get(ss));
		}*/
		
		//Entry Methods
		//----------------
		
		/*for(Map.Entry entry:hs.entrySet()) { //101
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}*/


		//iterator
		
		Set s=hs.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
		}

		
	}

}
