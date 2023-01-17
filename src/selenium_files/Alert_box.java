package selenium_files;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/ADMIN/Desktop/alert.html");
			
			driver.findElement(By.xpath("/html/body/button")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
