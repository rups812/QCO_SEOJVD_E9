package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		//opens the edge driver
		WebDriver driver=new EdgeDriver();
		//maximizing statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.in/s?k=mobile&crid=1YKRWOU6WBVQZ&sprefix=mobile%2Caps%2C200&ref=nb_sb_noss_1");
		WebElement value = driver.findElement(By.xpath("//span[text()='Redmi 12C (Matte Black, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(value.getText());
	}

}
