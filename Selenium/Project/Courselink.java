package Selproj;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Courselink {
	WebDriver driver;

	@Test
	 public void navigate() {
		 driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms/");
		 driver.findElement(By.linkText("All Courses")).click();
		 List<WebElement> course = driver.findElements(By.xpath("//h3[@class='entry-title']"));
		 System.out.println("Courses number " + course.size());
		 
		 Iterator<WebElement> iterator = course.iterator();
		 while(iterator.hasNext()) {
		String url =iterator.next().getText();
		System.out.println(url);
			 driver.close();
		 }
		 
}
}
