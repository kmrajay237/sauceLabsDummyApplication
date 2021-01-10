package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TraditionalMultiSelectDropDown {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
//		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement multiselect = driver.findElement(By.id("cars"));
		Select multi=new Select(multiselect);
		boolean multiple = multi.isMultiple();
		System.out.println(multiple);  //true
		Thread.sleep(3000);
		multi.selectByIndex(0);  //Volvo
		Thread.sleep(3000);
		multi.selectByIndex(1);  //Saab
		Thread.sleep(3000);
		multi.selectByValue("opel"); //Opel
		Thread.sleep(3000);
		multi.selectByVisibleText("Audi"); //Audi
		Thread.sleep(3000);
		driver.close();
	}
}
