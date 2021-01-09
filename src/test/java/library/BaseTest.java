package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import common.LogClient;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements Constants{
	
	public static WebDriver driver;
	@Parameters("myBrowser")
	@BeforeMethod
	public void launchBrowser(String myBrowser) {
		LogClient.logClient().info("Launching Chrome Browser");
		if(myBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}else if(myBrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
		}
		
		
		driver.get(validAppURL);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.manage().deleteAllCookies();
		
		driver.close();
	}
}
