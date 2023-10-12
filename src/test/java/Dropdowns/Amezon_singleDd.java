package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amezon_singleDd {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		
		//opens the edge driver
		WebDriver driver=new EdgeDriver();
		
		//maximizing statement
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//it opens the application
		driver.get("https://www.amazon.in/");
		
		WebElement dD = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//handling dropdowns
		Select s=new Select(dD);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());
		List<WebElement> all = s.getOptions();
		System.out.println(all.size());
		for(WebElement b:all) {
			System.out.println(b.getText());
		}
	
	}

}
