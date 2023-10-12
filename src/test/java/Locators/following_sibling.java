package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class following_sibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		//opens the edge driver
		WebDriver driver=new EdgeDriver();
		//maximizing statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles']/following-sibling::a[@data-csa-c-content-id='nav_cs_gb']")).click();

	}

}
