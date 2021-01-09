package testscripts;

import org.testng.annotations.Test;
import org.testng.Assert;
import common.CommonClass;
import common.LogClient;
import library.BaseTest;
import library.Constants;
import pageobject.LoginPagePO;

public class TC_001_launchAppWithValidURL extends BaseTest{
	
	@Test
	public void tc_001_launchAppWithValidUrl() {
		try {
			LogClient.logClient().warn("This is warning");
//			Reporter.log("Verifying Valid URL", true);
			String expURL=Constants.validAppURL;
			String actURL=driver.getCurrentUrl();
			
			Assert.assertEquals(actURL, expURL);
			
			LoginPagePO loginPage=new LoginPagePO(driver);
			CommonClass.isElementDisplayed(loginPage.userNameTextBox());
			
			
			CommonClass.isElementDisplayed(loginPage.passWordTextBox());
			
			CommonClass.isElementDisplayed(loginPage.loginButton());
//			CommonClass.isElementEnabled(loginPage.loginButton());
			
			
		} catch (Exception e) {
			Assert.fail();
		}
		
	}

}
