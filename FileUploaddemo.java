package com.qa.demoexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploaddemo {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div/div/div/div[2]/div/div[2]/c-wiz/div/div[2]/div/div/svg")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/main/div/div[2]/div/div/button/span")).click();

		// Add file method
		//addfile.sendKeys("C:\\Users\\aaa\\Pictures\\Screenshots");
		
		/*
		 * if (driver.findElement(By.xpath(".//a[text()='caps.jpeg']")).isDisplayed()) {
		 * assertTrue(true, "Profile picture is Uploaded"); } else { assertTrue(false,
		 * "Profile picture not Uploaded"); }
		 */

	}
}
