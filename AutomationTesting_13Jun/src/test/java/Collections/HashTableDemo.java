package Collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		//Hashtable t= new Hashtable(); //capacity is11,load factor 0.75
		//Hashtable t= new(initial capacity);//create hashtable object with some capacity
		
		Hashtable <Integer,String>t= new Hashtable<Integer,String>();
        t.put(101, "XYZ");
        t.put(102, "ABC");
        t.put(103, "nmo");
        t.put(104, "avs");
      //t.put(null, "x");//NullPointerException
        //t.put(105, null);//NullPointerException
        System.out.println(t);
        System.out.println(t.get(103));
        
        t.remove(104);
        System.out.println(t);
        
        System.out.println(t.containsKey(102)); //true
        System.out.println(t.containsKey(104)); //false
        
        System.out.println(t.containsValue("XYZ")); //true
        System.out.println(t.containsValue("X")); //false
        
        
        System.out.println(t.keySet());
        System.out.println(t.values());
        
        for(int k:t.keySet()) {
        	System.out.println(k+" "+t.get(k));
        }
        

        
        
        
	}

}
