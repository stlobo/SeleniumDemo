package WebDriverSuite.PACK01;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserResize {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	        
	        for(int i=500;i<=900;i=(i+10)){
	            Dimension d = new Dimension(i,i);
	            driver.manage().window().setSize(d);
	        }
	        driver.quit();
	    }
	
	}