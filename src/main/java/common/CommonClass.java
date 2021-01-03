package common;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import library.BaseTest;
import pageobject.LoginPagePO;

public class CommonClass extends BaseTest{
	
	public static void isElementDisplayed(WebElement element) {
		boolean trueOrFalse = element.isDisplayed();
		Assert.assertEquals(trueOrFalse, true);
	}
	
	public static void isElementSelected(WebElement element) {
		boolean trueOrFalse = element.isSelected();
		Assert.assertEquals(trueOrFalse, true);
	}
	
	public static void isElementEnabled(WebElement element) {
		boolean trueOrFalse = element.isEnabled();
		Assert.assertEquals(trueOrFalse, true);
	}
	
	public static void loginIntoApplication(String username, String password) {
		LoginPagePO loginPage=new LoginPagePO(driver);
		loginPage.userNameTextBox().sendKeys(username);
		loginPage.passWordTextBox().sendKeys(password);
		loginPage.loginButton().click();
	}
	

}
