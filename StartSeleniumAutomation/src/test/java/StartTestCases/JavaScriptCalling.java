package StartTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptCalling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()");
		
		js.executeScript("arguments[0].style.border='3px solid red'",driver.findElement(By.xpath("//input[@id='mySubmit']")));
		System.out.println("Script executed successfully");
		//driver.quit();
		
		
		

	}

}
