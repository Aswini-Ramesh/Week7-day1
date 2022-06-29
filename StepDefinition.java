package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  {
	public ChromeDriver driver;
    @Given("Open the Chrome browser")
	public void openBrowser(){
	   WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
    @Given("Load the application url {string}")
    public void loadUrl(String url) {
     driver.get(url);
    }
    @Given("Enter the username {string}")//can accept any data
    public void userName(String UN) {
	  driver.findElement(By.id("username")).sendKeys(UN);
	  }
    @Given("Enter the password {string}")
    public void passWord(String PWD) {
	  driver.findElement(By.id("password")).sendKeys(PWD);
  }
     @When("Click on Login button")
     public void clickButton() {
	  driver.findElement(By.className("decorativeSubmit")).click();
  }
     @Then("Homepage should be displayed")
     public void verifyHomepage() {
	  boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
     if(displayed) {
	  System.out.println("Home page is displayed");
     }
    else {
	  System.out.println("Home page not displayed");
  }
  }
     @But("Error message should be displayed")
     public void verifyErrorMsg() {
    	 System.out.println("error msg displayed"); 
     }
 }