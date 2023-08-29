package JavaPrograms;

   abstract class Bike{
	   abstract void run();
   }


public class AbstractionDemo extends Bike {
	void run() {
		System.out.println("Please get helmate first then ride the Bike");
	}

	public static void main(String[] args) {
		AbstractionDemo ad=new AbstractionDemo();
		ad.run();

	}

}
