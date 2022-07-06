package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"
,monochrome=true,
plugin= {"html:target/cucumber.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})

public class JunitTestRunnerTest {

}
