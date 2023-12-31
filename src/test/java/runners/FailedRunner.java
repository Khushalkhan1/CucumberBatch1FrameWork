package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // It is path to feature file if path is to folder all feature files will run.
        // If path is to class , only that class will run.
        features = "src/test/resources/features/" ,
        // glue is a place or folder that we implement the gherkin steps.
        // glue should have the path to folder where we have all our steps.
        glue = "steps",
        // if we set the dryRun to true, it will quickly scan that gherkin steps are implemented.
        // if we set the dryRun to false, it will the actual test.
        dryRun = true,
        // it will remove the unreadable word or symbol from console make the console readable.
        monochrome = true,
        // it will identify the scenarios base on the tag that we provide for example @smoke, @regression etc.....
        // we can add different tags in the runner class to execute scenarios belongs to that tags
        // and/or for call more scenarios.
        tags = "@smoke",

        plugin={"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "rerun:target/failed.text" }

)
public class FailedRunner {


}
