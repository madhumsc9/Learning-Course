package interviewQuestions;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginAttemptCountDemo {

	public static void main(String[] args) {

		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"), DesiredCapabilities.chrome());

		// Replace with your actual login page URL
		driver.get("https://example.com/login");

		// Replace with your login credentials
		String username = "yourUsername";
		String password = "yourPassword";

		int loginAttempts = 3; // Set the number of login attempts

		for (int attempt = 1; attempt <= loginAttempts; attempt++) {
			System.out.println("Login Attempt #" + attempt);

			// Perform login
			login(driver, username, password);

			// Check if login was successful
			if (isLoginSuccessful(driver)) {
				System.out.println("Login successful!");
				break; // Break out of the loop if login is successful
			} else {
				System.out.println("Login failed. Retrying...");
			}

			// You might want to wait between login attempts
			// You can use WebDriverWait or Thread.sleep, depending on your needs
		}

		// Close the browser session
		driver.quit();
	}

	private static void login(WebDriver driver, String username, String password) {

		// Replace with the actual locators of your username and password fields

		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}
}
