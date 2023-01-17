package selenium_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_cars {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/ADMIN/Desktop/cars.html");
			WebElement element = driver.findElement(By.xpath("//*[@id='cars']"));
			Select s = new Select(element);
			s.selectByIndex(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
