package StartTestCases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotCaptureElement {
	
	public static WebDriver driver;
	
	public static void captureFullPageScreenshot() throws IOException {
		
		//Using System Date for file name
		Date dt = new Date();
		String fileName = dt.toString().replace(":", "_").replace(" ", "_")+".jpg";
		String fullPic = "FullPic"+fileName;
		
		
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //capture screenshot 
		FileUtils.copyFile(screenshot, new File(".//screenshot//"+fullPic));} //copy to location & append system date with file name
	
	public static void captureSelectedElement(WebElement ele) throws IOException{
		
		//Using System Date for file name
		Date dt = new Date();
		String fileName = dt.toString().replace(":", "_").replace(" ","_")+".jpg";
		String elementPic = "ElePic"+fileName; 
		
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //capture screenshot 
		BufferedImage fullImg = ImageIO.read(screenshot); //read full image  
		
		//location of the element
		Point point = ele.getLocation();
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();
		
		//Cropping Sub Image and writing it in a File 
		BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "jpg", screenshot);
		
		
		File screenshotLocation = new File(".//screenshot//"+elementPic); //capture screenshot 
		FileUtils.copyFile(screenshot, screenshotLocation); //copy to location & append system date with file name
	}
	                                                                                                                                                                                                                                     
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement ele = driver.findElement(By.xpath("//html//body//div//table//tbody//tr//td//table//tbody//tr//td//table//tbody//tr//td//table//tbody//tr//td//p//img"));
		
		captureFullPageScreenshot();
		captureSelectedElement(ele);
		
		driver.quit();
	}
	
}
