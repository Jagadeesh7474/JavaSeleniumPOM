package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

public class Page1Objects extends Browser{
	static By  adminTextBox = By.xpath("//input[@placeholder='Username']");
	static By passwordTextBox=By.xpath("//input[@placeholder='Password']");
	static By loginButton=By.xpath("//button[@type='submit']");
	
	
	
    /* 
    * Method to get element of search text box and store it
    * 
    */
	public static WebElement adminText()
	{
		/*
		 * WebElement adminBox=driver.findElement(adminTextBox); return adminBox;
		 */
		wait=new WebDriverWait(Browser.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(adminTextBox));
		return driver.findElement(adminTextBox);

	}
	public static WebElement passwordText()
	{
		/*
		 * WebElement PasswordBox=driver.findElement(passwordTextBox); return
		 * PasswordBox;
		 */
		return driver.findElement(passwordTextBox);
	}
	public static WebElement loginButton()
	{
		/*
		 * WebElement login=driver.findElement(loginButton); return login;
		 */
		return driver.findElement(loginButton);
		
		
	}
	
	

}
/*
 * static By searchTextBox = By.id("APjFqb");
 * 
 * 
 * 
 * Method to get element of search text box and store it
 * 
 * 
 * 
 * public static WebElement textBox() {
 * 
 * WebElement element = driver.findElement(searchTextBox);
 * 
 * return element; }
 */