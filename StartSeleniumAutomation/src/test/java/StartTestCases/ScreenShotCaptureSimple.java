package StartTestCases;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotCaptureSimple {
	
	public static WebDriver driver;
	
	public static void captureScreenshot() throws Throwable{
		
		Date dt = new Date();
		String fileName = dt.toString().replace(":", "_").replace(" ","_")+".jpg"; 
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File (".//screenshot//"+fileName));
		
		//FileUtils.copyFile(screenshotFile, new File(".//screenshot//screenCapture.jpg"));
		
		
	}
	

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		captureScreenshot();
		
		
		driver.quit();
		

	}

}
