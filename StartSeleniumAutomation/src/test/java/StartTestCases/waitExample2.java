package StartTestCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitExample2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252F%253Fgl%253DIN%2526tab%253Dr10&hl=en&flowName=GlifWebSignIn&flowEntry=AddSessionhttps://accounts.google.com/ServiceLogin/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252F%253Fgl%253DIN%2526tab%253Dr10&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys("steffviolet@gmail.com");
		System.out.println("Found and filled the username Field");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierNext\"]/span/span"))).click();
		System.out.println("Next");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("stef1");
		System.out.println("Entered Password");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]/span"))).click();
	
		System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[2]/div[2]/span")).getText());
		driver.quit();
	}

}
