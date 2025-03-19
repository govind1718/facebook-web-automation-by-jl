package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

    WebDriver driver =null;
public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/alert");
	}

//hlo govi
	
	public void alertOk() throws InterruptedException
	
	{
		WebElement normalAlertEle= driver.findElement(By.id("int001"));
		normalAlertEle.click();
		
		Alert al =driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		
	}
       
	public void alertCancel() throws InterruptedException
      
	{
		WebElement disEle= driver.findElement(By.id("int003"));
		disEle.click();
		
		Alert disal =driver.switchTo().alert();
		Thread.sleep(3000);
		disal.dismiss();	
	}
	public void alertInputPromt() throws InterruptedException
    
	{
		WebElement inputEle= driver.findElement(By.name("prompt"));
		inputEle.click();
		
		Alert iputs =driver.switchTo().alert();
		iputs.sendKeys("govind");
		Thread.sleep(3000);
		iputs.accept();	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		AlertConcept obj =new AlertConcept();
		obj.openBrowser();
		//obj.alertOk();
		//obj. alertCancel();
		obj.alertInputPromt();
		
	}
}
