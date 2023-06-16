package excel_Reader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WithoutDP {
	
	public static void main(String[] args) throws IOException {
		
	String excelPath = "C:\\Selenium\\New_Project\\src\\main\\resources\\TestData.xlsx";
	
	FileInputStream fis = new FileInputStream(excelPath);// to read the data
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("login");
	
	
	int rows = sheet.getLastRowNum();
	int columns = sheet.getRow(1).getLastCellNum();
	
	for(int r = 1; r<=rows; r++) {
		XSSFRow row = sheet.getRow(r);
		for (int c = 0; c<columns; c++) {
		XSSFCell cell=row.getCell(c);
		DataFormatter df = new DataFormatter();
		String S = df.formatCellValue(cell);
		System.out.print(S);
		System.out.print("   ");
	}
	System.out.println();
	
	
}
	}	
	
	
		
	}
	

		
	
