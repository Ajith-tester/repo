package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLaunch {
	WebDriver driver ;
	@BeforeMethod
	public void ConfigBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\\\workspace\\\\PlayGroupLogin\\\\driver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.emeetify.com:81/playgroup/admin/login");

	}
	@Test
	public void Login () throws InterruptedException {

		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("colalvirus@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Rajeesh@123#");
		WebElement login=driver.findElement(By.id("submit-button"));
		login.click();
		Thread.sleep(10000);


	}
	@AfterMethod
	public void TerminateBrowser() {
		driver.close();

	}





}
