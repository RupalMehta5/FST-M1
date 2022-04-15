package demo_proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Title is :" + driver.getTitle());
		WebElement chkstatus = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(chkstatus.isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(chkstatus.isSelected());
        driver.close();
	}
	}


