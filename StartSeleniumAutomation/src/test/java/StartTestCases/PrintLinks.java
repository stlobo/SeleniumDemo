package StartTestCases;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Printing all the links of the page");
		System.out.println("\nTotal number of links are\t"+links.size());
		
		for(WebElement link:links) {
		System.out.println(link.getText()+"\t Link URL \t"+link.getAttribute("href"));	
		
		}
		
		System.out.println("\n\nPrinting only the  links on a section of the page");
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
		List<WebElement> secLinks = block.findElements(By.tagName("a"));
		
		System.out.println("\nTotal Number of links in this section\t" +secLinks.size());
		for(WebElement secLink: secLinks) {
			System.out.println(secLink.getText()+"\t Section Link URL \t"+secLink.getAttribute("href"));
		}
			
		
		driver.quit();
			
	}

}
