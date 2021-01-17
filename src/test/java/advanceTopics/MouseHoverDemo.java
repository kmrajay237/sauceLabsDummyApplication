package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {
	public class HandlingFramesAndDragAndDrop {
		
		public WebDriver driver;
		public Actions action;
		
		@Test
		public void handlingFramesDragDrop() throws Exception{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/");
			WebElement Recruiters = driver.findElement(By.xpath("//div[text()='Recruiters']"));
			action=new Actions(driver);
			action.moveToElement(Recruiters).perform();
			action.pause(5000).perform();
			driver.findElement(By.xpath("(//a[text()='Recruiter Connection'])[1]")).click();
			action.pause(5000).perform();
			driver.quit();
		}

	}
}
