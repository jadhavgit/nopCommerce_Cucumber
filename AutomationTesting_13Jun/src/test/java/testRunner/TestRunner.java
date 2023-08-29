package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         
		        //features= "src/test/resources/Features/Customers.feature",
		         features="src/test/resources/Features",
		         glue="StepDefinations",
		         dryRun=false,
		         monochrome=true,
		         plugin= {"pretty" ,"html:test-output"},
		         tags="@sanity"
		        
		)




public class TestRunner {

}
