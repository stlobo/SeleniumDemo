package WebDriverSuite.PACK01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		List <WebElement> eles = driver.findElements(By.name("webform"));
		
		for(WebElement ele: eles){
			ele.click();
			if(ele.isSelected()){
				System.out.println("Element is selected");
			}
			else {
				System.out.println("Element is not selected");
			}
		}
		
		driver.quit();
	}

}
