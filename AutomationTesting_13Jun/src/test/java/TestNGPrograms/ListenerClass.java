package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListenerClass implements ITestListener {
	
   public void onstart(ITestContext Result) {
	   System.out.println("On start method invoked");
   }
   
   public void onFinish(ITestContext Result) {
	   System.out.println("On Finished method invoked");
   }
   
   //When Test case get failed this method is called...
   public void onTestFailure(ITestContext Result) {
	   System.out.println("Name of Test method Failed : "+Result.getName());
   }
   
 //When Test case get skip this method is called...
   public void onTestSkipped(ITestContext Result) {
	   System.out.println("Name of Test method Skipped : "+Result.getName());   }
   
 //When Test case get start, this method is called...
   public void onTestStart(ITestContext Result) {
	   System.out.println("Name of Test method Started : "+Result.getName());   }
 
   //When Test case get passed, this method is called...
   public void onTestPass(ITestContext Result) {
	   System.out.println("Name of Test method executed : "+Result.getName());   }
   
}
