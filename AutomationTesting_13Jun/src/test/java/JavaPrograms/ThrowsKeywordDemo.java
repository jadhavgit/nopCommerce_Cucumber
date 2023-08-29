package JavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		FileReader fr=null;
		fr=new FileReader("D:\\Test\\Throwskeyword.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);
		
		

	}

}
