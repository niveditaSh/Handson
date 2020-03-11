package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("Navigate to home page")
	public void Navigate_to_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		new LoginObject(driver).signin.click();
		new LoginObject(driver).username.sendKeys(username);
		new LoginObject(driver).password.sendKeys(password);
		new LoginObject(driver).login.click();
		
	}
	
	@Then("Home page should be displayed")
	public void then() throws Throwable {
		String title=driver.getTitle();
		if(title.equals("Home"))
		{
			System.out.println("User logged in successfully");
		}
		
		else
		{
			System.out.println("User login failed");
		}
	}

}
