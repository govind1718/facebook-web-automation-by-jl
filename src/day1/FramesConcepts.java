package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcepts {
	WebDriver driver =null;
	public void openBrowser()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://playground.intellectsoftwareacademy.com/send_keys");
		}
		
		public void insideFrame()
		{
//			driver.switchTo().frame(0);
//			driver.switchTo().frame("frame2");
//			WebElement insideEle =driver.findElement(By.id("int191"));
//			insideEle.click();
			
			WebElement frameEle =driver.findElement(By.xpath("//iframe[@title='frame']"));
			driver.switchTo().frame(frameEle);
			
			WebElement insideEle =driver.findElement(By.id("int191"));
			insideEle.click();
			
			Alert at =driver.switchTo().alert();
			at.accept();
			
			driver.switchTo().defaultContent();
		}
		public void nestedFrame()
		{
			WebElement frameEle =driver.findElement(By.xpath("//iframe[@title='frame']"));
			driver.switchTo().frame(frameEle);
			
			WebElement insideEle =driver.findElement(By.id("int191"));
			insideEle.click();
			
			Alert at =driver.switchTo().alert();
			at.accept();
				
			driver.switchTo().parentFrame();
			
			driver.switchTo().frame("frame2");
			WebElement nestedEle =driver.findElement(By.id("int191"));
			nestedEle.click();
			
			driver.switchTo().defaultContent();
			
			
		}
		public void findnumberofFrame()
		{
		  List<WebElement> trotalframes = driver.findElements(By.tagName("iframe"));
		  int sz =trotalframes.size();
		  System.out.println(sz);
		}
		
		public static void main(String[] args) {

			FramesConcepts obj = new FramesConcepts();
			obj.openBrowser();
			obj.insideFrame();
			obj.nestedFrame();
			obj.findnumberofFrame();
			
			
			
		}

}
