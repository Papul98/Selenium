package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement Drag =driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
        WebElement Drop =driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
        
        Actions act=new Actions(driver);
        act.dragAndDrop(Drag, Drop).perform();
}
	}

