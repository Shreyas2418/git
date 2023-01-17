package selenium_files;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=24&product_id=40");
			String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[1]/h2")).getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
