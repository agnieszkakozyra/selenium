package pl.lite.selenium;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ReservationPage;
import pageObjects.ReservationPage2;

import org.openqa.selenium.*;

public class MainMenuTest {
	
	
	WebDriver driver;
	MainPage mp= new MainPage();
	LoginPage lp= new LoginPage();
	//MainPage mp= new MainPage();
	ReservationPage rp=new ReservationPage();
	ReservationPage2 rp2 = new ReservationPage2();
	
	
	@Before
	public void start() {
		System.out.println("wewnatrz metody start -@before");
		driver=Init.getDriver();		
	}
	//@Ignore //do chwilowego zblokowania wykonywania testu
	@Test
	public void mainMenu() {
				
		String title=driver.getTitle();
		System.out.println(title);
		
		mp.contactLinkClick();
		mp.signOnLinkClick();
		//System.out.println("po new MP, po signOnLinkClick");
		mp.supportLinkClick();
		mp.registerLinkClick();
		
		title =driver.getTitle();
		System.out.println(title);
		Init.sleep(1);
	}
	
	@Test
	public void login() {
		String title= driver.getTitle();
		System.out.println(title);
		
		LoginPage lp= new LoginPage();
		MainPage mp= new MainPage();
		
		//System.out.println("przed new Lp");
		
		//System.out.println("po new MP, przed signOnLinkClick");
		mp.signOnLinkClick();
		lp.loginAs("admdz", "qwe123");
		
		title=driver.getTitle();
		System.out.println(title);
		Init.printScr(driver, "mainMenu", "MenuOnly");
		
		Assert.assertTrue("Page title is wrong", title.equals("Find a Flight: Mercury Tours:"));
		Init.sleep(5);
		
		
	}
	@Ignore
	@Test
	public void reservationTest() { 
		mp.signOnLinkClick();
		lp.loginAs("admdz", "qwe123");
		rp.oneWay();
		rp.passengersCount("2");
		rp.from("Frankfurt", "17", "5");
		rp.to("London", "19", "6");
		rp.airline("Blue Skies Airlines");
		rp.serviceBusinessClass();
		rp.continueButtonClick();
		rp2.pass0("Adaś", "Aaa");
		rp2.continueBtnClick();
	}
	
	@After
	public void quit() {
		Init.close();
	}
	
}
