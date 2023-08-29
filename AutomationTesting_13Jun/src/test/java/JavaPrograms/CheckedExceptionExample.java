package JavaPrograms;

public class CheckedExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is stared");
		System.out.println("Program is in progress");
		//InterruptedException
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Thread.sleep(5000);
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");


	}

}
