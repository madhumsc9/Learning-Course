package programmsJava;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchpageforGoogle1 {

	public static void main(String[] args) {

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to Google Search page
		driver.get("https://www.google.com");

		// Find the search input element
		WebElement searchBox = driver.findElement(By.name("q"));

		// Type a search query
		searchBox.sendKeys("ChatGPT");

		// Submit the form
		searchBox.submit();

		// Wait for search results page to load
		// (Note: You might want to use explicit waits here for better synchronization)

		// Validate the search results page title
		String expectedTitle = "ChatGPT - Google Search";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Search Page Title is as expected.");
		} else {
			System.out.println("Search Page Title is not as expected.");
		}

		// Validate the presence of search results
		WebElement resultsStats = driver.findElement(By.id("result-stats"));

		if (resultsStats.isDisplayed()) {
			System.out.println("Search results are displayed.");
		} else {
			System.out.println("No search results found.");
		}

		// Close the browser
		driver.quit();
	}
}