package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public static void main(String[] args) {
		
	 WebDriver driver;
     +
	 //constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
      
	//page factory
	@FindBy(xpath = "//a[@title='My Account']")
	WebElememnt myAccount;

	public WebElement myAccount() {
		return myAccount;
	}

}

}