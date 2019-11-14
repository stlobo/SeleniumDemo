package ObjectRepositoryDemo;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XMLFileExample {

	public static void main(String[] args) throws DocumentException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//Reading from xml file
		File inputFile = new File(System.getProperty("user.dir")+"\\src\\test\\java\\ObjectRepositoryDemo\\config.xml");
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(inputFile);
		
		String mobiletesting = document.selectSingleNode("//menu/mobiletesting").getText();
		String email = document.selectSingleNode("//menu/email").getText();
		String signup = document.selectSingleNode("//menu/signup").getText();
		
		//email id pass
		driver.findElement(By.id(email)).sendKeys("testguru99@gmail.com");
		
		//signup
		driver.findElement(By.id(signup)).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		driver.navigate().back();
		
		//navigate to mobile testing xpath in properties file
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(mobiletesting))).click();
		driver.quit();
		
	}

}
