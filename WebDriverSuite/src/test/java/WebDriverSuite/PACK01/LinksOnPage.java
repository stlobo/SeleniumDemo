package WebDriverSuite.PACK01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksOnPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement block = driver.findElement(By.xpath("//div[@class='central-featured']"));
		List <WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println("Total number of links on the central section of the page is \t" +links.size());
		
		for(WebElement ele: links){
			System.out.println("URL\t"+ele.getAttribute("href")+"\tText\t"+ele.getText());
		}
		
		System.out.println("Privacy Policy URL\t"+driver.findElement(By.linkText("Privacy Policy")).getAttribute("href"));
		System.out.println("Commons Attribution URL\t"+driver.findElement(By.partialLinkText("Commons Attribution")).getAttribute("href"));
		
		driver.quit();
	}

}
