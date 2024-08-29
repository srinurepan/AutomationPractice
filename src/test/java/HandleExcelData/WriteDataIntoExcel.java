package HandleExcelData;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook workbook=new XSSFWorkbook();
	
		 XSSFSheet sheet = workbook.createSheet("sheet1");  //create one sheet
	
	  XSSFRow row1=sheet.createRow(0);   //row1 create & write data
	
	  row1.createCell(0).setCellValue("hi");
	  row1.createCell(1).setCellValue("123");
	  row1.createCell(2).setCellValue("automation");
	 
	         //2 row data
	  XSSFRow row2=sheet.createRow(1);     //row2 create & write data
		
	  row2.createCell(0).setCellValue("welcome");
	  row2.createCell(1).setCellValue("123566");
	  row2.createCell(2).setCellValue("automation selenium");
	
	      //row3 data
	
	  XSSFRow row3=sheet.createRow(2);     //row2 create & write data
		
	  row3.createCell(0).setCellValue("welcome to java");
	  row3.createCell(1).setCellValue("1234");
	  row3.createCell(2).setCellValue("automation selenium with java");
	
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\ExcelData\\myFile.xlsx");
	
	workbook.write(file);
	workbook.close();
	file.close();
	}

}
