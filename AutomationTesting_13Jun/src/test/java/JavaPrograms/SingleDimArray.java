package JavaPrograms;

public class SingleDimArray {

	public static void main(String[] args) {
		// Declared array with size 5, starting index 0, last index 4
		/*int a[]=new int[5];

		//inserting values into an array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//System.out.println(a[2]);//300
		
		int a[]= {100,200,300,400,500,600};//declare array without size
		//Size of an array
		//System.out.println("Length of array :"+a1.length); //6
		System.out.println("Length of array :"+a.length); //5
		
		//Read values from an array
		//using for loop
		/*for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]); //100 ,
		}*/
		
		
		//using Enhanced for Loop
		/*for(int i:a) {
			System.out.println(i);
		}*/
		
		String arr[]= {"Java","Selenium","C#","C++"};
		for(String s:arr) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
