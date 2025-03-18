package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {
    WebDriver driver =null;
public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/send_keys");
	}
	
	public void javascriptExecute()
	{
		WebElement next=driver.findElement(By.xpath("//span[text()='next']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.excuteScript("arguments[0].scrollIntoView(true);",next);
		js.excuteScript("arguments[0].setAttribute('style','background:yellow;border:5x solid red;');",next);
		System.out.println(next.getText());
		Thread.sleep(5000);
		js.excuteScript("arguments[0].click();",next);
		next.click();
		
	}
	public void loginhidebutton()  //interview deploy some error hidelogin button
	{
		
		js.excuteScript("arguments[0].click();",next);
	}
	
	public void inputWithoutsendkeys()  //interview
	{
		WebElement next=driver.findElement(By.xpath("//span[text()='next']"));
		js.excuteScript("arguments[0].setAttribute('value','balamurugan')",inputField);		
	}
	
	public static void main(String[] args) {

		JavascriptExecutor obj = new JavascriptExecutor();
		obj.openBrowser();
		obj.javascriptExecute();
		obj.loginhidebutton();
		obj.inputWithoutsendkeys();
		
		
		
	}
}
