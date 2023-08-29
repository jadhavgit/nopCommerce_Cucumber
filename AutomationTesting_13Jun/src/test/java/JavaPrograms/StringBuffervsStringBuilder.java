package JavaPrograms;

public class StringBuffervsStringBuilder {

	public static void main(String[] args) {
		
		//StringBuffer
		
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb.length());
		System.out.println(sb.charAt(6));
		
		System.out.println(sb.substring(1,3)); //el
		System.out.println(sb.reverse());
		//System.out.println(sb.replace("Welcome", "Java",0 ));
		
		String str="Welcome";
		System.out.println(str.contains(sb));
		System.out.println(str.replace('e', 'a'));
		
		StringBuilder sb1=new StringBuilder("Learn coding");
		System.out.println(sb1.reverse());
		
		
		
		
		String r="Welcome";
		String r1="";
		int l=r.length();
		for(int i=l-1; i>=0;i--) {
			r1=r1+r.charAt(i);
			
		}
		System.out.println(r1);
		
	}}


