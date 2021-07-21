package StepDefination;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:/Wallebi/Wallebi Project/BiBCucumber/Features/FeaturesS/Tags.feature", 
glue= {"StepDefinition"},
tags = {"@smoke"}
		)

public class TestRunnerTags {

}
