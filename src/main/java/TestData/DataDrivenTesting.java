package TestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDrivenTesting {
	
	public static void main(String []args ) throws EncryptedDocumentException, IOException, InterruptedException {

//FileInputStream f1 = new FileInputStream("C:\\Users\\tasleem.arshad\\eclipse-workspace\\SeleniumLearnBasic\\TestData\\LoginTest.xlsx");
// Workbook w1 = WorkbookFactory.create(f1);
// String username = w1.getSheet("ddt").getRow(1).getCell(0).getStringCellValue();
// String password = w1.getSheet("ddt").getRow(1).getCell(1).getStringCellValue();
 // System.out.println(username);
//  System.out.println(password);

		
 	String projectpath = System.getProperty("user.dir");
 	System.out.println(projectpath);
 	
 	XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\tasleem.arshad\\eclipse-workspace\\SeleniumLearnBasic\\TestData\\LoginTest.xlsx");
 	XSSFSheet sheet = workbook.getSheet("ddt");
 	int rowCount= sheet.getPhysicalNumberOfRows();
 	for (int rowNumber=1; rowNumber<rowCount; rowNumber++) {
 		String username = sheet.getRow(rowNumber).getCell(0).getStringCellValue();
 	    String password = sheet.getRow(rowNumber).getCell(1).getStringCellValue(); 	
 	    System.out.println(username+ " " +password );
 	    
 	   WebDriver driver = new ChromeDriver();
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	   driver.manage().window().maximize();
 	   driver.get("https://www.saucedemo.com/");
 	   driver.findElement(By.id("user-name")).sendKeys(username);
 	   driver.findElement(By.id("password")).sendKeys(password);
 	   driver.findElement(By.id("login-button")).click();
 	   Thread.sleep(1000);
 	   
 	}
 	


   


	}
}