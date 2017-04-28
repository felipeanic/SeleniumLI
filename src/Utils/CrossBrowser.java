package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CrossBrowser {

	/**
	 * Verifica segun el parametro broser el tipo de browser a setear para la ejecucion
	 *
	 */
	public static WebDriver setUpBrowser(WebDriver driver, String browser) throws Throwable  {
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "extras/drivers/chromedriver_win32/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--test-type");
			options.addArguments("--start-maximized");		
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;			
		}		
		else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "extras/drivers/IE/IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();			
			capabilities.setCapability("nativeEvents", false);    
			capabilities.setCapability("unexpectedAlertBehaviour", "accept");
			capabilities.setCapability("ignoreProtectedModeSettings", true);
			capabilities.setCapability("disable-popup-blocking", true);
			capabilities.setCapability("enablePersistentHover", true);
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;				
		}		
		else{
			Log.error("El browser no es correcto");
			return driver;
		}		
	}
}
