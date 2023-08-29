package JavaPrograms;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		int a=10;
		try {
		 System.out.println(a/0);
		}
		catch(NullPointerException e) {
			System.out.println("entred in to catch Block");
		}
		finally {
			System.out.println("Entred in to finally Block");
		}
		
		
		System.out.println("Program is Compeleted");

		
		
		

	}

}
