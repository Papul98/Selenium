package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	


	
	//Name
//	driver.findElement(By.name("url")).click();
	
	//ID
//	boolean LogoDisplaystatus = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
//	System.out.println( LogoDisplaystatus);
	
	//LinkText & PartialLinkText
//	driver.findElement(By.linkText("Fresh")).click();
//	driver.findElement(By.partialLinkText("esh")).click();
	
	
}
}

