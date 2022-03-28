package Selproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Firstbox {
	WebDriver driver;

	@Test
	 public void firstinfobox() {
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms/");
		 String actwebhead = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]")).getText();
		 String expwebhead = "Actionable Training";
		 Assert.assertEquals(actwebhead,expwebhead);
		 driver.close();

}
}
