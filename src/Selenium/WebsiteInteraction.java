package Selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteInteraction {
	
	WebDriver driver = new ChromeDriver();
    void OpenWebsite() throws InterruptedException {
		
		driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 
	}
	 
	 void Login() {
		 WebElement un =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 un.sendKeys("Admin");
		 
		 WebElement pd =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 pd.sendKeys("admin123");
		 
	 }
	 
	 void Screenshot() throws IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;

	        File src  = ts.getScreenshotAs(OutputType.FILE);
	        File path= new File("D:\\Screenshot\\Before Login.png");
	        FileUtils.copyFile(src,path);
	 }
	 
	 void LoginButton() {
		 WebElement lb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	        lb.click();
	 }
	 
	 void TakeShot() throws IOException, InterruptedException {
		 Thread.sleep(5000);
		 TakesScreenshot ts = (TakesScreenshot) driver;

	        File src1 = ts.getScreenshotAs(OutputType.FILE);
	        File path1= new File("D:\\Screenshot\\After Login.png");
	        FileUtils.copyFile(src1,path1);
	 }
	 
	 void Buzz() throws InterruptedException {
	 Thread.sleep(5000);
     WebElement nv =driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
     nv.click();
     
	 }
	 
	 void Post() throws InterruptedException {
		
		 Thread.sleep(5000);
		 WebElement pt =driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	        pt.sendKeys("Automation is Cool");
	 }
	 
	 void TakeS() throws IOException, InterruptedException {
		 Thread.sleep(5000);
		 TakesScreenshot ts2 = (TakesScreenshot) driver;

	        File src2 = ts2.getScreenshotAs(OutputType.FILE);
	        File path2= new File("D:\\Screenshot\\Before Post.png");
	        FileUtils.copyFile(src2,path2); 
	 }
	 
	 void PostData() { 
	 WebElement pb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
     pb.click();
     
	 }
	 
	 void TakeData() throws IOException, InterruptedException {
		 Thread.sleep(5000);
		 
     TakesScreenshot ts3 = (TakesScreenshot) driver;

     File src3 = ts3.getScreenshotAs(OutputType.FILE);
     File path3= new File("D:\\Screenshot\\After Post.png");

     FileUtils.copyFile(src3,path3);

     
     driver.quit();
}}
