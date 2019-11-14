package StartTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteUsingKeyboard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		/*
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Keys.chord(Keys.CONTROL+"a"));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Keys.chord(Keys.CONTROL+"c"));
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.chord(Keys.CONTROL+"v"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		
		*/
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		action.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		driver.findElement(By.xpath("//input[@name='password']")).click();
		action.keyDown(Keys.CONTROL).sendKeys("v").sendKeys(Keys.chord(Keys.ENTER)).build().perform();
		System.out.println("clicked on enter");
		System.out.println(driver.getTitle());
		driver.quit();
	

	}

}
