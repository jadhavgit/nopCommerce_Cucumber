package JavaPrograms;

 class Demo{
	 int rollno;
	 String name;
	 float fee;
	 
	 
	 void show(int rollno,String name,float fee) {
		 this.rollno=rollno; 
		 this.name=name;
		 this.fee=fee;
	 }
	 
	 void display() {
		 System.out.println(rollno+" "+name+" "+fee);
	 }
 }


public class TestThis {

	public static void main(String[] args) {

		Demo d=new Demo();
		d.show(111, "ankit", 5000f);
		d.display();
		Demo d1=new Demo();
		d1.show(112, "sumit", 6000f);
		d1.display();
		
		
	}

}
