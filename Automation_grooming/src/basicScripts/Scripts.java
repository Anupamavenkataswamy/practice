package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scripts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key ="webdriver.chrome.driver";
		String value = "./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();

	}

}
