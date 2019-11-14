package StartTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartLaunch {
		
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumhq.org");
		
		
		
		String title=driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		driver.quit();
	}
	
	
}
