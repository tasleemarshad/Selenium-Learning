package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpath {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	 driver.findElement(By.id("APjFqb")).sendKeys("testing");
		List<WebElement> lst =	driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[2]/div[1]/div[1]/span[1]"));
		System.out.println("Total number of suggestion: " +lst.size());
		for(int i=0 ; i<lst.size(); i++) {
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().contains("testing techniques"));
			break;
		}
		
	
		

}
}