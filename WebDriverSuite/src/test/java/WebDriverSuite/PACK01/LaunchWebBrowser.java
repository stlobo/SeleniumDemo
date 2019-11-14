package WebDriverSuite.PACK01;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebBrowser {
	

	 public  static WebDriver driver; 
	 
	 public String getInputBrowserValue()
	 {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter the browser you want CH for Chrome, FF for Firefox and IE for Internet Explorer");
		 String inBrw = scn.nextLine();
		 return inBrw;
	 }
	 
	 
	 
	 public void Launch(String inbr){
		 if(inbr.equals("CH")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();}
		 
		 else if (inbr.equals("FF")){
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 else {
			 WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		 }
	 }
	 
	public static void main(String[] args) {
		
		
		LaunchWebBrowser lb = new LaunchWebBrowser();
		String BrowseValue = lb.getInputBrowserValue();
		lb.Launch(BrowseValue);
		driver.get("https://www.javatpoint.com/java-tutorial");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
