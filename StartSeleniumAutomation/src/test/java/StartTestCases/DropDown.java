package StartTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		
	
		//select.selectByVisibleText("Eesti");
		
		select.selectByValue("ta");
		System.out.println("Selected Dropdown");
		System.out.println(select.getOptions().size());
	
		List<WebElement> dropdownList = driver.findElements(By.tagName("option"));
		for(WebElement ele: dropdownList){
			System.out.println(ele.getAttribute("lang"));
			System.out.println("\tText\t"+ele.getText());
			
		}
		
	 	/*
		for(WebElement ele : select.getOptions() ){
		System.out.println(ele.getText());
		
		}
		*/
		driver.quit();
		

	}

}
