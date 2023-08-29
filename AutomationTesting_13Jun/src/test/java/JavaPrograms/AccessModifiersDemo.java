package JavaPrograms;


  class X{
	  //private modifier
	  private int data =10;
	  
	  private void m1() {
		 System.out.println("print this method"); 
	  }
  }
  
  class Y{
	  //default modifier
	  int a=10;
	  
	  void m2() {
		  System.out.println(a);
	  }
  }
  
  class Z{
	  //protected modifier
	 protected int n=100;
	 protected void m3() {
		 System.out.println(n);
		  
	  }
  }
  
  
  class Test{
	  //public modifier
	  public int data1=100;
	  
	  public void m4() {
		  System.out.println(data1);
	  }
  }

public class AccessModifiersDemo {

	public static void main(String[] args) {
		X x=new X();
		//x.data;
		//x.m1();

		Y y=new Y();
		y.a=100;
		y.m2();
		
		Z z=new Z();
		z.n=10;
		z.m3();
		
		Test t=new Test();
		t.data1=10;
		t.m4();
		
		
	}

}
