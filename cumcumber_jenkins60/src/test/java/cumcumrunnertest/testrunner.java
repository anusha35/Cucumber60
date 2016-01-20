package cumcumrunnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java"},format={"pretty","html:target/html-reports/cucumber.html","json:target/cucumber.json"},
monochrome = true)



public class testrunner {
	
}
