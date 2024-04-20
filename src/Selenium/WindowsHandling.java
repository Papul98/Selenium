package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
     driver.findElement(By.xpath("//a[normalize-space()='Instagram']")).click();
     
     String P = driver.getWindowHandle();
     System.out.println(P);
     
    Set<String> c = driver.getWindowHandles();
    System.out.print(c);
     
    for(String v:c) {
    	if(!(P.equals(v))) {
    		driver.switchTo().window(v);
    	}
    } 
     
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Papul");
     
}}
	
