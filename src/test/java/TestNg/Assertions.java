package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;

	@Test
	
	public void fb() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String title= driver.getTitle();
		//Hard Assert
		//Assert.assertEquals(title, "asdfgh");//false
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "asdfgh");//false
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void quiting() {
		driver.quit();
	}
}
