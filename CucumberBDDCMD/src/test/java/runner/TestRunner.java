package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
glue= {"steps"},
plugin = {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt"
		,"junit:target/cucmber-result.xml"})
public class TestRunner {

}
