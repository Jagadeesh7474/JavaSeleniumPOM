package TestCaseDemo;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Browser;
import Excel.LoginData;
import Locators.Page2Objecets;
import Pages.Page1;
import Pages.Page2;

public class Test3 {
	@BeforeMethod
	public void open () throws Exception {
		Browser.init("test3report");
		Browser.openBrowser();
		Browser.navigateToUrl();
		Browser.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@DataProvider(name="dp2")
	public Object[][] data() throws Exception
	{
		Object[][] obj=LoginData.readExcel(0);
		return obj;
		
	}
	@Test(dataProvider = "dp2",priority = 3)
	public void TestMenu(String name,String password, String expected) throws InterruptedException
	{
		Page1.UserNameEnter(name);
		Page1.PasswordEnter(password);
		Page1.ClickLogin();
		Page2.selectChoise(expected);
		Thread.sleep(2000);
		Assert.assertEquals(Page2Objecets.menuName().getText(), expected);
	}

	
	
	@AfterMethod
	public void close() {
		Browser.closeBrowser();
	}

}
