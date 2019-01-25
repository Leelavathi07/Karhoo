package StepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import Framework.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
public class StepDefination extends BaseTest {
	  @Given("^User is on home page$")
	    public void user_is_on_home_page() throws Throwable {
	    	 driver.get("https://flit.tech/");
	}

	@When("^Click on About And Click on Karhoo team$")
	public void click_on_About_And_Click_on_Karhoo_team() throws Throwable {
		 driver.findElement(By.linkText("About")).click();
		 driver.findElement(By.xpath("//a[@title='Join the Karhoo team']")).click();
	}

	@Then("^Click on Apply$")
	public void click_on_Apply() throws Throwable {
		WebElement apply=driver.findElement(By.xpath("//a[@href='https://karhoo.bamboohr.co.uk/jobs/']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", apply);
	}

	@Then("^Validate Bamboohr page$")
	public void validate_Bamboohr_page() throws Throwable {
		System.out.println(driver.getTitle());
	}


    }
   