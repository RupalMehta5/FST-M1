package demo_proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Title is :" + driver.getTitle());
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox displayed" + chkbox.isDisplayed());
		WebElement togglechkbox = driver.findElement(By.cssSelector("button#toggleCheckbox"));
		togglechkbox.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(chkbox));
		System.out.println("Checkbox displayed" + chkbox.isDisplayed());
		togglechkbox.click();
		wait.until(ExpectedConditions.visibilityOf(chkbox));
		System.out.println("Checkbox displayed" + chkbox.isDisplayed());
		chkbox.click();
		
		
		
		
				

	}

}
