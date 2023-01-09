package com.automation.testcases;

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

public class ExcelUtils {

    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        
        File file = new File("C:\\Users\\A247622\\Desktop\\SeleniumSelfPractice\\Practice.xlsx");
        FileInputStream fis = new FileInputStream(file);
        
        Workbook wb = WorkbookFactory.create(fis);
        Sheet s = wb.getSheet("Sheet1");
        
        
//        Row r = s.getRow(0);
//        Cell c = r.getCell(0);
//        String data = c.getStringCellValue();
        
//        String data = s.getRow(0).getCell(0).toString();
//        System.out.println(data);
        
        int rowCount = s.getPhysicalNumberOfRows();
        int cellCount = s.getRow(0).getPhysicalNumberOfCells();
        
        System.out.println(rowCount+" "+cellCount);
        
        for(int i = 0;i<rowCount;i++){
            for(int j=0;j<cellCount;j++){
                
//                String data = s.getRow(i).getCell(j).toString();
//                System.out.print(data+" ");
                
                Cell c = s.getRow(i).getCell(j);
                DataFormatter dt = new DataFormatter();
                String data = dt.formatCellValue(c);
                System.out.print(data+" ");
            }
            System.out.println();
        }
        

    }

}
