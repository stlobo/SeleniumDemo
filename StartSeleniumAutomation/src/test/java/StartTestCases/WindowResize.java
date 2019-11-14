package StartTestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowResize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		
		int maxWidth = driver.manage().window().getSize().getWidth();
		int maxHeight = driver.manage().window().getSize().getHeight();
		
		System.out.println("Max Height of the broswer is\t" +maxHeight+ "\tWidth of the broser is\t" +maxWidth);
		
		for(int i=100, j=100; i<=maxWidth && j<=maxHeight; i++,j++) {
			
			Dimension d = new Dimension(i,j);
			driver.manage().window().setSize(d);	
			i=i+4;
			j=j+4;
		}
		
		driver.quit();
	}

}
