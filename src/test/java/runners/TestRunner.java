package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/example.feature",
        glue = {"steps_definition"},
        plugin = {
                "pretty", "html:reports/html/report.html",
                "json:reports/json/reports.json"
        }
)
public class TestRunner
{

}
