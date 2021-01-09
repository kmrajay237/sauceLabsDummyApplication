package testscripts;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.apache.log4j.Logger;
import common.CommonClass;
import library.BaseTest;
import pageobject.ProductsPagePO;

public class TC_002_loginWithValidCredentials extends BaseTest{
	public static Logger logger=Logger.getLogger(TC_002_loginWithValidCredentials.class);
	@Test
	public void tc_002_loginWithValidCredentials() {
		try {
			logger.info("Login into Application with Valid Credential");
			CommonClass.loginIntoApplication(username, password);
			
			String expInventoryURL=inventoryURL;
			String actInventoryURL=driver.getCurrentUrl();
			Assert.assertEquals(actInventoryURL, expInventoryURL);
			
			ProductsPagePO productpage=new ProductsPagePO(driver);
			CommonClass.isElementDisplayed(productpage.productLabel());

		} catch (Exception e) {
//			Assert.fail();
		}
	}

}
