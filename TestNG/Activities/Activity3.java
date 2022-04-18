package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@Test
	public void loginTest() {
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
		String loginmsg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		Assert.assertEquals(loginmsg, "Welcome Back, admin");
				
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	

}
