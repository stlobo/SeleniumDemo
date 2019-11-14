package JavaStreamProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HTMLStreamProject {


	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		
		String fileName = new SimpleDateFormat("MM_dd_yyyy").format(new Date());
		File file = new File("C:\\Users\\SteffiL\\Desktop\\learning\\temp\\test_"+fileName+".html");
		file.createNewFile();
		
		//Write in html file
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("<html><head><title>Automation</title></head><body><h1>Heading for file</h1><p>The following word uses an <u>underlined</u> typeface.</p></body></html>");
		writer.close();
		System.out.println("File is created");
		
		//read from file
		
		File file1 = new File("C:\\Users\\SteffiL\\Desktop\\learning\\temp\\test_"+fileName+".html");
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		String NewLine = null;
		
		while((NewLine=br.readLine())!=null){
			
			System.out.println(NewLine);
		}
	}

}
