package demo_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com");
				Thread.sleep(2);
				driver.close();
	}

}
