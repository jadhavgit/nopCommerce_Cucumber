package JavaPrograms;

  class Animal{
	  //instance variable
    	String color="White";
    	
    	//method
    void eating() {
    	System.out.println("Eating.............");
    	
    }
    
    Animal(){
    	System.out.println("Animal is created");
    }
    
	  
    }

  class Dog extends Animal{
	 
	  String color="Black";
	  
	  void display() {
		  System.out.println(color);
		  System.out.println(super.color);
	  }
	  
	  void eating() {
		  System.out.println("Eating Bread.........");
		  super.eating();
	  }
	  
	  //constructor
	  Dog(){
		  super();
		  System.out.println("Dog is created");
		  
	  }
	  
  }




public class SuperKeywordDemo {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
		d.eating();

	}

}
