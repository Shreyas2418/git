package selenium_files;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manual_creating_httpLink_and_enter_name {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/ADMIN/Desktop/http.html");
			driver.findElement(By.xpath("/html/body/form/input")).sendKeys("shreyas");
	}
}
