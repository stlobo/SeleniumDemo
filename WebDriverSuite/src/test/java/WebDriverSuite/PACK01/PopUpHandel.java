package WebDriverSuite.PACK01;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandel {

	public static void main(String[] args) {
		
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				driver.get("http://hdfcbank.com");
				driver.manage().window().maximize();
				
				System.out.println("----Generating window ids from first window----");
				Set<String> winids = driver.getWindowHandles();
				Iterator<String> iterate = winids.iterator();

				String first_window = iterate.next();
				System.out.println("First PopUp Window\t"+first_window);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
				
				js.executeScript("window.scrollBy(0,1000)");
				WebElement block = driver.findElement(By.xpath("//div[18]//ul[1]"));
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				block.findElement(By.xpath("//span[contains(text(),'Linkedin')]")).click();
				System.out.println("Navigate to linkedin\t");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Set<String> wids = driver.getWindowHandles();
				Iterator<String> itr = wids.iterator();
				
				String second_win = itr.next();
				System.out.println("Second PopUp Window\t"+second_win);
				driver.findElement(By.xpath("//a[contains(text(),'OK')]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Set<String> wi = driver.getWindowHandles();
				Iterator<String> it = wi.iterator();
				
				String thirdWin = it.next();
				
				System.out.println("Third PopUp Window\t" +thirdWin);
				
				System.out.println(driver.getTitle());
				driver.quit();

	}

}
