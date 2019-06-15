package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lite.selenium.Init;

public class LoginPage {
	WebDriver driver;
	
	@FindBy( name="userName")
	WebElement userNameInput;
	
	@FindBy( name="password")
	WebElement passwordInput;
	
	@FindBy( name="login")
	WebElement loginButton;
	
	public void loginAs(String login,String passwd) {
		userNameInput.sendKeys(login);
		passwordInput.sendKeys(passwd);
		loginButton.click();
	}
	
	
	
	public LoginPage() {
		driver =Init.getDriver();
		PageFactory.initElements(driver, this);
	}

}
