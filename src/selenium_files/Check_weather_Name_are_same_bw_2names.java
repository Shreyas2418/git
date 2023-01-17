package selenium_files;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_weather_Name_are_same_bw_2names {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.imdb.com/title/tt9389998/");
			String t1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[1]/div/ul/li/a")).getText();
			String t2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[3]/div/ul/li[1]/a")).getText();
			
			driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
			String t3 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[3]/td/a")).getText();
			String t4 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[6]/td/div/ul/li[1]/a")).getText();
			
			if(t1.equalsIgnoreCase(t3) && t2.equalsIgnoreCase(t4)) {
				System.out.println("same");
			}else {
				System.out.println("not same");
			}
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
