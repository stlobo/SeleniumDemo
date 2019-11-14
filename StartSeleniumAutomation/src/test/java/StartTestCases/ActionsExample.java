package StartTestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2automation");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='g']//div//div//div[@class='rc']//h3[@class='LC20lb'][contains(text(),'Way2Automation')]"))).click();
		
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Practice site 1"))).click();
		
		
		driver.quit();
	}

}
