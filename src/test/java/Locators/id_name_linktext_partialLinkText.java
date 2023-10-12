package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_name_linktext_partialLinkText {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the edge driver
				WebDriver driver=new EdgeDriver();
				//maximizing statement
				driver.manage().window().maximize();
				//it opens the application
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				//address of email text field
				driver.findElement(By.id("email")).sendKeys("rt12hs");
				//address of password text field
				driver.findElement(By.name("pass")).sendKeys("pass123");
				//address of login button
				//driver.findElement(By.name("login")).click();
				Thread.sleep(3000);
				//address of create a page
				//driver.findElement(By.linkText("Create a Page")).click();
				//driver.findElement(By.partialLinkText("Create a")).click();
				driver.findElement(By.partialLinkText("Forgotten ")).click();
				
	}

}
