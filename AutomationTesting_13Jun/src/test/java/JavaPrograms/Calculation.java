package JavaPrograms;

public class Calculation {
	//1)Case1 : not taking parameters and also not returned any value
	int x=10;
	int y=20;
	
	void sum1() {
		System.out.println(x+y);
	}
	
	//2)Case2 : not taking parameters but  returned  value
	
	int sum2() {
		return (x+y);
	}
	
	//3)Case3 : taking parameters but  not returned any value
	
	void sum3(int a, int b) {
		System.out.println(a+b);
	}
	
	//4)Case4 : taking parameters and also returned any value
	
	int sum4(int a, int b) {
		return (a+b);
		
	}

	
	
	
	public static void main(String[] args) {
		Calculation cl=new Calculation();
		cl.sum1();
		
		int rev=cl.sum2();
		System.out.println(rev);
		
		cl.sum3(100, 200);
		
		System.out.println(cl.sum4(500, 600));

	}

}
