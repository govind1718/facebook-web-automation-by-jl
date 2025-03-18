package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextConcepts {
	
	WebDriver driver =null;
	
	public void openBrowser()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/send_keys");
	
	}
	
	public void email()
	{ 
	WebElement emailEle = driver.findElement(By.id("email"));
	emailEle.sendKeys("govind@123");		
	}
	public void append()
	{ 
	WebElement appedEle = driver.findElement(By.name("press"));
	appedEle.sendKeys("virat");		
	}
	public void defaultTextMethod()
	{ 
	WebElement defaultEle =	driver.findElement(By.name("default"));
	String defaultValue = defaultEle.getDomAttribute("value");
	System.out.println(defaultValue);			
	}
	public void clear()
	{
	WebElement clearEle =	driver.findElement(By.name("clear"));
	clearEle.clear();
	}
	
	
	public static void main(String[] args) {
		
		TextConcepts obj = new TextConcepts();
		obj.openBrowser();
		obj.email(); 
		obj.append();
		obj.defaultTextMethod();
		obj.clear();
		
		
		
		
		
	}

}
