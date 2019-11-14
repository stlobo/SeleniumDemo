package StartTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement draggingElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		action.dragAndDrop(draggingElement, droppableElement).perform();
		System.out.println("Drag Drop is complete");
		//driver.quit();
	}

}
