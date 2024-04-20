package Selenium;

public class Call {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		demo obj = new demo();
		
		
		obj.Navigate();
		Thread.sleep(5000);
		obj.Login();
		obj.Button();
		
		Thread.sleep(5000);
		obj.Buzz();
		Thread.sleep(5000);
		obj.Post();
		
		obj.PostButton();
		obj.PostDelete();
		obj.DeletePost();
		obj.Delete();
	}

}
