package Log4j;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jProject {
	
	public static Logger Log = Logger.getLogger(Log4jProject.class.getName());
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.setProperty("current.date",d.toString().replace(":","_").replace(" ","_"));
		
		PropertyConfigurator.configure("./src/test/java/Log4j/log4j.properties");
		
		Log.debug("This is Debug Log");
		Log.error("This is error Log");
		Log.info("This is info message");
		

	}

}
