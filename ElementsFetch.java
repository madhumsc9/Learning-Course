package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementsFetch {
	
	public WebElement getWebElement(String identifiertype,String identifiervalue) {
		switch(identifiertype) {
		
		case"xpath":
		return BaseTest.driver.findElement(By.xpath(identifiervalue));
		
		case"css":
			return BaseTest.driver.findElement(By.cssSelector(identifiervalue));
			
		case"id":
			return BaseTest.driver.findElement(By.id(identifiervalue));
		case"name":
			return BaseTest.driver.findElement(By.name(identifiervalue));
			
		default:return null;
			
	
}}
		
		public List<WebElement> getWebElements(String identifiertype,String identifiervalue) {
			
			
			switch(identifiertype) {
			
			case"xpath":
			return BaseTest.driver.findElements(By.xpath(identifiervalue));
			
			case"css":
				return BaseTest.driver.findElements(By.cssSelector(identifiervalue));
				
			case"id":
				return BaseTest.driver.findElements(By.id(identifiervalue));
			case"name":
				return BaseTest.driver.findElements(By.name(identifiervalue));
				
			default:return null;
				
}}}