package demo_proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args)  throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("Title is :" + driver.getTitle());
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rups");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Meh");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@ibm.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("0123456789");
		driver.findElement(By.className("green")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.switchTo().alert().accept();
		System.out.println("Form submitted");
		driver.close();
		

	}

}
