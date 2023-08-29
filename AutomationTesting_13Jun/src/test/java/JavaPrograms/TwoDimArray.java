package JavaPrograms;

public class TwoDimArray {

	public static void main(String[] args) {
		// Declared array with size
		
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Number of rows :"+a.length);
		System.out.println("Number of coloums :"+a[0].length);
		
		System.out.println(a[1][1]);//400
		
		//using for loop
		
		/*for(int i=0;i<=a.length;i++) { //outer loop
			
			for(int j=0;j<a[i].length;j++) {  //innerLoop
				System.out.println(a[i][j]); //100 
			}
			
		}*/
		
		//using enhanced for loop
		for(int p[]:a) {
			
			for(int s:p) {
			
				System.out.println(s);
		}

	}

	}}
