package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
			}
	@Test
	public void testCase1() {
		String title = driver.getTitle();
		System.out.println("title" + title);
		Assert.assertEquals(title, "Target Practice");
	}
	@Test
	public void testCase2() {
	WebElement blackbutton =	driver.findElement(By.className("black"));
	Assert.assertTrue(blackbutton.isDisplayed());
	Assert.assertEquals(blackbutton.getText(), "black");
	}
	@Test(enabled = false)
	public void testCase3() {
		// TODO Auto-generated method stub
		String subHead = driver.findElement(By.className("sub")).getText();
		
	}
	
	@Test
	public void testCase4() {
		throw new SkipException("Skip this testcase");
	}
	
	@AfterTest
	public void afterMethod() {
		driver.close();
	}
	
}
