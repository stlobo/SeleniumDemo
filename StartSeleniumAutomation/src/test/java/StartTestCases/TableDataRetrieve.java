package StartTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableDataRetrieve {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		System.out.println("The number of rows are \t"+row.size());
		System.out.println("The number of columns are \t"+col.size());
		
		for(int i=1;i<=row.size();i++)
		{
			for(int j=1;j<=col.size();j++)
			{
				System.out.print("\t\t"+driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			
			System.out.println();
		}
		
		driver.quit();
		
	}

}
