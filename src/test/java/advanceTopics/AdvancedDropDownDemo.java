package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedDropDownDemo {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
//		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement advDropDown = driver.findElement(By.xpath("//div[@id='selectOne']"));
		advDropDown.click();
		Thread.sleep(5000);
		WebElement item = driver.findElement(By.id("react-select-3-option-0-3"));
		item.click();
		Thread.sleep(5000);
		driver.close();
	}
}
