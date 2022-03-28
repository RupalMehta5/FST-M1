package Selproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Contactus {
	WebDriver driver;

	@Test
	 public void navigate() {
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms/");
		 driver.findElement(By.linkText("Contact")).click();
		 driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Rup Meh");
		 driver.findElement(By.cssSelector("input[type ='email']")).sendKeys("rupmehta@gmail.com");
		 driver.findElement(By.cssSelector("input#wpforms-8-field_3")).sendKeys("Science");
		 driver.findElement(By.xpath("//textarea[contains(@class,'wpforms-field-medium') or contains(@class,'wpforms-field-required')]")).sendKeys("Form complete");
		 driver.findElement(By.xpath("//button[contains(text(),'Send Message')]")).click();
String msg = driver.findElement(By.xpath("//div[contains(@class,'wpforms-confirmation-scroll') or contains(@class,'wpforms-confirmation-container')]")).getText();
System.out.println(msg);
driver.close();
}
}