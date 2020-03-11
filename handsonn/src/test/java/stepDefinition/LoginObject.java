package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	WebDriver driver;
	public LoginObject(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'SignIn')]")
	public WebElement signin;
	
	@FindBy(id="userName")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;

	@FindBy(name="Login")
	public WebElement login;	
}
