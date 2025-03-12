package TestCaseDemo;

import java.sql.Driver;
import java.time.Duration;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Browser;
import Excel.LoginData;
import Pages.Page1;
import Pages.Page2;

public class Test2 {

	@BeforeMethod
	public void open() throws Exception {
		Browser.init("test2report");
		Browser.openBrowser();
		Browser.navigateToUrl();
		Browser.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@DataProvider(name = "dp1")
	public Object[][] data() throws Exception {
		Object[][] obj = LoginData.readExcel(0);
		return obj;

	}

	@Test(dataProvider = "dp1", priority = 2)
	public void loginFunctanity(String name, String password, String expected) {

		Page1.UserNameEnter(name);
		Page1.PasswordEnter(password);

		Page1.ClickLogin();

		Assert.assertEquals(Page2.MenuName(), expected);

	}

	@AfterMethod
	public void close() {
		Browser.closeBrowser();
	}

}
/*
 * if(Page1.CheckUsernameField(false)) { if(Page1.CheckPasswordField(false)) {
 * if(Page1.CheckClickingLogin(false)) {
 * Reporter.log("Testcas2 Login Functinality Pass"); } else
 * System.out.println("please click login button"); } else
 * System.out.println("eneter password field"); } else
 * System.out.println("Enetr username filed"); }
 */
