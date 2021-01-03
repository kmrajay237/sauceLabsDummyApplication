package testscripts;

import org.testng.annotations.Test;
import common.CommonClass;
import library.BaseTest;
import pageobject.LoginPagePO;

public class TC_003_loginWithInValidUserNameAndValidPassword extends BaseTest{
	@Test
	public void tc_003_loginWithInValidUserNameAndValidPassword() {
		try {
			CommonClass.loginIntoApplication(invalidUsername, password);
			
			LoginPagePO loginpage=new LoginPagePO(driver);
//			Thread.sleep(3000);
//			WaitingMechanism.isElementVisible(loginpage.errorMessage());
			CommonClass.isElementDisplayed(loginpage.errorMessage());
		} catch (Exception e) {
			
		}
	}

}
