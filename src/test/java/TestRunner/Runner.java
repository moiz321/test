package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (features = "Features/Login.feature",
                glue = "StepDefination",
                //tags = "@Sanity",
                //tags = "@Regression",
                dryRun = false,
                monochrome = false,
                plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

        )
public class Runner {
}
