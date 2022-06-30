package CreateLeadSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLeadCucumberStepsdef {
	public static ChromeDriver driver;
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

	    else 
	    {
		  System.out.println("Home page not displayed");
	  }
	  }
	   //  @But("Error message should be displayed")
	     //public void verifyErrorMsg() {
	    	// System.out.println("error msg displayed"); 
	     //}
	     @When ("Click on link {string}")
	     public void ClickOnCRM(String CRM) {
	    	 driver.findElement(By.linkText(CRM)).click();
	    	 System.out.println(driver.getTitle());
	       }
	     @Then("Myhome page should be displayed")
	     public void HomePageDisplayed() {
	    	 driver.getTitle();
	     }
	      @When("Click on Leads Link")
	      public void ClickOnLead() {
	    	 driver.findElement(By.linkText("Leads")).click();
	     }
	     @Then("Leads page should be displayed")
	     public void LeadPageDisplayed() {
	    	 driver.getTitle();
	     }
	     @When ("Click on Create Lead link")
	     public void ClickOnCreateLead() {
	    	 driver.findElement(By.linkText("Create Lead")).click();	 
	     }
	     @Then("Create Lead page should be displayed")
	     public void CreateLeadPage() {
	    	 driver.getTitle();
	     }
	     @Given("User Enter the Company name {string}")
	     public void EnterCompanyName(String CN) {
	    	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CN);
	     }
	     @Given("User enter the First Name {string}")
	     public void EnterFirstName(String FN) {
	    	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FN);
	     }
	     @Given("User enter the Last Name {string}")
	     public void EnterLastName(String LN) {
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LN);	
	}
	     @Given("User enter the FirstName Local {string}")
	    public void FirstNameLocal(String FNL) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(FNL);	
	}
	       @Given("User enter the department {string}")
	        public void EnterDepartment(String DEP) {
	    	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(DEP);
	}
	     @Given("User enter the description {string}")
	     public void EnterDescription(String DESCR) {
		 driver.findElement(By.id("createLeadForm_description")).sendKeys(DESCR);
	}
	     @Given("User enter the EmilId {string}")
	     public void EnterEmail(String Email) {
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(Email);
	}
	     @When("Click on the drop down")
	     public void ClickOnDropDown() {
		 WebElement ele= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd =new Select(ele);
		 dd.selectByVisibleText("New York");
	}
	    @When("Click on the Create Lead button")
	   public void ClickOnCreateLeadButton()
	{
	   	 driver.findElement(By.className("smallSubmit")).click();	
		}
	    @Then("Lead Created Page should be displayed")
	    public void LeadCreatedPageDisplayed() {
		driver.getTitle();
		}
	    @When("User Click on Edit")
	    public void EditLead() {
	    driver.findElement(By.linkText("Edit")).click();
	    }
	    @When("User clear the description")
	    public void ClearDescription() {
	    	driver.findElement(By.id("updateLeadForm_description")).clear();
	    }
	   @Given("The user Update the Leadform {string}")
	    public void UpdateLeafForm(String LeadForm) {
		   driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(LeadForm);
	   }
	   @When("User click on the update button")
	   public void ClickOnUpdateButton() {
		   driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	   }
	    @Then("View Lead should be displayed")
	    public void ViewLeadPageDisplayed() {
		System.out.println("View Lead Page displayed");
	}
	}

