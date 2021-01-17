package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipsDemo {
	public WebDriver driver;
	public Actions action;
	
	@Test
	public void handlingFramesDragDrop() throws Exception{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips");
		WebElement greenButton = driver.findElement(By.id("toolTipButton"));
		action=new Actions(driver);
		action.moveToElement(greenButton).perform();
		Thread.sleep(5000);
		WebElement toolTips = driver.findElement(By.cssSelector(".tooltip-inner"));
		
		System.out.println("Tool Tips Text: "+toolTips.getText());
		if (toolTips.isDisplayed()) {
			System.out.println("Tool Tips is displaying");
		} else {
			System.out.println("Tool Tips is not displaying");
		}
		driver.close();
	}

}
