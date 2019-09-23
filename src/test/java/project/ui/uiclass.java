package project.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uiclass {
	
	public  void Testing() {
		System.setProperty("webdriver.chrome.driver",
		           "C:\\Users\\pkabadi\\Desktop\\Drivers all\\chromedriver.exe");
		
	
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element =driver.findElement(By.name("q"));
		//Thread.sleep(5000);
		element.sendKeys("Orange");
		element.submit();
		//Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
