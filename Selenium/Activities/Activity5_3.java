package demo_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Title is :" + driver.getTitle());
		WebElement txten =driver.findElement(By.id("input-text"));
		System.out.println("Textbox"  + txten.isEnabled());
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("Textbox"  + txten.isEnabled());
		driver.close();
 
		
		
	}

}
