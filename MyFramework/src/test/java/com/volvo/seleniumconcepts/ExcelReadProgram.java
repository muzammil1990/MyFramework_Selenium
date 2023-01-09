package com.volvo.seleniumconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadProgram {

    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        // System.setProperty("webdriver.chrome.driver", "C://Users//A247622//Downloads//SeleniumAutomation//ChromeSetup.exe");
        // WebDriver driver = new ChromeDriver();
        //
        // driver.get("http://www.google.com");

        // to access the file from the location
        File file = new File("C:/Users/A247622/Desktop/SeleniumSelfPractice/Practice.xlsx");

        FileInputStream fis = new FileInputStream(file); // FileInputStream</code> is meant for reading streams of raw bytes such as image data. For reading
                                                         // streams of characters, consider using <code>FileReader</code>
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Sheet1");

        /*
         * Row r = sheet.getRow(0);
         *  Cell c = r.getCell(1);
         *   String data= c.getStringCellValue();
         */

        // replacing above three lines with single line of code
/*
        String data= sheet.getRow(0).getCell(2).toString();
        System.out.println(data);
        String data2= sheet.getRow(1).getCell(1).getStringCellValue(); // error: java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
        System.out.println(data2);
*/
       
        
        // printing entire cellvalue.

        int rowCount = sheet.getPhysicalNumberOfRows();
        // int cellCount = s.getRow(0).getLastCellNum();
        System.out.println("Total rows " + rowCount);
        
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Total columns " + colCount);

        for (int i = 0;i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String data = sheet.getRow(i).getCell(j).toString();
                System.out.print(data + " ");
                
            }
            System.out.println();
        }

        // printing entire cell value using DataFormatter class

        /*
         * int rowCount = s.getPhysicalNumberOfRows();
         * int cellCount = s.getRow(0).getLastCellNum();
         * System.out.println(rowCount + " " + cellCount);
         * 
         * for (int i = 0; i < rowCount; i++) {
         *  for (int j = 0; j < cellCount; j++) {
         * 
         * Cell c = s.getRow(i).getCell(j);
         *  DataFormatter df = new DataFormatter();
         *   String data = df.formatCellValue(c); 
         *   System.out.print(data + " "); }
         * System.out.println(); }
         */
    }
}
