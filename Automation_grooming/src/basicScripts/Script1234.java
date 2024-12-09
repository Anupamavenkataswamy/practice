package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1234 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/new.html");
		WebElement usn=driver.findElement(By.id("t1"));
		usn.sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.id("t2"));
		psw.clear();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("c1"));
		ele1.click();
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.linkText("Amazon"));
		link.click();
		Thread.sleep(100);
		driver.close();

	}

}
