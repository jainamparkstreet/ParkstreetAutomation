package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//Which file is needs to be run

@CucumberOptions(features="src/test/resources/features/login.feature",glue= {"test"}, plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runfile extends AbstractTestNGCucumberTests {

	
	
}
