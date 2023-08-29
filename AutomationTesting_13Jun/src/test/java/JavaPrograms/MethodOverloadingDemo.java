package JavaPrograms;

public class MethodOverloadingDemo {
	
	MethodOverloadingDemo(int x,int y){
		System.out.println(x+y);
	}
	
	void add(int a, int b) {    //m1
	   System.out.println(a+b);	
	}
	
	void add(int a, int b ,int c) { //m2
		   System.out.println(a+b+c);	

	}
	void add(int a,double b) {  //m3
		   System.out.println(a+b);	

	}
	void add(double a,double b) { //m4
		   System.out.println(a+b);	
	}
	
	

	public static void main(String[] args) {
		MethodOverloadingDemo mol=new MethodOverloadingDemo(100,200);
		mol.add(100,200); //300  1
		mol.add(1000.00, 2000.00);//4
		mol.add(10, 3000.00); //3
		mol.add(10, 20, 30);//2

	}

}
