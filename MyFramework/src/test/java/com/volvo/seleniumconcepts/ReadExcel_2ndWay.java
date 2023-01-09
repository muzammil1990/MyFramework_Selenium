
package com.volvo.seleniumconcepts;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/**
 * This pg is to read the data from excel; This is 2nd way of reading the data from excel
 */
public class ReadExcel_2ndWay {

    @Test
    public void readDataFromExcel() throws Exception {

        File src = new File("C:\\Users\\A247622\\Desktop\\SeleniumSelfPractice\\Practice.xlsx"); // go to file location

        FileInputStream fis = new FileInputStream(src); // FileInputStream</code> is meant for reading streams of raw bytes such as image data. For reading
                                                        // streams of characters, consider using <code>FileReader</code>.

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheetAt(0);

        int rowcount = sheet.getPhysicalNumberOfRows();
        System.out.println("Total rows " + rowcount);

        int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Total columns " + columncount);

        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < columncount; j++) {
                String data = sheet.getRow(i).getCell(j).toString();
                System.out.print("  " + data);
            }
            System.out.println();
        }

    }
}
