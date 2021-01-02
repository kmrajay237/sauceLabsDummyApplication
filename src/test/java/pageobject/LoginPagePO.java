package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;

public class LoginPagePO extends BasePage {

	public LoginPagePO(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "user-name")
	private WebElement usernameTextBox;

	public WebElement userNameTextBox() {
		return usernameTextBox;
	}

	@FindBy(id = "password")
	private WebElement passwordTextBox;

	public WebElement passWordTextBox() {
		return passwordTextBox;
	}

	@FindBy(id = "login-button")
	private WebElement loginButton;

	public WebElement loginButton() {
		return loginButton;
	}
	
	@FindBy(xpath="//h3")
	private WebElement errorMessage;
	public WebElement errorMessage() {
		return errorMessage;
	}
}
