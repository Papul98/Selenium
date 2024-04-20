package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	

	WebDriver driver = new ChromeDriver();
	
	void Navigate() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	void Login() {
		
		
		WebElement un =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		un.sendKeys("Admin");

		WebElement pd =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pd.sendKeys("admin123");
	}
	
	void Button() {
		WebElement lb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		lb.click();
	}
	void Buzz() {
		
		WebElement nv =driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		nv.click();
	}
	
	void Post() {
		WebElement pt =driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		pt.sendKeys("Mavan Project");
		
	}
	
	void PostButton() {
		
		WebElement pb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		pb.click();
//		driver.quit();
	}
	
	void PostDelete() {
		WebElement PD =driver.findElement(By.xpath("//div[@class='orangehrm-buzz-newsfeed']//div[1]//div[1]//div[1]//div[1]//div[2]//li[1]//button[1]//i[1]"));
		PD.click();
	}
	
	void DeletePost() {
		WebElement DP =driver.findElement(By.xpath("//p[normalize-space()='Delete Post']"));
		DP.click();
	}
	
	void Delete() {
		WebElement D =driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']"));
		D.click();
	}
	}


