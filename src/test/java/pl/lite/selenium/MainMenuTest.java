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

import org.openqa.selenium.*;

public class MainMenuTest {
	
	
	WebDriver driver;
	
	@Before
	public void start() {
		System.out.println("wewnatrz metody start -@before");
		driver=Init.getDriver();		
	}
	
	@Test
	public void mainMenu() {
		//System.out.println("start testu main menu,przed new mp");
		MainPage mp= new MainPage();
		//System.out.println("po new MP, przed  signOnLinkClick");
		
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
		//System.out.println("po new MP, po signOnLinkClick");
		lp.loginAs("admdz", "qwe123");
		
		title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue("Page title is wrong", title.equals(""));;
		Init.sleep(5);
		
		
	}
	
	@After
	public void quit() {
		Init.close();
	}

}
