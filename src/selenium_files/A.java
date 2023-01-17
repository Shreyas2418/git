package selenium_files;


import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			//driver.manage().window().maximize();
			//Thread.sleep(1000);
			WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).click().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
