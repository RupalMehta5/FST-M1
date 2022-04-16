package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
			}
	@Test
	public void exampleTestcase() {
		String title = driver.getTitle();
		System.out.println("title : " + title);	
		Assert.assertEquals("Training Support", title);
	}
	
	
	
	

}
