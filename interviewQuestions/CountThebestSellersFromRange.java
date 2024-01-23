package interviewQuestions;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountThebestSellersFromRange {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		URL remoteUrl=new URL("http://127.0.0.1:9515");
		DesiredCapabilities capabilities =DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(remoteUrl,capabilities);
		
//		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"), DesiredCapabilities.chrome());
//		driver.get("website_url");
		
		List<WebElement> bestSellerProducts = driver.findElements(By.cssSelector("your_css_selector_for_best_seller_products"));

		int count = 0;
		double minPrice = 10.0; // replace with your desired minimum price
		double maxPrice = 100.0; // replace with your desired maximum price

		for (WebElement product : bestSellerProducts) {
		    double productPrice = Double.parseDouble(product.findElement(By.cssSelector("your_css_selector_for_price")).getText().replace("$", ""));
		    
		    if (productPrice >= minPrice && productPrice <= maxPrice) {
		        count++;
		    }
		}

		System.out.println("Count of best seller products within the given price range: " + count);
	}

}
