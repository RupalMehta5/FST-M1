package demo_proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("violet")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement el =driver.findElement(By.xpath("//h1[contains(text(),'HELLO!')]"));
		System.out.println(wait.until(ExpectedConditions.visibilityOf(el)).getText());
		WebElement late = driver.findElement(By.xpath("//div[@id='ajax-content']/h3"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']/h3"), "I'm late!"));
		String latetext = driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
		System.out.println(latetext);
		driver.close();
		
		
		
	}

}
