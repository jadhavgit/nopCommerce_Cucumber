package JavaPrograms;

 interface A1{  //inteface
	 
	 int a=10;   //by default variables  in interface are static and final
	
	 void m1();  //Abstract method by default public
		
 }
 


public class InterfaceDemo implements A1{
	
	public void m1() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {

		InterfaceDemo id=new InterfaceDemo();
		id.m1();
		
		A1 a=new InterfaceDemo();
		a.m1();
	}

}
