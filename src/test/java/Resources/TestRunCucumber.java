package Resources;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( // @CucumberOption has 2 input: features and glue
        features = "src/test/java/features", //specify where  you feature file is located. /features is a package where file is located
        glue = "StepDefinition") //glue is a parameter which define where your stepDefinition file. The name of the Package should be a Package name

public class TestRunCucumber  {
}
