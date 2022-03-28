package Selproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	@Test
	public void webtitle() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms/");
	String actualwebt1 = driver.getTitle();
	String expwebt1 = "Alchemy LMS – An LMS Application";
	Assert.assertEquals(actualwebt1,expwebt1);
	driver.close();
	

}
}
