
package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       

        
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        WebElement SA =driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        WebElement SA2 =driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
        WebElement SA3 =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        WebElement SA4 =driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        WebElement SA5 =driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        
        SA.click();

        Alert alert = driver.switchTo().alert();

        String textonAlter = alert.getText();
        System.out.println(textonAlter);

        alert.accept();
       
        SA2.click();
        SA3.click();
        
        textonAlter = alert.getText();
        System.out.println(textonAlter);
        
        alert.accept();
        
        SA4.click();
        SA5.click();
        
        textonAlter = alert.getText();
        System.out.println(textonAlter);
        
        alert.sendKeys("Automation");
        alert.accept();
	}
	 }

