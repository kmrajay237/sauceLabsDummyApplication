package advanceTopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TraditionalDropdownGetOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
//		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement singleSelect = driver.findElement(By.id("oldSelectMenu"));
		Select multi=new Select(singleSelect);
		List<WebElement> itemList = multi.getOptions();
//		for (WebElement item : itemList) {
//			System.out.println(item.getText());
//		}
		int len = itemList.size();  //11
		System.out.println("Lenght: "+len);
		for(int i=0;i<=len-1;i++) {  // i=0,1,2,3,4,5,6,7,8,9,10
			System.out.println(itemList.get(i).getText());
		}
		driver.close();
	}

}
