package domain.company.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {

    public static ArrayList<Object[]> readDataFromExcel() throws EncryptedDocumentException, IOException {

        ArrayList<Object[]> al = new ArrayList<Object[]>();

        File src = new File("C:\\Users\\A247622\\Desktop\\SeleniumSelfPractice\\testdata.xlsx"); // go to file location

        FileInputStream fis = new FileInputStream(src); // FileInputStream</code> is meant for reading streams of raw bytes such as image data. For reading
                                                        // streams of characters, consider using <code>FileReader</code>.
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Sheet1");

        int rowcount = sheet.getPhysicalNumberOfRows();
        System.out.println("Total rows " + rowcount);

        int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Total columns " + columncount);

        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < columncount; j++) {
                String strdata = sheet.getRow(i).getCell(j).toString();

                Object[] ob = { strdata };

                al.add(ob);
            }
        }
        return al;

    }
}
