package Selproj;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	
 @Test
 public void webhead() {
	 driver = new FirefoxDriver();
	 driver.get("https://alchemy.hguy.co/lms/");
	 String actwebhead = driver.findElement(By.xpath("//h1[contains(text(),'Experts')]")).getText();
	 String expwebhead = "Learn from Industry Experts";
	 Assert.assertEquals(actwebhead,expwebhead);
	 driver.close();
	 
	 
 }
	
}
