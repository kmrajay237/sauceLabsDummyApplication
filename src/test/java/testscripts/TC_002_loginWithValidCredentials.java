package testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonClass;
import library.BaseTest;
import pageobject.ProductsPagePO;

public class TC_002_loginWithValidCredentials extends BaseTest{
	@Test
	public void tc_002_loginWithValidCredentials() {
		try {
			CommonClass.loginIntoApplication(username, password);
			
			String expInventoryURL=inventoryURL;
			String actInventoryURL=driver.getCurrentUrl();
			AssertJUnit.assertEquals(actInventoryURL, expInventoryURL);
			
			ProductsPagePO productpage=new ProductsPagePO(driver);
			CommonClass.isElementDisplayed(productpage.productLabel());

		} catch (Exception e) {
//			Assert.fail();
		}
	}

}
