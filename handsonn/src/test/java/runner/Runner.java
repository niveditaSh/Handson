package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty", "html:HTMLReport", "json:JSONReport/cucumber.json", "junit:JUNITReport/cucumber.jxl"},
		features="feature",
		tags="@tag1",
		glue="stepDefinition")
public class Runner {

}
