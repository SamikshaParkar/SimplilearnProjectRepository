package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/features/EbayTagExample.feature", glue="stepDefinitions",
                 tags="@FirefoxBrowser",
                plugin= {"pretty", "html:target/cucumber-reports.html"}

		        )

public class smokeRunner {

}