package JavaStreamProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamNotepad {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		
		//create a file also use with .csv
		String fileName = new SimpleDateFormat("MM_dd_yyyy_HHmmss").format(new Date());
		File file = new File("C:\\Users\\SteffiL\\Desktop\\learning\\temp\\test_"+fileName+".txt");
		file.createNewFile();
		
		//write in the file
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter fileWriter = new BufferedWriter(fw);
		
		System.out.println("How many iterations you want???");
		int num=scn.nextInt();
		
		fileWriter.write("New Run\n");
		
		for(int i=0; i<=num;i++){
			int no = (int)(Math.random()*num);
			for(int j=no; j>=0;j--){
				
				fileWriter.write("*");
			}
			
			fileWriter.newLine();
		}
		
		fileWriter.flush();
		FileReader fr = new FileReader("C:\\Users\\SteffiL\\Desktop\\learning\\temp\\test_"+fileName+".txt");
		BufferedReader fileReader = new BufferedReader(fr);
		
		String line = null;
		
		while((line = fileReader.readLine()) != null)
		{
		System.out.println(line);
		}

}
}
