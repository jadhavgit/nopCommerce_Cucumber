package JavaPrograms;

 interface ABC{
	 int x=100;
	 
	 void m1();
 }
 
 interface XYZ{
	 int y=200;
	 void m2();
 }


public class Mutiple_Inheritance implements ABC, XYZ {
	
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		Mutiple_Inheritance mi=new Mutiple_Inheritance();
		mi.m1();
		mi.m2();

	}

}
