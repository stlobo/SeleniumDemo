package StartTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		}
		catch(Throwable t) {
			return false;
		}
		
	}
	
	public static boolean isElementPresent1(By by) {
		int size = driver.findElements(by).size();
		if (size == 0) {
			return false;
		}
		else{
			return true;
		}
			
	}

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//div[6]/input[2]")).click();
		//driver.findElement(By.xpath("//div[4]/input[3]")).click();
		
		/*for(int i=1;i<=4;i++)
		{
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		}*/
		int i=1,j=1;
		int count1 =0,count2=0;
		/*
		while(isElementPresent("//div[4]/input["+i+"]")){
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			count1++;
			i++;
		}	
		System.out.println("Marked\t" +count1+ "\tCheckBoxes div 4 in this run");
		
		while(isElementPresent1(By.xpath("//div[4]/input["+j+"]"))) {
			driver.findElement(By.xpath("//div[4]/input["+j+"]")).click();
			count2++;
			j++;
			
		}
		System.out.println("Marked\t" +count2+ "\tCheckBoxes div 6 in this run");
		
		
		List<WebElement> checkboxes = driver.findElements(By.name("sports"));
		
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
		*/
		
		WebElement block = driver.findElement(By.xpath("//div[4]"));
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		for(WebElement checkbox : checkboxes ) {
			checkbox.click();
			
		}
	
		System.out.println("Total number of checkboxes marked in this run is \t"+checkboxes.size());
		
		
		//driver.quit();
		

	}

}
