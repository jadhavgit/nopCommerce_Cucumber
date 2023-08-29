package JavaPrograms;

public class ThisKeywordDemo {
	int a,b;      //instance variable/class variable

	void getvalues(int a, int b) //method variables
	{
		this.a=a;
		this.b=b;
	}
	
	void printvalue() {
		System.out.println(a);
		System.out.println(b);
	}



	public static void main(String[] args) {
		ThisKeywordDemo th=new ThisKeywordDemo();
		th.getvalues(10, 20);
		th.printvalue();
	}

}
