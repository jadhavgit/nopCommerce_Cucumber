package JavaPrograms;
  
 class Demo1{
	 void m1() {
		System.out.println("this is my m1 method from Demo class"); 
	 }
 }
 
 interface B1{
	
	 void m2();
 }
 interface B2{
	 
	 void m3();
 }

public class Hybride_Interface extends Demo1 implements B1,B2{

	public void m2() {
		System.out.println("This is my m2 method from B1 class");
	}
	
	public void m3() {
		System.out.println("This ia my m3 method from B2 class");
	}
	
	public static void main(String[] args) {
		
		Hybride_Interface hi=new Hybride_Interface();
		hi.m1();
		hi.m2();
		hi.m3();
		
		
		
	}

}
