package learnSelenium;


import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SeleniumPratices {


	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver" , " C:\\Users\\tasleem.arshad\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("gparent_1")).sendKeys("GP01");
		driver.findElement(By.id("parent_1")).sendKeys("Prnt01");
		driver.findElement(By.id("child_1")).sendKeys("ch01");
		
		driver.findElement(By.id("gparent_2")).sendKeys("GP02");
		driver.findElement(By.id("parent_2")).sendKeys("Prnt02");
		driver.findElement(By.id("child_2")).sendKeys("ch02");
		
		//driver.findElement(By.linkText("Facebook")).click();
		
	// hover me	
		WebElement tooltip = driver.findElement(By.cssSelector("#post-body-5701624569290716001 > div:nth-child(1) > div > a"));
		String tooltiptext =tooltip.getText();
		System.out.println(tooltiptext);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("text1")).sendKeys("ModelTown");
		driver.findElement(By.id("text2")).sendKeys("Pakistan");
		
		
driver.findElement(By.cssSelector("#post-body-3107268830657760720 > div:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(1) > input[type=checkbox]"))
	.click();
		
		
driver.findElement(By.cssSelector("#post-body-3107268830657760720 > div:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=checkbox]"))
.click();		
		

driver.findElement(By.linkText("Selectable")).click();

	WebElement selectvalue = driver.findElement(By.cssSelector("#selectable > li:nth-child(4)"));
	selectvalue.click();
	
// select the Slider range	
	WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	for (int i= 1; i<= 75;  i++) {
		slider.sendKeys(Keys.ARROW_RIGHT);
	}
		
	// Select the Calendar date
	Thread.sleep(1000);
	
	WebElement calendar = driver.findElement(By.xpath("//*[@id=\"datepicker\"]")); 
	calendar.click();
	driver.findElement(By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(5) > a")).click();
Thread.sleep(1000);
	//((JavascriptExecutor)driver).executeScript("document.getElementBycssSelector('#datepicker').setAttribute('value', 20 Aug 2024')");
	
	// Double click function
	
	Actions action = new Actions (driver);
	WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
	action.doubleClick(doubleClick).perform();
	
	// alert popup message print
	Alert alert = driver.switchTo().alert();
	String alertMesssage =driver.switchTo().alert().getText();
	System.out.println(alertMesssage);
	alert.accept();
	
	// Scroll down functionality

	JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");
	Thread.sleep(1000);
	
	// Verify the image
	WebElement image = driver.findElement(By.cssSelector("#post-body-7297556448793668582 > div:nth-child(1) > div.separator > a > img"));
	boolean flag = image.isDisplayed();
	System.out.println("Image is displayed : "+ flag);
	
	 driver.navigate().back(); 

	// Mul feature Mul
	
	driver.findElement(By.linkText("Mul")).click();
	driver.findElement(By.cssSelector("#post-body-3409116931169700903 > form > table > tbody > tr:nth-child(2) > td > input[type=button]:nth-child(6)"))
	.click();
	driver.findElement(By.cssSelector("#post-body-3409116931169700903 > form > table > tbody > tr:nth-child(2) > td > input[type=button]:nth-child(11)"))
	.click();
	driver.findElement(By.cssSelector("#post-body-3409116931169700903 > form > table > tbody > tr:nth-child(2) > td > input[type=button]:nth-child(4)"))
	.click();
	driver.findElement(By.cssSelector("#post-body-3409116931169700903 > form > table > tbody > tr:nth-child(2) > td > input[type=button]:nth-child(12)"))
	.click();
	driver.findElement(By.cssSelector("#post-body-3409116931169700903 > form > table > tbody > tr:nth-child(2) > td > input[type=button]:nth-child(16)"))
	.click();
	Thread.sleep(1000);	
	driver.navigate().back(); 
	
	//NEW TESTING 
	driver.findElement(By.linkText("New Testing")).click();
	driver.findElement(By.name("fname")).sendKeys("Tasleem");
	WebElement checkboxes =  driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > form:nth-child(5) > input[type=checkbox]:nth-child(7)"));
	checkboxes.click();
	
	WebElement gender =  driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > form:nth-child(5) > input[type=radio]:nth-child(13)"));
	gender.click();
	
	WebElement uploadImage = driver.findElement(By.name("img"));
	uploadImage.sendKeys("C:\\Users\\tasleem.arshad\\Desktop");
	
	Select selct = new Select(driver.findElement(By.name("FromLB")));
	selct.selectByIndex(0);
	
	driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > form:nth-child(8) > table > tbody > tr > td:nth-child(2) > input[type=button]:nth-child(1)"))
	.click();
	selct.selectByValue("Germany");
	driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > form:nth-child(8) > table > tbody > tr > td:nth-child(2) > input[type=button]:nth-child(1)"))
	.click();
	selct.selectByVisibleText("Malaysia");
	driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > form:nth-child(8) > table > tbody > tr > td:nth-child(2) > input[type=button]:nth-child(1)"))
	.click();
	
	driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > button:nth-child(10)")).click();
   	alert.dismiss();
    boolean result =driver.findElement(By.id("demo")).isDisplayed();
   	Assert.assertTrue(result, "ohoo ! you display wrong information");
   	Thread.sleep(1000);

   	driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > input[type=button]")).click();
   	String message= driver.switchTo().alert().getText();
	System.out.println(message);
	alert.accept();
	Thread.sleep(1000);
	
	
	WebElement elet = driver.findElement(By.cssSelector("#post-body-3647323225296998740 > div:nth-child(1) > button:nth-child(14)"));
	elet.click();
	Alert promptAlert =driver.switchTo().alert();
	String alertText =promptAlert.getText();
	System.out.println("Alert text is : "  +alertText);
	promptAlert.sendKeys("Prompt Test");
	Thread.sleep(1000);
	promptAlert.accept();
	Thread.sleep(1000);
	System.out.println(promptAlert);
	}
	
}