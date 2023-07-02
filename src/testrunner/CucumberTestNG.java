package testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/features/ReportExample.feature", glue="stepDefinitions", plugin= {"pretty", "html:target/cucumber-reports.html"})
public class CucumberTestNG extends AbstractTestNGCucumberTests {

}