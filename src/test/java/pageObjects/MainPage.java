package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lite.selenium.Init;

public class MainPage {
	WebDriver driver;
	
	@FindBy(linkText = "CONTACT")
	WebElement contactLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	@FindBy(linkText = "SUPPORT")
	WebElement supportLink;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	public MainPage() {
		driver =Init.getDriver();
		PageFactory.initElements(driver, this);
		//zainicalizowanie guzikow na stronie ktora przedstawia klasa MainPage		
	}
	public void contactLinkClick() {
		contactLink.click();
	}
	
	public void registerLinkClick() {
		registerLink.click();
	}
	
	public void supportLinkClick() {
		supportLink.click();
	}
	
	public void signOnLinkClick() {
		signOnLink.click();
	}

}
