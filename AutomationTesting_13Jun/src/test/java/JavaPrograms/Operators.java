package JavaPrograms;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("**********Arithmetic Operators*************");
	
		//1.Arithmetic Operators --->+ - * / %
		System.out.println("Sum of a and b: "+(a+b));
		System.out.println("Diff of a and b: "+(a-b));
		System.out.println("Mul of a and b: " +(a*b));
		System.out.println("Div of a and b: "+(a/b));
		System.out.println("Mod of a and b: "+(a%b));
		
		System.out.println("**********Relational Operators*************");
		
		//2.Relational Operators ---> == < > <= >= !=-->returns boolean values
		System.out.println(a==b);//false
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		
		System.out.println("**********Logical Operators*************");
		//3.Logical Operators ----> && || !
		//works between two boolean values
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);//False
		System.out.println(x || y);//true
		System.out.println(!x); //false
		System.out.println(!y);//true
		
		System.out.println("**********inc/dec Operators*************");
		//4.increment/decrement Operators----> ++ --
		
		a=10;
		a++;   //a=a+1
		System.out.println(a);//11
		
		b=10;
		b--; //b=b-1
		System.out.println(b);//9
		
		

	}

}
