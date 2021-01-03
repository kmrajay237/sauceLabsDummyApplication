package testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.CommonClass;
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
			AssertJUnit.assertEquals(actURL, expURL);
			
			LoginPagePO loginPage=new LoginPagePO(driver);
			CommonClass.isElementDisplayed(loginPage.userNameTextBox());
			
			CommonClass.isElementDisplayed(loginPage.passWordTextBox());
			
			CommonClass.isElementDisplayed(loginPage.loginButton());
//			CommonClass.isElementEnabled(loginPage.loginButton());
			
			
		} catch (Exception e) {
			AssertJUnit.fail();
		}
		
	}

}
