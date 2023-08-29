package JavaPrograms;

  class student{
	  
	  private String name;
	  
	  //getter method for name red name
	  public String getname(){
		 return name; 
	  }
	  
	  //setter method for name update name
      public void Setname(String name){
    	  this.name=name;
	  }
  }



   

public class Encapsulation {

	public static void main(String[] args) {
		student s=new student();
		s.Setname("sita");
		System.out.println(s.getname());

	}

}
