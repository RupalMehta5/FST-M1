package Selproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Navigateanother {
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
		 driver.close();
}
}
