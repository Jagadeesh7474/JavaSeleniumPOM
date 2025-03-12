package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Browser.Browser;
import Locators.Page1Objects;

public class Page1 extends Browser {

	// Method to return title
	public static String getTitle() {
		

		return driver.getTitle();
	}

	// Method to enter user name
	public static void UserNameEnter(String username) {
		
		/*
		 * WebElement usernameField = Page1Objects.adminText();
		 * usernameField.sendKeys(username);
		 * 
		 */
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try 
		{	
				Page1Objects.adminText().sendKeys(username);
				logger1.log(Status.PASS, "user enterd sucessfully");
		}
		catch(Exception E)
		{
			System.out.println("Username :"+E);
			logger1.log(Status.FAIL, "Failed to enterd sucessfully");
		}
		extent.flush();

	}

	// Method to enter password
	public static void PasswordEnter(String password) {
		
		/*
		 * WebElement passwordField = Page1Objects.passwordText();
		 * passwordField.sendKeys(password);
		 */
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try 
		{	
				Page1Objects.passwordText().sendKeys(password);
				logger1.log(Status.PASS, "Password enterd sucessfully");
		}
		catch(Exception E)
		{
			System.out.println("Username :"+E);
			logger1.log(Status.FAIL, "Password enterd Failed");
		}
		extent.flush();
	}

	// Method to click on the login button
	public static void ClickLogin() {
		/*
		 * WebElement loginButton = Page1Objects.loginButton(); loginButton.click();
		 */
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try
		{
			Page1Objects.loginButton().click();
			logger1.log(Status.PASS, "Login Button Clicked Succesfully");
		}
		catch(Exception E)
		{
			System.out.println("Click :"+E);
			logger1.log(Status.FAIL, "Login Button Clicking Failed");
		}
		extent.flush();

	}

	
}
	
	
	
	
	
	/*
	 * public static String checking_Title(String title) { if
	 * (title.equalsIgnoreCase(driver.getTitle())) { System.out.println("Pass"); }
	 * else System.out.println("Fail"); return title;
	 * 
	 * }
	 * 
	 * // method to check user name filed with data public static boolean
	 * CheckUsernameField(boolean status) {
	 * 
	 * String usernameValue = Page1Objects.adminText().getAttribute("value");
	 * 
	 * if (usernameValue != null && !usernameValue.trim().isEmpty()) {
	 * System.out.println("Username field is filled with data: " + usernameValue);
	 * status = true; } else { }
	 * 
	 * return status;
	 * 
	 * }
	 * 
	 * // method to check password filed with data public static boolean
	 * CheckPasswordField(boolean status) { String passwordValue =
	 * Page1Objects.passwordText().getAttribute("value"); if (passwordValue != null
	 * && !passwordValue.trim().isEmpty()) {
	 * System.out.println("Username field is filled with data: " + passwordValue);
	 * status = true; } else { } return status;
	 * 
	 * }
	 * 
	 * public static boolean CheckClickingLogin(boolean status) { JavascriptExecutor
	 * js = (JavascriptExecutor) driver; js.
	 * executeScript("arguments[0].addEventListener('click', function() { window.clicked = true; });"
	 * , Page1Objects.loginButton()); Boolean isClicked = (Boolean)
	 * js.executeScript("return window.clicked;");
	 * 
	 * if (isClicked != null && isClicked) {
	 * System.out.println("Login button was clicked."); status = true; } else {
	 * System.out.println("Login button was not clicked."); } return status; }
	 */


