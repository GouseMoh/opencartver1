package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println(" url open successfully");
List< WebElement>images=driver.findElements(By.tagName("img"));
System.out.println("number of images"+images .size());
List<WebElement>linkes=driver.findElements(By.tagName("a"));
System.out.println("number of linkes:"+linkes.size());

	driver.close();
	
	

	
	}
}
