package excel_Reader;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

	public class GetCellCount {
	    public static void main(String[] args) {
	        try {
	            
	            FileInputStream file = new FileInputStream("C:\\Selenium\\New_Project\\src\\main\\resources\\TestData.xlsx");
	            Workbook workbook = WorkbookFactory.create(file);
	            
	            Sheet sheet = workbook.getSheetAt(0);

	           
	            Row row = sheet.getRow(1);
	            Cell cell = row.getCell(1);

	           //retrive cell data based on its type
	            String cellValue;
	            if (cell.getCellType() == CellType.NUMERIC) {
	                cellValue = String.valueOf(cell.getNumericCellValue());
	            } else if (cell.getCellType() == CellType.STRING) {
	                cellValue = cell.getStringCellValue();
	            } else if (cell.getCellType() == CellType.BOOLEAN) {
	                cellValue = String.valueOf(cell.getBooleanCellValue());
	            } else if (cell.getCellType() == CellType.BLANK) {
	                cellValue = "";
	            } else {
	                cellValue = "";
	            }

	            System.out.println("Cell value: " + cellValue);

	           
	            workbook.close();
	            file.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	


