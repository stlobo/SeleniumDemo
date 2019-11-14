package WebDriverSuite.PACK01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\SteffiL\\Documents\\demo\\file1.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		System.out.println("File uploaded successfully");
		
		//driver.quit();

	}

}
