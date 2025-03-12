package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import Browser.Browser;
import Locators.Page1Objects;
import Locators.Page2Objecets;

public class Page2 extends Browser {
	public static void selectChoise(String choise) {
		
		
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		

		try {
			List<WebElement> list = Page2Objecets.select();
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getText().equalsIgnoreCase(choise))

				{

					list.get(i).click();
					logger1.log(Status.PASS, "Slecting choise in search bar sucessfully");

					break;
					

				}
			}
		} catch (Exception e) {
			System.out.println("Click: " + e);
			logger1.log(Status.PASS, "Slecting choise in search bar is failed");
		}
		extent.flush();

	}

	public static String MenuName() {
		
		return Page2Objecets.menuName().getText();
	}
	
	
	/*
	 * WebElement
	 * search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	 * search.click(); search.sendKeys(choise); WebElement
	 * clicking=driver.findElement(By.
	 * xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
	 * act.click(clicking).build().perform();
	 */

	/*
	 * public static void userBox(String name) { String
	 * user=Page2Objecets.checking_Username().getText();
	 * if(name.equalsIgnoreCase(user)) { System.out.println("pass"); } else
	 * System.out.println("Fail"); }
	 */

}
