package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/// ENdTOEnd_EcomProject Runner Class

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\features",
		glue = "stepDefination",
		dryRun = false,
		monochrome = true,
		tags = "@admin or @Customerlogin or @Header or @Category or @SearchProduct or @Registration or not @OrderDone",
		
		plugin = {"html:target/cucumber-reports/index.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				
				
				
				}
		
/* "tech.grasshopper.extentreports.cucumber.adapter.ExtentCucumberAdapter:", */
		
		)



public class RunnerClass {


	
}
