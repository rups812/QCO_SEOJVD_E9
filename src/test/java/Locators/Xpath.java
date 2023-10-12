package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		//opens the edge driver
		WebDriver driver=new EdgeDriver();
		//maximizing statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		//address of email text field using xpath attributes
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rups");
		//address of pass text field using xpath by contains attribute
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("rups123");
		Thread.sleep(3000);
		//address of forgotten password using xpath text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//address of forgotten pass using xpath text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
	}

}
