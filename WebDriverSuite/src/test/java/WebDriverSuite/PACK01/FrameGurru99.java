package WebDriverSuite.PACK01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameGurru99 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		driver.manage().window().maximize();
		
		List <WebElement> frameList = driver.findElements(By.tagName("iFrame"));
		
		System.out.println("Total number of frames on the page\t"+frameList.size());
		for(WebElement frameEle : frameList){
			System.out.println(frameEle);
		}
		driver.quit();
	}

}
