package JavaPrograms;


class parent1{
	int a;
	void display() {
		System.out.println(a);
	}
}

class child1 extends parent1{
	int x;
	void show() {
		System.out.println(x);

	}
}

class child2 extends parent1 {
	int y;
	void print() {
		System.out.println(y);

	}
}



public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		child1 c=new child1();
		c.a=10;
		c.x=20;
		c.display();
		c.show();
		
		child2 c2=new child2();
		c2.a=100;
		c2.y=200;
		c2.display();
		c2.print();

	}

}
