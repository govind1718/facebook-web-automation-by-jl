package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotConcept {
	
	WebDriver driver =null;
	public void openBrowser()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://playground.intellectsoftwareacademy.com/screenshot");
		}
		
		public void screenshots() throws IOException
		{
			
		  File fl = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fl,new File("./Screenshot/govind.png"));
		}
		public void screenshotElement() throws IOException
		{
			WebElement textEle =driver.findElement(By.xpath("//a[@href='screenshot']"));
		  File fl =textEle .getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(fl,new File("./Screenshot/govind12.png"));
		}
		
		public static void main(String[] args) throws IOException {

			ScreenshotConcept obj = new ScreenshotConcept();
			obj.openBrowser();
			obj.screenshots();
			obj.screenshotElement();
			
			
			
		}

}
