package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lite.selenium.Init;

public class ReservationPage2 {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement radio2;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	WebElement radio6;
	
	@FindBy(name="reserveFlights")
	WebElement continueBtn;
	
	@FindBy(name="buyFlights")
	WebElement purchase;
	
	@FindBy(name= "passLast0")
	WebElement passLast0;
	
	@FindBy(name="passFirst0")
	WebElement passFirst0;
	
	public void radio2click() {
		radio2.click();
	}
	public void radio6click() {
		radio6.click();
	}

		
	public ReservationPage2() {   
		driver =Init.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	public void continueBtnClick() {
		continueBtn.click();
	}
	public void pass0(String first, String last) {
			passFirst0.sendKeys(first);
			passLast0.sendKeys(last);
	}
	
	public void purchase () {
		purchase.click();
	}
	

}
