package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runner {

	@CucumberOptions(features="src/test/resources/Feature/logincockpit.feature",glue= {"testlogin"} , plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runfile extends AbstractTestNGCucumberTests {



}
	
}

