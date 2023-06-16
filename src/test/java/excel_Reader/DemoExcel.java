package excel_Reader;

import java.io.FileInputStream;

import java.io.IOException;

 

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.Reporter;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DemoExcel {
	@Test(dataProvider = "getData")

    public void data(String s1, String s2) {

        Reporter.log(s1+"   - "+s2,true);

        

    }

   
    public String[][] readMultipleDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException

    {

        FileInputStream fis = new FileInputStream("C:\\Selenium\\New_Project\\src\\main\\resources\\TestData.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

       Sheet sh = wb.getSheet(sheetName);

        int lastRow = sh.getLastRowNum();

        int lastCell = sh.getRow(0).getLastCellNum();



        String[][] data = new String[lastRow][lastCell];



        DataFormatter df=new DataFormatter();

        for(int i=0;i<lastRow;i++)

        {

            for(int j=0;j<lastCell;j++)

            {

                data[i][j]=df.formatCellValue( sh.getRow(i+1).getCell(j));

                

            }

        }



        return data;



    }

    

    

    @DataProvider

    public Object[][] getData() throws EncryptedDocumentException, IOException

            {

             

                Object[][] data =readMultipleDataFromExcel("login");

                return data;

        }

}
