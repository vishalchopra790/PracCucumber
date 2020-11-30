package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\AppFeatures"},
        glue = {"StepDefinations", "MyHooks"},
        // tags="@Regression",
        plugin = {"pretty",
                "json:Reports/report.json",
                "junit:Reports/report.xml"},
        dryRun = true,
       monochrome = false)

public class AmazonTR {
}
