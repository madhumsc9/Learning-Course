package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementsFetch;

public class TestCase1 extends BaseTest{
	
	ElementsFetch ele=new ElementsFetch();
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	
	@Test
	public void sampleMethodEnteringForCredentials () {
		
		homepage.signInButton();
		loginpage.verifyIfLoginPageIsLoaded();
		loginpage.credentials();
		
	}

}
