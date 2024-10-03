package TestData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {
	
	public static void main(String []args ) throws EncryptedDocumentException, IOException {

FileInputStream f1 = new FileInputStream("C:\\Users\\tasleem.arshad\\eclipse-workspace\\SeleniumLearnBasic\\TestData\\LoginTest.xlsx");
Workbook w1 = WorkbookFactory.create(f1);
String username = w1.getSheet("ddt").getRow(1).getCell(0).getStringCellValue();
String password = w1.getSheet("ddt").getRow(1).getCell(1).getStringCellValue();

 System.out.println(username);
 System.out.println(password);


	}
}