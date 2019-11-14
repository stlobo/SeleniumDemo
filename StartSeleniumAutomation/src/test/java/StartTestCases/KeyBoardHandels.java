package StartTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardHandels {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		/*Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();*/
		
		System.out.println("clicked on enter");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
