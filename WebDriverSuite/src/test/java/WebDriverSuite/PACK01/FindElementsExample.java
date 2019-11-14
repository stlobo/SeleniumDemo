package WebDriverSuite.PACK01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements\t"+elements.size());
		System.out.println("Radio Buttons on screen are:");
		
		for(WebElement ele:elements){
			System.out.println(ele.getAttribute("value"));
		}	
		
		driver.quit();
	}

}
