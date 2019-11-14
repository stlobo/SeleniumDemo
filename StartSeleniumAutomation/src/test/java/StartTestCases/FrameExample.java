package StartTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		List<WebElement> frames = driver.findElements(By.tagName("iFrame"));
		
		System.out.println("Total number of frames in the page are \t" +frames.size());
		
		for(WebElement iframe: frames) {
			System.out.println(iframe.getAttribute("id"));
		}
		
		driver.quit();
	}

}
