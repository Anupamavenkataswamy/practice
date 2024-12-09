package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

public class Scree {
	public static void main(String[]args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ref=nav_logo");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./Screenshots/Defect2.png");
	FileHandler.copy(temp, perm);
	driver.quit();
	}
}
