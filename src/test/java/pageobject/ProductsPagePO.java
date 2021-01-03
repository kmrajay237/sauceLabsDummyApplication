package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class ProductsPagePO extends BasePage{

	public ProductsPagePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".product_label")
	private WebElement productLabel;
	public WebElement productLabel() {
		return productLabel;
	}

}
