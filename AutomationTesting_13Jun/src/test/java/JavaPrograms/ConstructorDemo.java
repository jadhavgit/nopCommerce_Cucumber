package JavaPrograms;

public class ConstructorDemo {
	int x;
	int y;
	
	ConstructorDemo(){ //Default Constructor
		x=10;
		y=20;
	   System.out.println(x+y);	
	}
	
	ConstructorDemo(int a, int b){ //Parameterized Constructor
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo(); //Invoke default Constructor

		ConstructorDemo cd1=new ConstructorDemo(100,200); //Invokes parameterized Constructor
	}

}
