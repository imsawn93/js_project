package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features="features",
	glue="step_def"
		)

public class runners extends AbstractTestNGCucumberTests
{
	
	
	

}
