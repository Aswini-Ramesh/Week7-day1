package CreateLeadRunner;

import CreateLeadSteps.CreateLeadCucumberStepsdef;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/CreateLeadFeatures/CreateLead.feature", glue="CreateLeadSteps", monochrome=true, publish=true) 

public class CreateLeadCucumber extends AbstractTestNGCucumberTests{

}
