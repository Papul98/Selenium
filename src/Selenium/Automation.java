package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//driver.manage().window().maximize();
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
Thread.sleep(5000);
//driver.quit();
WebElement un =driver.findElement(By.xpath("//input[@placeholder='Username']"));
un.sendKeys("Admin");

WebElement pd =driver.findElement(By.xpath("//input[@placeholder='Password']"));
pd.sendKeys("admin123");

WebElement lb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
lb.click();

//Thread.sleep(5000);
//driver.navigate().back();
//Thread.sleep(5000);
//driver.navigate().forward();
Thread.sleep(5000);
WebElement nv =driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
nv.click();

Thread.sleep(5000);
WebElement pt =driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
pt.sendKeys("Auto");

WebElement pb =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
pb.click();

Thread.sleep(2000);
driver.quit();
	}

}
