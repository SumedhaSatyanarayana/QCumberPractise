package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"J:\\workspace\\Qcumber\\src\\cucumber\\features\\myfeature.feature"},
		glue={"J:\\workspace\\Qcumber\\src\\cucumber\\StepDefinitions.java"},
		format = {"pretty","html:target/"}, // I want my report in pretty format and as a jason
				// a jason file will be generated when cucumberRunner class is run
		dryRun = false,
		monochrome = true,
		strict = false // faiil the execution if there are undefined 
		)

// give complete path if an error ocurs
public class CucumberRunner {
	

}
