import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!!!");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://Google.com");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	//	driver.findElement(By.cssSelector("#email")).sendKeys("Ravi.singh@gmail.com");
	//	driver.findElement(By.cssSelector("#pass")).sendKeys("SinghJi");
	//	driver.findElement(By.cssSelector("#loginbutton")).click();
		
		driver.quit(); 
	}

}
