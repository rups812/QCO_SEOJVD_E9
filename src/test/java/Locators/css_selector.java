package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the edge driver
		WebDriver driver=new EdgeDriver();
		//maximizing statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		//address of email tf
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rups");

	}

}
