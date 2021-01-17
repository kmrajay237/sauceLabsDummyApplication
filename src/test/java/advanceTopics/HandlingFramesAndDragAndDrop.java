package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFramesAndDragAndDrop {
	
	public WebDriver driver;
	public Actions action;
	
	@Test
	public void handlingFramesDragDrop() throws Exception{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
		Thread.sleep(2000);
		action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
//		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
