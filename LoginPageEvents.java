package pageEvents;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.ElementsFetch;

public class LoginPageEvents {
	
	ElementsFetch ele=new ElementsFetch();
	public void verifyIfLoginPageIsLoaded()
	{
		Assert.assertTrue(ele.getWebElements("xpath",LoginPageElements.logintext).size()>0,"Element not found");
		
	}
	public void credentials()
	{
		ele.getWebElement("xpath",LoginPageElements.email).sendKeys("ravipati.madhu@yahoo.in");
		ele.getWebElement("xpath",LoginPageElements.password).sendKeys("Madhu@123");
	}
}
