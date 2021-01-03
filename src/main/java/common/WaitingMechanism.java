package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMechanism {
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static WebDriverWait wait=new WebDriverWait(driver, 30);
	
	public static void iselementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void isElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
