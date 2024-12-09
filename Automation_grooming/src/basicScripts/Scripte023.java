package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripte023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
