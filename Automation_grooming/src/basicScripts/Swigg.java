package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class Swigg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.swiggy.com");
		WebElement serch  = driver.findElement(By.xpath("//span[text()='Search']"));
		serch.click();
		Thread.sleep(2000);
		WebElement enter  = driver.findElement(By.xpath("//input[@type ='text']"));
		enter.sendKeys("Biryani");
		//Thread.sleep(000);
//		WebElement chi  = driver.findElement(By.xpath("//input[@value='Chicken Biryani']"));
//		chi.click();
		
		
}

}
