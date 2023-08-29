package JavaPrograms;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Welcome";
		String s1=" To Java";
		
		//length()----> length of a string
		System.out.println(s.length()); //7

		//concat()------>joining two length
		System.out.println(s.concat(s1));
		
		//trim()----->remove space from string
		s="   Welcome   ";
		System.out.println("Before triming string is: "+s);
		System.out.println("After triming String is: "+s.trim());
		
		//ChartAt()--->return char values based on index number
		s="Shivay";
		System.out.println(s.charAt(3));//v
		
		//Contains()---> return true false 
		s="Shivay";
		System.out.println(s.contains("Shivay"));//true
		System.out.println(s.contains("shivay")); //false
		System.out.println(s.contains("ivay")); //true

		//equal()---->comparing strings
		s="Welcome";
		System.out.println(s.equals("Welcome"));//true
		System.out.println(s.equals("welcome"));//false
		System.out.println(s.equals("wel come"));//false
		
		//equalsIgnorCase---> return true value
		System.out.println(s.equalsIgnoreCase("weLcoMe"));//true
		System.out.println(s.equalsIgnoreCase("WELCOME"));//true
		
		//replace
		s="Welcome To Java";	
		System.out.println(s.replace('e', 'a')); //Walcoma To Java
		System.out.println(s.replace("Java", "Python"));
		
		//toLowerCase()
		s="WELCOME";
		System.out.println(s.toLowerCase());//welcome
		
		//toUpperCase
		s="welcome";
		System.out.println(s.toUpperCase());//WELCOME
		
		
		//Substring()
		
		s="Welcome"; // 0  1 2 3 4 5 6
        System.out.println(s.substring(0,4)); //Welc
        System.out.println(s.substring(1,5)); //elco
        System.out.println(s.substring(3,7));//come
        System.out.println(s.substring(0,7));//welcome
        

	}

}
