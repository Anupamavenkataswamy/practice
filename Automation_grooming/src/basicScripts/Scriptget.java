package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scriptget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com");
		//String title = driver.getTitle();
		//System.out.println(title);
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		String page = driver.getPageSource();
		System.out.println(page);
		//driver.get("https://www.instagram.com");
		//driver.getcurrenturl
		//driver.quit();
		System.out.println("hello");
		

	}

}
