package StartTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchAll {

	public static String browser = "IE";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
		}
		else if(browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
			
		driver.get("https://www.msn.com/en-in");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		driver.quit();

	}

}
