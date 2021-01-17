package advanceTopics;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassKeyPressRelease {
	public WebDriver driver;
	public Robot robot;
	
	@Test
	public void handlingFramesDragDrop() throws Exception{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips");
//		WebElement dummyTextBox = driver.findElement(By.xpath("xpath expression"));
		
		robot=new Robot();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
		}
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_UP);
		}
		robot.keyRelease(KeyEvent.VK_UP);
		
//		robot.keyPress(KeyEvent.VK_SHIFT);
//		dummyTextBox.sendKeys("a");
//		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		driver.close();
	}
}
