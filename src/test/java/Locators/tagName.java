package Locators;
//fetch all the links in a web page

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						//driver related statement
						WebDriverManager.edgedriver().setup();
						//opens the edge driver
						WebDriver driver=new EdgeDriver();
						//maximizing statement
						driver.manage().window().maximize();
						//it opens the application
						driver.get("https://www.facebook.com/");
						List<WebElement> allLinks = driver.findElements(By.tagName("a"));
						System.out.println(allLinks.size());
						for(WebElement b: allLinks) {
							System.out.println(b.getText());
						}
	}

}
