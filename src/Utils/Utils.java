package Utils;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	/**
	 * Setea los parametros iniciales del driver para el navegador
	 *
	 * @return El driver del navegador
	 * @throws Exception 
	 */
	public static WebDriver setUpParameters(WebDriver driver, String browser) throws Throwable  {		;
		return (CrossBrowser.setUpBrowser(driver, browser));
	}
	
	/**
	 * Verifica que un WebElement que se busco usando id este visible, para lo cual espera un tiempo definido
	 *
	 * @return Un WebElement segun el criterio de busqueda
	 */
	public static void waitForVisibilityById(WebDriver driver, String Id, int seconds) throws Throwable  {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
    }
	
	/**
	 * Verifica que un WebElement que se busco usando xpath este visible, para lo cual espera un tiempo definido
	 *
	 * @return Un WebElement segun el criterio de busqueda
	 */
	public static WebElement waitForVisibilityByXpath(WebDriver driver, String xpath, int seconds) throws Throwable  {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement WebElement = driver.findElement(By.xpath(xpath));
		return WebElement;
    }


}
