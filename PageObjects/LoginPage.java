package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(id="//input[@value='Login']")
	WebElement btnlogin;

}
