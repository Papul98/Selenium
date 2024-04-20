package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://uncodemy.com/");
        Thread.sleep(5000);
        WebElement Cat =driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
        WebElement St =driver.findElement(By.xpath(" //a[@href='#'][normalize-space()='Software Testing']"));
        
        Actions act=new Actions(driver);
        act.moveToElement(Cat).perform();
        act.moveToElement(St).perform();
        
        WebElement Manual =driver.findElement(By.xpath(" //a[normalize-space()='Manual Testing']"));
        Manual.click();
}
	}
