package Selproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Complete {
	WebDriver driver;
	

	@Test
	 public void navigate() {
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms/");
		 driver.findElement(By.linkText("My Account")).click();
		 String actitle = driver.getTitle();
		 System.out.println("Actual title" + actitle );
		 String exptitle = "My Account – Alchemy LMS";
		 Assert.assertEquals(actitle,exptitle);
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("user_login")).sendKeys("root");
		 driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		 driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 String logText= driver.findElement(By.xpath("//span[@class='display-name']")).getText();
		 System.out.println("Profile " + logText);
		 String expText = "root";
		 Assert.assertEquals(logText, expText);
		 driver.findElement(By.linkText("All Courses")).click();
		 driver.findElement(By.xpath("//img[contains(@class,'wp-post-image') or contains(@class,'attachment-course-thumb') or contains(@class,'size-course-thumb')]")).click();
		 driver.findElement(By.xpath("//div[@class='ld-item-title']")).click();
		 System.out.println("Lesson title " + driver.getTitle());
		 String actles = driver.getTitle();
		 String exples = "Developing Strategy – Alchemy LMS";
		 Assert.assertEquals(actles, exples);
		 System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Next Lesson')]")).getText());
		 driver.findElement(By.xpath("//span[contains(text(),'Next Lesson')]")).click();
		 driver.close();
		 
		 
		 
}
}
