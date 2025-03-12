package TestCaseDemo;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Browser;
import Pages.Page1;
import ScreenShot.Capture;

public class Test1 {
	@BeforeMethod
	public void open () throws Exception {
		Browser.init("test1report");
		Browser.openBrowser();
		Browser.navigateToUrl();
		
	}
	@DataProvider(name="title")
	public Object[] data() {
		Object[] obj= {"OrangeHRM"};
		return obj;
	}
	@Test(priority = 1,dataProvider = "title")
	public void title(String title) throws Exception {
		Capture.screenShot("Title");
		Assert.assertEquals(Page1.getTitle(),title);
		Thread.sleep(2000);
		Reporter.log("Testcas1 title Assertion Pass");
	}
	@AfterMethod
	public void close() {
		Browser.closeBrowser();
	}
	

}
