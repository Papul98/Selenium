package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement Drag =driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement Drop =driver.findElement(By.xpath("//div[@id='trash']"));
        WebElement Fram =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        
        driver.switchTo().frame(Fram);
        Thread.sleep(2000);
        Actions act=new Actions(driver);
      //  Thread.sleep(2000);
        act.dragAndDrop(Drag, Drop).perform();
        
        driver.quit();
}

}
