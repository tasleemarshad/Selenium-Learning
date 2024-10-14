package learnSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	 // get window handle 
	
	//  driver.get("https://only-testing-blog.blogspot.com/");
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	// String windownhandl= driver.getWindowHandle();
	 //System.out.println(windownhandl);
	 
	
	 // GET Window Handles
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	 String windownhandls= driver.getWindowHandle();
	 System.out.println(windownhandls);
	 
	 
	 
	 //Take a Screenshot
	
	 TakesScreenshot ts = ((TakesScreenshot)driver); 
	  File fle = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(fle, new File("./snap/Image3.png"));
	  
	
   driver.quit();
}
}