package core;

import org.junit.runner.RunWith;
//import 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json:target/"},
		features = {"src/cucumber/"}
		)
public class CucumberRunner {

}

