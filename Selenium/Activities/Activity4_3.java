package demo_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		System.out.println("Title is :" + driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
		String fifthheardercolor = driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getCssValue("color");
		System.out.println("Fifth hearder color" + fifthheardercolor);
		String violetcolor = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
		System.out.println("Violet color class " + violetcolor);
		String greybutton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Grey button " + greybutton);
		driver.close();
	}

}
