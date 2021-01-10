package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TraditionalDropDownSelectByVisibleText {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
//		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement oldstyle = driver.findElement(By.id("oldSelectMenu"));
//		oldstyle.click();
		Select select=new Select(oldstyle);
		boolean val = select.isMultiple();
		System.out.println(val);  //false
		Thread.sleep(2000);
		select.selectByVisibleText("Yellow");   //yellow
		Thread.sleep(2000);
		driver.close();
	}
}
