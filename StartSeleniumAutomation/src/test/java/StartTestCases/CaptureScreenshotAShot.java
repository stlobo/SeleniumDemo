package StartTestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CaptureScreenshotAShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Full Page Screenshot
		Date dt = new Date();
		String fileName = dt.toString().replace(":", "_").replace(" ", "_")+".jpg";
		String fullImg = "FullImg_"+fileName;
		
		Screenshot screenshotFull = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshotFull.getImage(),"jpg", new File(".\\screenshot\\"+fullImg));
		
		//WebElement Screenshot
		WebElement ele = driver.findElement(By.xpath("//article[6]//div[1]//div[2]"));
		String eleImg = "EleImg_"+fileName;
		
		Screenshot screenshotEle = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver,ele);
		ImageIO.write(screenshotEle.getImage(),"jpg",new File(".\\screenshot\\"+eleImg));
		
		driver.quit();
	}

}
