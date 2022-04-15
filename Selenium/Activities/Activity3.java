package demo_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String titlepage = driver.getTitle();
		System.out.println(titlepage);
		driver.findElement(By.id("firstName")).sendKeys("Rups");
		driver.findElement(By.id("lastName")).sendKeys("Shah");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("rupmehta@in.ibm.com");
		driver.findElement(By.id("number")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value= 'submit']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Message accept");
		driver.close();
		
		
		
		
	}
	
}
