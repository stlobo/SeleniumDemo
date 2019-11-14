package ObjectRepositoryDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileExample {

	public static void main(String[] args) throws IOException {
		
		//initialize the WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//Object Repository load
		Properties obj = new Properties();
		FileInputStream objFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ObjectRepositoryDemo\\config.properties");
		obj.load(objFile);
		
		//email id pass
		driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("testguru99@gmail.com");
		
		//signup
		driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		driver.navigate().back();
		
		
		//navigate to mobile testing xpath in properties file
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(obj.getProperty("MobileTesting")))).click();
		driver.quit();
	}

}
