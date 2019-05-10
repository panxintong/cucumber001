import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/features",
                glue = {"Steps"},
                tags = {"@p1"},
                plugin = {
                "pretty","html:target/cucumber-report",
                 "json:target/cucumber-report/cucumber.json",
                })

public class Run extends AbstractTestNGCucumberTests{
}
