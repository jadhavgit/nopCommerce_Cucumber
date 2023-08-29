package JavaPrograms;

public class ExceptionExamples {

	public static void main(String[] args) {
		System.out.println("Program is started");
		
		
		//ArithmeticException
		
		int a=100;
		try {	
		System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("enterd into catch Block");
		}
		
		
		//NullPointerException
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("enterd into catch Block");

		}
		
		//NumberFormatException
		String s1="abc";
		try {
		int i=Integer.parseInt(s1);
		}
		catch(NumberFormatException e) {
			System.out.println("enterd into catch Block");
		}
		
		//ArrayIndexOutOfBoundsException
		int arr[]=new int [5];
		//arr[5]=100;
		
		
		System.out.println("Program is Completed");
		

	}

}
