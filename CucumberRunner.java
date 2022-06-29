package Runner;

import Steps.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feautures/Login.feature", glue="Steps", monochrome=true, publish=true) 

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
