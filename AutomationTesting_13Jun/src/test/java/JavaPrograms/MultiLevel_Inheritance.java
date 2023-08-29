package JavaPrograms;

class A{
	int x;
	void display() {
		System.out.println(x);
	}
}

class B extends A{
	int y;
	void print() {
		System.out.println(y);

	}

}

class C extends B{
	int z;
	void show() {
		System.out.println(z);

	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
	   C c=new C();
	   c.x=100;
	   c.y=200;
	   c.z=300;
	   
	   c.display();
	   c.print();
	   c.show();

	}

}
