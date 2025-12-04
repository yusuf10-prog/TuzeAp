package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/stepdefinitions",
        glue = {"stepdefinitions", "base_url", "hooks"},
        tags = "@MyCRUD",
        plugin = {"html:target/reports/htm_report.html",
        "json:target/reports/json_report.json",
        "rerun:target/failed_tests/failed_scenarios.txt",
        "pretty"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
