package base;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter sp;
	public static ExtentTest logger;

	@BeforeTest
	public void beforeTestMethod() {

		sp = new ExtentSparkReporter(
				System.getProperty("user.dir") + File.separator + "reports" + File.separator + "selenium.html");
		extent = new ExtentReports();
		extent.attachReporter(sp);
		// extent.setSystemInfo("HostName", null);
		// extent.setSystemInfo("UserName", null);

		sp.config().setTheme(Theme.DARK);
		sp.config().setDocumentTitle("Automation Report");
		sp.config().setReportName("Automation test results");
		sp.config().setTimeStampFormat("dd-MM-YYYY hh:mm:ss");
		sp.config().setCss("background-color: #24d5d8");

	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethodMethod(String browser, Method testMethod) {

		logger = extent.createTest(testMethod.getName());
		setUpDriver(browser);
		driver.manage().window().maximize();
		driver.get("url");		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterMethod

	public void AfterMethodMethod(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " -Test case failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " -Test case failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " -Test case skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " -Test case passed", ExtentColor.GREEN));
		}
		driver.quit();

	}

	@AfterTest
	public void AfterTestMethod() {
		extent.flush();

	}

	private void setUpDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

}
}