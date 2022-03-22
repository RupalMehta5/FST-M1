package demo_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String titlepage = driver.getTitle();
		System.out.println(titlepage);
		WebElement WebID =driver.findElement(By.id("about-link"));
		System.out.println(WebID.getText());
		WebElement WebClass = driver.findElement(By.className("green"));
		System.out.println(WebClass.getText());
		WebElement WebCs = driver.findElement(By.cssSelector("a[id='about-link']"));
		System.out.println(WebCs.getText());
		WebElement Weblink = driver.findElement(By.linkText("About Us"));
		System.out.println(Weblink);
		System.out.println(Weblink.getText());
		driver.close();
		
		

	}

}
