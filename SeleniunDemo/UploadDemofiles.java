package SeleniunDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDemofiles {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		WebElement uploadfile = driver.findElement(By.xpath("//*[@id=\"uploadfile\"]"));
		uploadfile.sendKeys("C:\\Users\\Admin\\Desktop\\madhu docs\\testing data\\Selenium concepts.pdf");
        Thread.sleep(2000);
		driver.close();
	}
}
