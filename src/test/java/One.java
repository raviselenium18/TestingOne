import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class One {

	/*
	 * System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	 * driver = new FirefoxDriver();
	 * static String driverPath = "IE driver path";
	 */

	static String driverPath = "D:\\Software\\Java\\jars\\";
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("Hello Sweta Ji");
		System.out.println("launching IE browser !!");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// WebDriver driver = new FirefoxDriver();
	@Test
	public void add() {
		System.out.println("Add");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\Software\\Java\\jars\\chromedriver.exe");
		driver.get("https://facebook.com");

		driver.findElement(By.cssSelector("#email")).sendKeys("testing@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Testing123!");
		driver.findElement(By.cssSelector("#loginbutton")).click();

	}

	@Test
	public void multiply() {
		System.out.println("Multiply");
		//driver.quit();
	}
}
