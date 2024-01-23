package interviewQuestions;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinpricedemoFromproduct {

	public static void main(String[] args) {

		findLowestPriceInCategory("camera");
	}

	public static void findLowestPriceInCategory(String category) {
		
		WebDriverManager.chromedriver().setup();
		URL remoteUrl=new URL("http://127.0.0.1:9515");
		DesiredCapabilities capabilities =DesiredCapabilities.firefox();
		WebDriver driver=new RemoteWebDriver(remoteUrl,capabilities);

//		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"), DesiredCapabilities.chrome());
//		driver.get("website_url");
		
		List<WebElement> products = driver.findElements(By.className("product"));

		double minPrice = Double.POSITIVE_INFINITY;
		boolean categoryFound = false;

		for (WebElement product : products) {
			String productName = product.findElement(By.className("product-name")).getText();
			String productCategory = product.findElement(By.className("product-category")).getText();
			double productPrice = Double.parseDouble(product.findElement(By.className("product-price")).getText());

			if (productCategory.equalsIgnoreCase(category)) {
				categoryFound = true;
				if (productPrice < minPrice) {
					minPrice = productPrice;
				}
			}
		}

		if (categoryFound) {
			System.out.println("Lowest price in category " + category + ": " + minPrice);
		} else {
			System.out.println("Category " + category + " not found");
		}

		driver.quit();

	}

}
