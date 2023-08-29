package JavaPrograms;

 class parent{
	 int a;
	 void didplay() {
		 System.out.println(a);
	 }
	 
 }
 
 
 class child extends parent{
	int b;
	void print() {
		System.out.println(b);
	}
 }


public class Single_Inheritance {

	public static void main(String[] args) {
		child c=new child();
		c.a=10;
		c.b=20;
		c.didplay();
		c.print();
		
		
	}

}
