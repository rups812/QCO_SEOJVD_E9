package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

	//1.double click
	public void doubleClickProcess(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void rightClickProcess(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement ele1, WebElement ele2) {
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	public void implicitWait(WebDriver driver,int time) {
	 driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	public void explicitWait(WebDriver driver,int time,WebElement ele) {
		 WebDriverWait wait=new WebDriverWait(driver,time);
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	//SkillraryEcommerce_E9
	
}
