package TestNGPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {

	 String excelFilePath="C:\\Users\\Hii\\Documents\\ReadData.xlsx";//"C:\Users\Hii\Documents\ReadData.xlsx"
	
	   FileInputStream fis=new FileInputStream(excelFilePath);
	   
	   //Workbook
	   XSSFWorkbook workbook=new XSSFWorkbook(fis);
	   
	   //Sheet
	   XSSFSheet sheet=workbook.getSheetAt(0);
	   
	   //Rows
	   
	   int rows=sheet.getLastRowNum();
	   int cols=sheet.getRow(1).getLastCellNum();
	   
	   for(int r=0;r<rows;r++) {
		   XSSFRow row=sheet.getRow(r);
		   
		   for(int c=0;c<cols;c++) {
			   XSSFCell cell=row.getCell(c);
			   switch(cell.getCellType()) {
			   case STRING: System.out.println(cell.getStringCellValue()); break;
			   case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
			   case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;

			   }
			   System.out.print("");
     
		   }
		   System.out.println();
	   }
	   
	   
	
	
	}

}
