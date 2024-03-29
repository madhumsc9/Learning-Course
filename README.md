package restAssuredDemos;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.File;

import org.json.JSONObject;



public class Apiutils {
	
	
	public static ExtentReports extent;
	public static ExtentSparkReporter sp;
	public static ExtentTest test;

    public static void main(String[] args) {
    	
    	
    	sp = new ExtentSparkReporter(System.getProperty("user.dir") +File.separator+ "reports"+File.separator+"RestAssured.html");
		extent = new ExtentReports();
		extent.attachReporter(sp);
	
		
		sp.config().setTheme(Theme.DARK);
		sp.config().setDocumentTitle("Automation Report");
		sp.config().setReportName("Automation test results");
		sp.config().setTimeStampFormat("dd-MM-YYYY hh:mm:ss");
		sp.config().setCss("background-color: #24d5d8");
		
		extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("Browser Version", "112.0");
        extent.setSystemInfo("OS", "Windows 10");
        
        
     
//        System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Admin\\eclipse-workspace\\RestAssureddemo\\Drivers\\chromedriver.exe");
//        
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

//        // Get browser information
//        
//        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
//        String browserName = caps.getBrowserName();
//        String browserVersion = caps.getBrowserVersion();
//
//        // Get platform information
//        String platform = System.getProperty("os.name");
//
//        // Logging browser and platform information to extent report
//        test.info("Browser Name: " + browserName);
//        test.info("Browser Version: " + browserVersion);
//        test.info("Platform: " + platform);
		 test = extent.createTest("restAssured");
		
		 
		
        try {
            RestAssured.baseURI = "https://reqres.in/";
            String str = "api/users";
            
           
            JSONObject requestParams = new JSONObject();
            requestParams.put("name", "John");
            requestParams.put("job", "tester");
            
            RequestSpecification request = RestAssured.given();
            request.body(requestParams.toString());
            request.header("Content-Type", "application/json");

            Response response = request.post(str);
            test.log(Status.PASS,"StatusCode :"+response.getStatusCode() );
            test.log(Status.PASS,"\n Response JSON Body: " + response.getBody().asString());
            test.log(Status.PASS,"\n response content type:"+response.contentType());
           
            
            

            
            //System.out.println("\n Status Code: " + response.getStatusCode());
            //System.out.println("\n Response JSON Body: " + response.getBody().asString());

        } catch (Exception ex) {
            System.out.println("WARNING: " + ex.getMessage() + " In API Util class file.");
            
        }extent.flush();
    }
}
