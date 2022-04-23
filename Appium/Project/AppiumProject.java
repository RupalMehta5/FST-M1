import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumProject {
		    // Declare Android driver
	    
	    AndroidDriver<MobileElement> driver;
	    WebDriverWait wait;

	  
	    	@BeforeClass
	        public void setup() throws MalformedURLException {
	            DesiredCapabilities caps = new DesiredCapabilities();
	            caps.setCapability("deviceName", "Pixel_4_API_28");
	            caps.setCapability("platformName", "Android");
	            caps.setCapability("automationName", "UiAutomator2");
	            caps.setCapability("appPackage", "com.google.android.apps.tasks");
	            caps.setCapability("appActivity", ".ui.TaskListsActivity");
	            caps.setCapability("noReset", true);
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        
	       // wait = new WebDriverWait(driver, 20);
	    }
	   /* @Test
	    public void chromeact() {
	    	driver.get("https://www.training-support.net/selenium");
	    	 //wait = new WebDriverWait(driver, 10);
	    	//MobileElement todolist = driver.findElementByXPath("//android.widget.Button[@text='Get Started!']");
	    	// wait = new WebDriverWait(driver, 10);
	    	//MobileElement todolist = driver.findElementByClassName("android.widget.Button");
	    	//todolist.click();
	    	//System.out.println(todolist.getText());
	    	MobileElement todolist1 = driver.findElementByXPath("//android.widget.Button[@text='Login']");
	    	todolist1.click();
	    	
	    }*/
	    @Test
	    public void googleTask1() throws InterruptedException {
	        driver.findElementByAccessibilityId("Create new task").click();
	        Thread.sleep(1000);
	        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
	        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	        String task1 = driver.findElementByXPath("//android.widget.TextView[@text ='Complete Activity with Google Tasks']").getText();
	        //assertion
	        Assert.assertEquals("Complete Activity with Google Tasks" , task1);
	    }
	    @Test
	    public void googleTask2() throws InterruptedException {
	        driver.findElementByAccessibilityId("Create new task").click();
	        Thread.sleep(1000);
	        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
	        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	        String task2 = driver.findElementByXPath("//android.widget.TextView[@text ='Complete Activity with Google Keep']").getText();
	        //assertion
	        Assert.assertEquals("Complete Activity with Google Keep" , task2);
	    }
	    @Test
	    public void googleTask3() throws InterruptedException {
	        driver.findElementByAccessibilityId("Create new task").click();
	        Thread.sleep(1000);
	        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
	        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	        String task3 = driver.findElementByXPath("//android.widget.TextView[@text ='Complete the second Activity Google Keep']").getText();
	        //assertion
	        Assert.assertEquals("Complete the second Activity Google Keep" , task3);
	    }
	    @Test
	    public void googleKeep() throws InterruptedException {
	        driver.findElementByAccessibilityId("New text note").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.EditText[@text = 'Title']").sendKeys("Project");
	        //((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	        driver.findElementByXPath("//android.widget.EditText[@text = 'Note']").sendKeys("Helloo World!");
	        driver.findElementByAccessibilityId("Open navigation drawer").click();
	        //assertion
	        String title1 = driver.findElementByXPath("//android.widget.TextView[@text = 'Project']").getText();
	        String description1 = driver.findElementByXPath("//android.widget.TextView[@text = 'Helloo World!']").getText();

	        Assert.assertEquals(title1,"Project");
	        Assert.assertEquals(description1,"Helloo World!");
	        
	    }
	    @Test
	    public void googleKeep1() throws InterruptedException {
	        driver.findElementByAccessibilityId("New text note").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.EditText[@text = 'Title']").sendKeys("Project1");
	        
	        driver.findElementByXPath("//android.widget.EditText[@text = 'Note']").sendKeys("Helloo World!");

	        driver.findElementByAccessibilityId("Multi-column view").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]").click();
	        driver.findElementByAccessibilityId("Open navigation drawer").click();
	       
	        String title1 = driver.findElementByXPath("//android.widget.TextView[@text = 'Project1']").getText();
	        String description1 = driver.findElementByXPath("//android.widget.TextView[@text = 'Helloo World!']").getText();
	        String rem = driver.findElementByXPath("//android.widget.TextView[@text = 'Today, 6:00 PM']").getText();
	        Assert.assertEquals(title1,"Project1");
	        Assert.assertEquals(description1,"Helloo World!");
	        Assert.assertEquals(rem,"Today, 6:00 PM");

	    }
	    @Test
	    public void googleTest() throws InterruptedException {
	        driver.get("https://www.training-support.net/selenium");
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.Button[@text = 'Get Started!']").click();
	        Thread.sleep(1000);
	        //scroll
	        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
	        driver.findElement(
	                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(text(\"To-Do List\"))")).click();
	        Thread.sleep(1000);
	        driver.findElementByClassName("android.widget.EditText").sendKeys("Add tasks to list");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
	        driver.findElementByClassName("android.widget.EditText").sendKeys("Get number of tasks");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
	        driver.findElementByClassName("android.widget.EditText").sendKeys("Clear the list");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.view.View[@text = 'Add tasks to list']").click();
	        driver.findElementByXPath("//android.view.View[@text = 'Get number of tasks']").click();
	        driver.findElementByXPath("//android.view.View[@text = 'Clear the list']").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]").click();
	        Thread.sleep(1000);
	    }
	    @Test
	    public void correct() throws InterruptedException {
	        driver.get("https://www.training-support.net/selenium");
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.Button[@text = 'Get Started!']").click();
	        Thread.sleep(1000);
	        //scroll
	        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
	        driver.findElement(
	                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(text(\"Login Form\"))")).click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
	        Thread.sleep(1000);
	        String title = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]").getText();
	        //Assertion
	        Assert.assertEquals("Welcome Back, admin",title);
	    }
	    @Test
	    public void incorrect() throws InterruptedException {
	        driver.get("https://www.training-support.net/selenium");
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.Button[@text = 'Get Started!']").click();
	        Thread.sleep(1000);
	        //scroll
	        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
	        driver.findElement(
	                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(text(\"Login Form\"))")).click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("passworddd");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
	        Thread.sleep(1000);
	        String title1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]").getText();
	        //Assertion
	        Assert.assertEquals("Invalid Credentials",title1);
	    }
	    @Test
	    public void correct1() throws InterruptedException {
	        driver.get("https://www.training-support.net/selenium");
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.Button[@text = 'Get Started!']").click();
	        Thread.sleep(1000);
	        //scroll
	        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
	        driver.findElement(
	                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(text(\"Popups\"))")).click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.Button[@text = 'Sign In']").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("password");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
	        Thread.sleep(1000);
	        String title = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]").getText();
	        //Assertion
	        Assert.assertEquals("Welcome Back, admin",title);
	        //incorrect credential
	        driver.findElementByXPath("//android.widget.Button[@text = 'Sign In']").click();
	        Thread.sleep(1000);
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("passworddd");
	        driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
	        Thread.sleep(1000);
	        String title1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]").getText();
	        //Assertion
	        Assert.assertEquals("Invalid Credentials",title1);
	    }
	    @AfterClass
	    public void afterClass(){
	        driver.quit();
	    }
	}


