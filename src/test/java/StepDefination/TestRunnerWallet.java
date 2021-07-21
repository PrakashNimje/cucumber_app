package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:/Wallebi/Wallebi Project/BiBCucumber/Features/FeaturesS/Walletsend.feature", 
glue= {"StepDefination"},
//monochrome= true,
strict = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"}
		)
public class TestRunnerWallet {
	
}
