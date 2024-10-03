package learnSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://only-testing-blog.blogspot.com/");
	  // get window handle 
	 String windownhandl= driver.getWindowHandle();
	 System.out.println(windownhandl);
	  
	  //TAke a Screenshot
	
	 TakesScreenshot ts = ((TakesScreenshot)driver); 
	  File fle = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(fle, new File("./snap/Image3.png"));
	  
	
   driver.quit();
}
}