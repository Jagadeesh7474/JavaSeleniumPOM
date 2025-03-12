package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

public class Page2Objecets extends Browser{
	
	
	static By searchResults=By.xpath("//ul[@class='oxd-main-menu']/li");
	static By userNames=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p");
	static By menuName=By.xpath("//h6[normalize-space()='Dashboard']");
	public static List<WebElement> select(){
		
		List<WebElement> list= driver.findElements(searchResults);
		return list;
		
	}
	public static WebElement checking_Username()
	{
		/*
		 * WebElement namebox=driver.findElement(userNames); return namebox;
		 */
		wait=new WebDriverWait(Browser.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(userNames));
		return driver.findElement(userNames);

	}
	public static WebElement menuName()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(menuName));
		return driver.findElement(menuName);
	}



}
