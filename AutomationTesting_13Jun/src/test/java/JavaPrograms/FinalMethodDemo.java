package JavaPrograms;

  class Bike1{ //final class
	  //final method
	  //final 
	  void run() {
		  System.out.println("Running..........");
	  }
  }
  
  class Honda extends Bike1{
	  
	  void run() {
		  System.out.println("Started..........");
	  }
  }


public class FinalMethodDemo {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();

	}

}
