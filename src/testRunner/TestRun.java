package testRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;  //Cucumber Options are settings for our test
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, // it displays output in a readable manner
		dryRun = false,  //It checks if any of the steps in the feature file has the step definition defined. By default is false
		features= "src/feature", //It helps cucumber to locate the feature file
		glue={"stepdefinition"}  //It helps cucumber to locate the step definition file
		)

public class TestRun {

}
