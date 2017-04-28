package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utils.Log;
import Utils.Utils;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	private static WebDriver driver = null;
	private String[] browser = {"Chrome", "IE"};
	private int browserFlag = 1;
	
	/**
	* Setea los parametros iniciales de cada escenario de prueba
	 * @throws Exception 
	*
	*/
	@Before
    public void beforeScenario() throws Throwable  {
		driver = Utils.setUpParameters(driver, browser[browserFlag-1]);
		Log.startTestCase();
    }
	
	@Given("^Usuario esta en el Home Page$")
	public void usuario_esta_en_el_Home_Page() throws Throwable {		
		driver.get("http://www.linkedin.com");
		Utils.waitForVisibilityById(driver, "login-email",1000);		
		WebElement WebElement = driver.findElement(By.id("login-email"));;			
		Assert.assertEquals(true, WebElement.isDisplayed());
		Log.info("Home Page cargada");
		//throw new PendingException();
	}

	@When("^Usuario ingresa \"([^\"]*)\" y \"([^\"]*)\" validos$")
	public void usuario_ingresa_y_validos(String username, String password) throws Throwable {
		Utils.waitForVisibilityById(driver, "login-email",10);
		driver.findElement(By.id("login-email")).sendKeys(username);		
		driver.findElement(By.id("login-password")).sendKeys(password); 
		driver.findElement(By.id("login-submit")).click();		
		WebElement WebElement = driver.findElement(By.id("nav-settings__dropdown-trigger"));			
		Assert.assertEquals(true, WebElement.isDisplayed());
		Log.info("Login con credenciales validas exitoso");
	}

	@Then("^Se despliega el mensaje: Login y Ver Perfil Exitoso$")
	public void se_despliega_el_mensaje_Login_y_Ver_Perfil_Exitoso() throws Throwable {			  
		Utils.waitForVisibilityById(driver, "extended-nav-search",10);
		WebElement WebElement = driver.findElement(By.id("extended-nav-search"));
		Actions actions = new Actions(driver);
		actions.moveToElement(WebElement).click();
		String textToSearch = "Raul Collantes";
		actions.sendKeys(textToSearch).build().perform();
		Thread.sleep(2000); 
		actions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(textToSearch).build().perform();		
		WebElement = Utils.waitForVisibilityByXpath(driver, ".//*[@id='profile-wrapper']/div[4]/div[1]", 10);
		Assert.assertEquals(true, WebElement.isDisplayed());
		Log.info("Ver perfil exitoso");		
	}
	
	@When("^Usuario ingresa \"([^\"]*)\" y \"([^\"]*)\" no validos$")
	public void usuario_ingresa_y_no_validos(String username, String password) throws Throwable {
		Utils.waitForVisibilityById(driver, "login-email",10);
		driver.findElement(By.id("login-email")).sendKeys(username);
		driver.findElement(By.id("login-password")).sendKeys(password); 
		driver.findElement(By.id("login-submit")).click();
		Log.info("Login con credenciales no validas");
	}

	@Then("^Se despliega el mensaje: Login no exitoso$")
	public void se_despliega_el_mensaje_Login_no_exitoso() throws Throwable {
		WebElement WebElement = Utils.waitForVisibilityByXpath(driver, ".//*[@id='global-alert-queue']/div/p/strong", 10);
		String textToSearch= WebElement.getText();		
		Assert.assertEquals("Please correct the marked field(s) below.", textToSearch);
		Log.info("Login no exitoso");
		Thread.sleep(1000);		
	}
	
	/**
	* Finaliza las acciones necesarias al terminar cada escenario de prueba
	*
	*/
	@After
    public void afterScenario() throws Throwable  {
		driver.get("https://www.linkedin.com/m/logout/");
		Log.endTestCase();
		driver.quit();
    }
}
