package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import library.Constants;
import pageobject.LoginPagePO;

public class TC_001_launchAppWithValidURL extends BaseTest{

	@Test
	public void tc_001_launchAppWithValidUrl() {
		try {
			Reporter.log("Verifying Valid URL", true);
			String expURL=Constants.validAppURL;
			String actURL=driver.getCurrentUrl();			
			Assert.assertEquals(actURL, expURL);
			
			LoginPagePO loginPage=new LoginPagePO(driver);
			
			WebElement username = loginPage.userNameTextBox();
			boolean trueOrFalse = username.isDisplayed();
			Assert.assertEquals(trueOrFalse, true);
			
			WebElement password = loginPage.passWordTextBox();
			trueOrFalse=password.isDisplayed();
			Assert.assertEquals(trueOrFalse, true);
			
			WebElement loginButton = loginPage.loginButton();
			trueOrFalse=loginButton.isDisplayed();
			Assert.assertEquals(trueOrFalse, true);
			
			
		} catch (Exception e) {
			Assert.fail();
		}
		
	}

}
