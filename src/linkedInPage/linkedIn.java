package linkedInPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class linkedIn {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Info/Eclipse/workspace/LinkedIn_project/extras/drivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("--test-type");
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.linkedin.com");
		
		driver.findElement(By.id("login-email")).sendKeys("felipe.anic@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("ZoSi3251."); 
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(5000);
		
		WebElement WebElement = driver.findElement(By.id("extended-nav-search"));
		Actions actions = new Actions(driver);
		actions.moveToElement(WebElement).click();			
		actions.sendKeys("raul collantes").build().perform();
		
		Thread.sleep(2000);			
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(8000);
		
		System.out.println("Login y Ver Perfil Exitoso");
		
		driver.get("https://www.linkedin.com/m/logout/");
		Thread.sleep(4000);
		
		driver.quit();
	}

}
