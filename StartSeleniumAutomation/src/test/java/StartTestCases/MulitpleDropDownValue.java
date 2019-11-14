package StartTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MulitpleDropDownValue {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		
		List<WebElement> value = driver.findElements(By.tagName("option"));
		System.out.println("Total Values are\t" +value.size());
		
		for(int i=0; i<value.size();i++) {
			System.out.println("Index\t"+(i+1)+"\tAttribute Value\t"+value.get(i).getAttribute("lang")+"\tValue\t"+value.get(i).getText());
		}
		driver.quit();
	}

}
