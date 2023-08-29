package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declare ArrayList
		//List l=new ArrayList();
		//ArrayList al=new ArrayList();
		//ArrayList <Integer>ali=new ArrayList<Integer>();
		//ArrayList <String>als=new ArrayList<String>();
		
		//Add new Elements to the arrayList
		ArrayList al=new ArrayList();
		al.add("John");
		al.add(100);
		al.add(15.5);
		al.add('A');
		al.add(true);
		al.add(null);
		al.add(null);
		al.add(100);
		System.out.println(al);

        //size()
		System.out.println("Number of elements in array list :"+al.size());
		
		//remove()
		al.remove(0);//here 0is index
		//al.remove("John"); //here John is element
		System.out.println("After removing elemet from array list :"+al);
		
		//insert a new Element
		al.add(2, "Welcome");
		System.out.println("After insertion : "+al);
		
		//Retrieve specific element
		System.out.println(al.get(3));
		
		//change element/replace()
		al.set(2, "C#");
		System.out.println(al);
		
		//search--contains()
		//al.contains("C#");
		System.out.println(al.contains("C#"));//true
		System.out.println(al.contains("xyz"));//false
		
		//isEmpty()
		System.out.println(al.isEmpty());//false
		
		System.out.println("Readind Elements using For Loop.........");
		//Using for Loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Readind Elements using For each Loop.........");

		//Using For..each loop
		
		for(Object e:al) {
			System.out.println(e);
		}
		
		System.out.println("Readind Elements using Iterator.........");

		//Iterator()
		
		Iterator it=al.iterator();
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  
		ArrayList <Integer>ali=new ArrayList<Integer>();
		ali.add(100);
		ali.add(200);
		ali.add(300);
		ali.add(400);
		System.out.println(ali);
		
		ArrayList <String>als=new ArrayList<String>();
		als.add("X");
		als.add("Y");
		als.add("Z");
		als.add("A");
		als.add("B");
		als.add("C");
		als.add("D");
		System.out.println(als);
		
		als.addAll(al);
		System.out.println(als);
		
		als.removeAll(al);
		System.out.println(als);
		
		
		//sort -----collection.sort()
		System.out.println("Elements in the array list "+als);
		Collections.sort(als);
		
		System.out.println("Elements in the array list after sorting :"+als);
		
		
		Collections.sort(als,Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting in  reverse order :"+als);

		
		//String into array List

         String arr[]= {"Dog","Cat","Elephant"};
         
         for(String value:arr) {
        	System.out.println(value); 
         }
         
         
         ArrayList alstr=new ArrayList(Arrays.asList(arr));
         System.out.println(alstr);
         
		



		
		
		
		
		
		
		

	}

}
