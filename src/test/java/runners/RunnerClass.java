package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features/login.feature",
        glue="steps",
        dryRun=false,
        monochrome = true,
        tags="@login"
)
public class RunnerClass {


}
