package StartTestCases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabPopUpElement {

	public static void main(String[] args) {
		
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//1st Pop Up
		if(driver.findElement(By.xpath("//img[@class='popupCloseButton']")).isDisplayed()) {
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();}
		
		//Home Window 1st Window	
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();
		
		String FirstWindow = iterate.next();
		
		System.out.println("\tFirst Step Window \t");
		System.out.println(FirstWindow);
		
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		driver.manage().window().maximize();
	
		//Know More 2nd Window
		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		
		System.out.println("\tSecond Step Window \t");
		System.out.println(iterate.next());
		String SecondWindow = iterate.next();
		
		System.out.println(SecondWindow);
		
		driver.switchTo().window(SecondWindow);
		driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//a[1]")).click();
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//p[contains(text(),'Information on Contactless Debit Card -')]//a[contains(text(),'Click Here')]")).click();
		driver.findElement(By.xpath("//*[@id=\"customertab1\"]/div[1]/div[2]/p[5]/strong/a")).click();
		
		
		
		System.out.println("\tThird Step Window \t");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Customer Testimonials 3rd Window get title
		
		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		
		
		System.out.println("\tFourth Step Window \t");
		
		while(iterate.hasNext()) {
			
		String thirdWindow = iterate.next();
		driver.switchTo().window(thirdWindow);
		System.out.println(thirdWindow);
		}
		
		//System.out.println(driver.getTitle().contains("Debit_Card"));
		System.out.println(driver.getTitle().contains("Customer Testimonials"));
		
		driver.quit();	

	}

}
