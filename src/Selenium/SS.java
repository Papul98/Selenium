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

public class SS {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        
        WebElement un =driver.findElement(By.xpath("//input[@placeholder='Username']"));
        un.sendKeys("Admin");

        WebElement pd =driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pd.sendKeys("admin123");
       
        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);
        File path= new File("D:\\Screenshot\\Before Login.png");

        FileUtils.copyFile(src,path);
        
        WebElement lb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        lb.click();
        
       Thread.sleep(5000);
       TakesScreenshot tss = (TakesScreenshot) driver;

       File src1 = tss.getScreenshotAs(OutputType.FILE);
       File destination= new File("D:\\Screenshot\\After Login.png");

        FileUtils.copyFile(src1,destination);
        
        Thread.sleep(5000);
        WebElement nv =driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
        nv.click();

        Thread.sleep(5000);
        WebElement pt =driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
        pt.sendKeys("Automation is Cool");
        
        TakesScreenshot tst = (TakesScreenshot) driver;

        File src2 = tst.getScreenshotAs(OutputType.FILE);
        File path1= new File("D:\\Screenshot\\Before Post.png");

        FileUtils.copyFile(src2,path1);
        
        Thread.sleep(5000);
        WebElement pb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        pb.click();
        
        TakesScreenshot ts1 = (TakesScreenshot) driver;

        File src3 = ts1.getScreenshotAs(OutputType.FILE);
        File path2= new File("D:\\Screenshot\\After Post.png");

        FileUtils.copyFile(src3,path2);

        
        driver.quit();
	}

}
