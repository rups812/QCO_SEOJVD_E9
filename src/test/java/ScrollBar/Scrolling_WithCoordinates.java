package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithCoordinates {

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
		//Address of career webelement
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		Point coOrdinates = career.getLocation();
		int x=coOrdinates.getX();
		int y=coOrdinates.getY();
		
		//downcasting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(3000);
		//career.click();
		js.executeScript("arguments[0].click();", career);
		
	}

}
