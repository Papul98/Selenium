package Selenium;

import java.io.IOException;

public class WebsiteInteractionTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebsiteInteraction obj=new WebsiteInteraction();
		obj.OpenWebsite();
		obj.Login();
		obj.Screenshot();
		obj.LoginButton();
		obj.TakeShot();
		obj.Buzz();
		obj.Post();
        obj.TakeS();
        obj.PostData();
        obj.TakeData();
        
	}

}
