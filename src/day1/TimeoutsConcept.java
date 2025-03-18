package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutsConcept {
    WebDriver driver =null;
public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/send_keys");
	}
	
	public void implicitWait() //global timeout for all webelement
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void explicitWait() //wait timeout for single or specific webelement
	{
		WebElement submit= driver.findElement(By.name("dropdown1"));
		WebDriverWait  wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExceptedConditions.elementToBeClickable(submit));
		submit.click();
	}
	public void fluentWait() //similar for implicitwait but this timeout check every 10sec//not using
	{
		Wait<WebDriver> fluentWait =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30));
	}
	
	public static void main(String[] args) {

		TimeoutsConcept obj = new TimeoutsConcept();
		obj.openBrowser();
		obj.implicitWait();
		obj.explicitWait();
		obj.fluentWait();
		
		
		
	}
}
