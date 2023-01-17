package selenium_files;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {
	public static void main(String[] args)throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Forgotten account?")).click();
			Thread.sleep(3000);
			Set<String> win = driver.getWindowHandles();
			Object[] arr = win.toArray();
			driver.switchTo().window(arr[1].toString());
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
                                                                                                                 