package JavaPrograms;

public class StaticExample {
	  static int a=10;  //Static variable 
	  int b=20;         //non-static variable
	  
	  
	  
	 static void m1() {   //static method
		  System.out.println("This is my method m1 ---->Static method");
	  }
	 
	 void m2() { //non static method
		  System.out.println("This is my method m2 ---->Non-Static method");
 
	 }
	 void m3() {
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
		 
	 }
	
	

	public static void main(String[] args) {
		//static methods can access only static stuff without using object
		//System.out.println(StaticExample.a);
		//StaticExample.m1();
		
		//System.out.println(b);//incorrect bcz b is non static variable
		//m2();                ////incorrect bcz m2 is non static method
		
		
		//static methods can also access static stuff but through object
		StaticExample se=new StaticExample();
		//System.out.println(se.b);//non static variable through object
		//se.m2();  ////non static method through object
		
		//System.out.println(se.a=10);
		//se.m1();
		
		se.m3();
		
	}

}
