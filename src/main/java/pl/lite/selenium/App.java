package pl.lite.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static WebDriver driver;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\programiki\\chromedriver_win32\\chromedriver.exe");
    
        driver=new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.linkText("CONTACT")).click();
        sleep(2);
        driver.findElement(By.linkText("SUPPORT")).click();
        sleep(2);
        driver.findElement(By.linkText("REGISTER")).click();
        sleep(2);
        driver.findElement(By.linkText("SIGN-ON")).click();
        sleep(2);
        driver.quit();
        
    }
    public static void sleep(int seconds) {
    	try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
