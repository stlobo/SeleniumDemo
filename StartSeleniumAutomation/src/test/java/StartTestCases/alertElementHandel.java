package StartTestCases;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertElementHandel {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.switchTo().frame("iframeResult");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/button"))).click();
		// Alert alert = driver.switchTo().alert(); 
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("Accepted Alert Message");
		driver.quit();
		
	}

}
