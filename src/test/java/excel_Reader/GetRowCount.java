package excel_Reader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class GetRowCount {

	 public static void main(String[] args) throws IOException {
	        String filePath = "C:\\Selenium\\New_Project\\src\\main\\resources\\TestData.xlsx";
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = WorkbookFactory.create(fis);

	        Sheet sheet = workbook.getSheet("login"); // Get the first sheet

	        int rowCount = sheet.getLastRowNum();
	        System.out.println("Row count: " + rowCount);

	        workbook.close();
	        fis.close();
	    }

	}


