package advanceTopics;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassMouseEvent {
	public WebDriver driver;
	public Robot robot;
	public Actions action;
	
	@Test
	public void handlingFramesDragDrop() throws Exception{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://emicalculator.net/");
			
		robot=new Robot();
		
//		Left Click
//		robot.mousePress(InputEvent.BUTTON1_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_MASK);
//		Thread.sleep(3000);
		
//		Right Click
		robot.mousePress(InputEvent.BUTTON3_MASK);
		Thread.sleep(3000);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		Thread.sleep(3000);
		driver.close();
	}
}
