package TestCaseDemo;

import Browser.Browser;
import Pages.Page1;
import Pages.Page2;
import ScreenShot.Capture;

public class Demo {
	public static void main(String[] args)  {
		try {
			Browser.openBrowser();
			Browser.navigateToUrl();
			Thread.sleep(3000);
			//Page1.checking_Title("OrangeHRM");
			Page1.UserNameEnter("Admin");
			Page1.PasswordEnter("admin123");
			//Capture.screenShot("Home");
			Page1.ClickLogin();
			
			Thread.sleep(3000);
			//Page2.userBox("Thanh Vo");
			Page2.selectChoise("Directory");
			
			Browser.closeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
