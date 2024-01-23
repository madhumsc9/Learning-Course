package programmsJava;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchpageforGoogle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait (driver, 20);
		driver.get("https://www.google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("count:"+links.size());
		
		for(WebElement link:links) {
			System.out.println(link.getAttribute("href"));
			
			
		}
		

	}

}
