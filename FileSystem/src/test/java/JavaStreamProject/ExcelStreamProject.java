package JavaStreamProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelStreamProject {
	
	public void writeExcel() throws IOException{
		//create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create sheet
		XSSFSheet sheet1 = workbook.createSheet("UserDetails");
		XSSFSheet sheet2 = workbook.createSheet("LoopDetails");
		
		//create header row for sheet1
		Row row0 = sheet1.createRow(0);
		
		//create and update cell header for sheet1
		Cell cellA = row0.createCell(0);
		cellA.setCellValue("Name");
		
		Cell cellB = row0.createCell(1);
		cellB.setCellValue("City");
		
		//create value row for sheet1
		Row row1 = sheet1.createRow(1);
		
		//create and update cell value for sheet1
		Cell cellC = row1.createCell(0);
		cellC.setCellValue("Reema");
		
		Cell cellD = row1.createCell(1);
		cellD.setCellValue("Mumbai");
		
		//Sheet2 details
		for(int r=0;r<10;r++){
			Row rw = sheet2.createRow(r);
			for(int c=0;c<10;c++){
				Cell cl = rw.createCell(c);
				cl.setCellValue((int)(Math.random()*c));}}
			
			
			//create stream
			String fileName = new SimpleDateFormat("MM_dd_yyyy_HHmmss").format(new Date());
			File f = new File("C:\\Users\\SteffiL\\Desktop\\learning\\temp\\test_"+fileName+".xlsx");
			FileOutputStream fs = new FileOutputStream(f);
			
			//writing workbook to output stream
			workbook.write(fs);
			
		
			System.out.println("Workbook is created and updated");
			workbook.close();
	}
	
	public void readExcel() throws IOException{
		String fileName = new SimpleDateFormat("MM_dd_yyyy_HHmmss").format(new Date());
		File f = new File("C:\\Users\\SteffiL\\Desktop\\learning\\temp\\test_"+fileName+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 =  workbook.getSheetAt(0);
		
		System.out.println("Single value read");
		Row row0 = sheet0.getRow(0);
		Cell cellA = row0.getCell(0);
		System.out.println(cellA);
		
		//enhanced for loop
		System.out.println("\nRead First Sheet Values\n");
		
		for(Row row : sheet0){
			for(Cell cell : row){
				
				CellType cellType = cell.getCellType();
				
				switch(cellType){
					case STRING:
						System.out.print("\t"+cell.getStringCellValue());
						break;
						
					case NUMERIC:
						System.out.print("\t"+cell.getNumericCellValue());
						break;
						
					case BOOLEAN:
						System.out.print("\t"+cell.getBooleanCellValue());
						break;
					
					case FORMULA:
						System.out.print("\t"+cell.getCellFormula());
						break;
						
					case ERROR:
						System.out.print("\t"+cell.getErrorCellValue());
						break;
						
					case _NONE:
						System.out.print("\tNo value");
						break;
						
					case BLANK:
						System.out.print("\tBlank Cell");
						break;}
			}}
				
				
				System.out.println("\nRead Second Sheet Values\n");
				Sheet sheet1 =  workbook.getSheetAt(1);
				
				for(Row row1 : sheet1){
					for(Cell cell1 : row1){
						
						CellType cellType1 = cell1.getCellType();
						
						switch(cellType1){
							case STRING:
								System.out.print("\t"+cell1.getStringCellValue());
								break;
								
							case NUMERIC:
								System.out.print("\t"+cell1.getNumericCellValue());
								break;
								
							case BOOLEAN:
								System.out.print("\t"+cell1.getBooleanCellValue());
								break;
							
							case FORMULA:
								System.out.print("\t"+cell1.getCellFormula());
								break;
								
							case ERROR:
								System.out.print("\t"+cell1.getErrorCellValue());
								break;
								
							case _NONE:
								System.out.print("\t No value");
								break;
								
							case BLANK:
								System.out.println("\t Blank Cell");
								break;}
					}}
	}
				
		

	public static void main(String[] args) throws IOException {
		
		ExcelStreamProject ex = new ExcelStreamProject();
		ex.writeExcel();
		ex.readExcel();
	
		}
	
	}
	
