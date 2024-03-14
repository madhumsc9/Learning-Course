package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementsFetch;

public class HomePageEvents {
	
	ElementsFetch ele=new ElementsFetch();
	
	public void signInButton() {
		ele.getWebElement("xpath",HomePageElements.signInButtonText).click();
		
	}

}
